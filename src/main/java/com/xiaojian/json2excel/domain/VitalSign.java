package com.xiaojian.json2excel.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 生命体征监测
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
public class VitalSign {

    private int RecordType;

    private int CycleNo;

    private int No;

    private String PlanDate;

    private String SDate;

    private String EDate;

    private String Arm;

    private String Sbp;

    private String Dbp;

    private String Pr;

    private String R;

    private String T;

    private String Hr;

    private String Cs;

    private String Remarks;

    private String RecordDate;

    private String DataNo;

}
