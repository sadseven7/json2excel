package com.xiaojian.json2excel.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 受试者信息
 * <p>
 * Description:
 * </p>
 *
 * @author s7
 * @version v1.0.0
 * @date 2020-04-30
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectInfo implements Serializable {


    private static final long serialVersionUID = -6475906788734680833L;

    /**
     * 系统唯一编码
     */
    @JsonProperty(value = "Code")
    private String Code;

    /**
     * 筛选号
     */
    @JsonProperty(value = "ScreeningNo")
    private String ScreeningNo;

    /**
     * 随机号、试验编号
     */
    @JsonProperty(value = "RandomNo")
    private String RandomNo;

    /**
     * 登记时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(value = "RegisterDate")
    private String RegisterDate;

    /**
     * 入组时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(value = "JoinDate")
    private String JoinDate;

    /**
     * 试验开始日期 (首次给药时间)
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(value = "StartDate")
    private String StartDate;


    @JsonProperty(value = "GroupName")
    private String GroupName;

    /**
     * 试验结束日期 (出组日期)
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(value = "EndDate")
    private String EndDate;

    /**
     * 姓名缩写
     */
    @JsonProperty(value = "Initial")
    private String Initial;

    /**
     * 性别
     */
    @JsonProperty(value = "Gender")
    private String Gender;

    /**
     * 出生日期
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(value = "Birthday")
    private String Birthday;

    /**
     * 年龄 (以登记时间计算)
     */
    @JsonProperty(value = "Age")
    private String Age;

    /**
     * 民族
     */
    @JsonProperty(value = "Nation")
    private String Nation;

    /**
     * 种族
     */
    @JsonProperty(value = "Race")
    private String Race;

    /**
     * 职业
     */
    @JsonProperty(value = "Job")
    private String Job;

    /**
     * 婚姻状况
     */
    @JsonProperty(value = "Marital")
    private String Marital;

    @JsonProperty(value = "DataNo")
    private String DataNo;

}
