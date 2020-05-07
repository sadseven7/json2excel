package com.xiaojian.json2excel.tests;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaojian.json2excel.domain.AllData;
import com.xiaojian.json2excel.domain.Inquiry;
import com.xiaojian.json2excel.domain.SubjectInfo;
import com.xiaojian.json2excel.utils.MapperUtils;
import lombok.SneakyThrows;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    public static int ii = 0;
    public static int iii = 0;

    @Test
    public void J2E() throws IOException {
        /*
         *  读取json文件数据
         */
        String jsonStr = "";
        FileReader reader = new FileReader("D:\\test\\test.json");
        BufferedReader br = new BufferedReader(reader);
        StringBuffer sb = new StringBuffer();
        String str = null;
        while ((str = br.readLine()) != null) {
            List<SubjectInfo> subjectInfos = null;
            sb.append(str);
        }
        br.close();
        reader.close();
        jsonStr = sb.toString();

        /*
         *  创建表
         */
        SXSSFWorkbook workbook = new SXSSFWorkbook();// 创建一个Excel文件
        SXSSFSheet sheet = workbook.createSheet("SubjectInfo");// 创建一个Excel的Sheet
        SXSSFRow titleRow = sheet.createRow(0);//创建表头

        //初始化表单list
        List<SXSSFSheet> sheetList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        Map<String,SXSSFSheet> detailsMap = new HashMap();

        //用于判断sheet是否对表头赋值
        List istitleList = new ArrayList();

//            SXSSFSheet sheet_Inquiry = workbook.createSheet("Inquiry");
//            SXSSFRow titleRow_Inquiry = sheet_Inquiry.createRow(0);

        /*
         *  数据处理
         */
        SubjectInfo subjectInfo = new SubjectInfo();
        //写标题标志位
        boolean flag = true;

        Field[] heads_subjectInfo = subjectInfo.getClass().getDeclaredFields();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONArray datas = jsonObject.getJSONArray("Data");

        for(int i = 0;i<datas.size();i++){
            try {
                SXSSFRow row = sheet.createRow(i + 1);
                Inquiry inquiry = new Inquiry();

//                    subjectInfo = MapperUtils.json2pojoByTree(datas.get(i).toString(),"SubjectInfo",SubjectInfo.class);

                JSONObject json  = datas.getJSONObject(i).getJSONObject("SubjectInfo");
                int j = 0;
                //主ID
                String Code = "";
                for (Map.Entry entry : json.entrySet()) {
                    Object key = entry.getKey();
                    Object velue = json.get(entry.getKey());
                    if(flag){
                        //写入标题
                        titleRow.createCell(j).setCellValue(key.toString());
                    }
                    //写入内容
                    if (velue != null){
                        row.createCell(j).setCellValue(velue.toString());
                    }
                    //存储主ID
                    if(key.toString().equals("Code")){
                        Code = velue.toString();
                    }
                    j++;
                }

                if(flag){
                    for (Map.Entry e : datas.getJSONObject(0).entrySet()) {
                        Object name = e.getKey();

                        if (!name.equals("SubjectInfo")){
                            SXSSFSheet sheet0 = workbook.createSheet(name.toString());// 创建一个Excel的Sheet
//                                SXSSFRow titleRow0 = sheet0.createRow(0);//创建表头

                            //两种有Details附属表的表，分别在其后建立xxx_Details表
                            if(name.equals("Screening")||name.equals("Inquiry")){
                                SXSSFSheet sheet1 = workbook.createSheet(name.toString()+"_Details");// 创建一个Excel的Sheet
                                detailsMap.put(name.toString()+"_Details",sheet1);
                            }

                            sheetList.add(sheet0);
                            nameList.add(name.toString());
                        }
                    }
                }

                for (int k=0 ;k<nameList.size();k++){
                    if (nameList.get(k).equals("Summary")){
                        buildSheetO(sheetList.get(k),nameList.get(k),datas,Code,i,istitleList);
                    }else {
                        buildSheetA(sheetList.get(k),detailsMap,nameList.get(k),datas,Code,i,istitleList);
                    }
                }


                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        // 输出Excel文件
        try {
            FileOutputStream output = new FileOutputStream("D:\\test\\out.xls");
            workbook.write(output);
            workbook.close();
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 构建外层主表的sheet
     * 节点为JSONArray
     */
    @SneakyThrows
    public void buildSheetA( SXSSFSheet sheet,Map detailsMap, String sheetName, JSONArray datas, String Code, int i, List istitleList){

        //创建行
        SXSSFRow row = sheet.createRow(i + 1);

        //第一列写入主ID（code）
        row.createCell(0).setCellValue(Code);

        if(datas.getJSONObject(i).getJSONArray(sheetName).size()>0) {
//                obj = MapperUtils.json2pojo(datas.getJSONObject(i).getJSONArray(sheetName).get(0).toString(), obj.getClass());
            JSONObject json = datas.getJSONObject(i).getJSONArray(sheetName).getJSONObject(0);


//                JSONObject json = (JSONObject) JSON.toJSON(obj);
//                System.out.println(json.toString());

            int j = 0;
            for (Map.Entry entry : json.entrySet()) {
                Object key = entry.getKey();
                Object velue = json.get(entry.getKey());
                if (!istitleList.contains(sheetName)) {
                    //写入标题
                    SXSSFRow titleRow = sheet.createRow(0);//创建表头
                    titleRow.createCell(0).setCellValue("Code");
                    titleRow.createCell(j + 1).setCellValue(key.toString());
                }
                //写入内容
                if (velue != null) {
                    if (key.toString().equals("Details")) {
                        String sheetName_Details = sheetName + "_Details";
                        row.createCell(j + 1).setCellValue("见" + sheetName_Details + "表");
                        SXSSFSheet sheet0 = (SXSSFSheet)detailsMap.get(sheetName_Details);
                        System.out.println(json.getJSONArray("Details"));

                        for(int k = 0 ;k<json.getJSONArray("Details").size();k++){
                            buildDetails_Sheet( sheet0, sheetName_Details, json.getJSONArray("Details"), Code, k, istitleList);
                            if(sheetName.equals("Inquiry")){
                                ii++;
                            }else {
                                iii++;
                            }
                        }
                    } else {
                        row.createCell(j + 1).setCellValue(velue.toString());
                    }
                }

                j++;
            }
            //第一次有数据，确认完成表头写入
            istitleList.add(sheetName);
        }
    }

    /*
     * 构建外层主表的sheet
     * 节点为JSONObject
     */
    @SneakyThrows
    public void buildSheetO( SXSSFSheet sheet, String sheetName, JSONArray datas, String Code, int i, List istitleList){

        //创建行
        SXSSFRow row = sheet.createRow(i + 1);

        //第一列写入主ID（code）
        row.createCell(0).setCellValue(Code);

        if(datas.getJSONObject(i).getJSONObject(sheetName).size()>0) {
//                obj = MapperUtils.json2pojo(datas.getJSONObject(i).getJSONArray(sheetName).get(0).toString(), obj.getClass());
            JSONObject json = datas.getJSONObject(i).getJSONObject(sheetName);


//                JSONObject json = (JSONObject) JSON.toJSON(obj);
//                System.out.println(json.toString());

            int j = 0;
            for (Map.Entry entry : json.entrySet()) {
                Object key = entry.getKey();
                Object velue = json.get(entry.getKey());
                if (!istitleList.contains(sheetName)) {
                    //写入标题
                    SXSSFRow titleRow = sheet.createRow(0);//创建表头
                    titleRow.createCell(0).setCellValue("Code");
                    titleRow.createCell(j + 1).setCellValue(key.toString());
                }
                //写入内容
                if (velue != null) {
                        row.createCell(j + 1).setCellValue(velue.toString());
                }

                j++;
            }
            //第一次有数据，确认完成表头写入
            istitleList.add(sheetName);
        }
    }


    /*
     * 构建普通json2excel（用于构建内层的Details表）
     * 简单JSONArray to excel
     */
    @SneakyThrows
    public void buildDetails_Sheet( SXSSFSheet sheet, String sheetName, JSONArray datas, String Code, int i, List istitleList) {
        //创建行
        SXSSFRow row;
        if(sheetName.equals("Inquiry_Details")){
            row = sheet.createRow(ii + 1);
        }else {
            row = sheet.createRow(iii + 1);
        }

        //第一列写入主ID（code）
        row.createCell(0).setCellValue(Code);

        if (datas.size() > 0) {
            JSONObject json = datas.getJSONObject(i);

            int j = 0;
            for (Map.Entry entry : json.entrySet()) {
                Object key = entry.getKey();
                Object velue = json.get(entry.getKey());
                if (!istitleList.contains(sheetName)) {
                    //写入标题
                    SXSSFRow titleRow = sheet.createRow(0);//创建表头
                    titleRow.createCell(0).setCellValue("Code");
                    titleRow.createCell(j + 1).setCellValue(key.toString());
                }
                //写入内容
                if (velue != null) {
                    row.createCell(j + 1).setCellValue(velue.toString());
                }
                j++;
            }
            //第一次有数据，确认完成表头写入
            istitleList.add(sheetName);
        }
    }
}
