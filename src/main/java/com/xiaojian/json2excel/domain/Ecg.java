package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ecg {

    @JsonProperty(value = "RecordType")
    private String RecordType;
    @JsonProperty(value = "CycleNo")
    private String CycleNo;
    @JsonProperty(value = "No")
    private String No;
    @JsonProperty(value = "PlanDate")
    private String PlanDate;
    @JsonProperty(value = "SDate")
    private String SDate;
    @JsonProperty(value = "EDate")
    private String EDate;
    @JsonProperty(value = "Hr")
    private String Hr;
    @JsonProperty(value = "Pr")
    private String Pr;
    @JsonProperty(value = "Qrs")
    private String Qrs;
    @JsonProperty(value = "Qt")
    private String Qt;
    @JsonProperty(value = "Rr")
    private String Rr;
    @JsonProperty(value = "Qtc")
    private String Qtc;
    @JsonProperty(value = "Cs")
    private String Cs;
    @JsonProperty(value = "Remarks")
    private String Remarks;
    @JsonProperty(value = "ReportDate")
    private String ReportDate;
    @JsonProperty(value = "ReportResult")
    private String ReportResult;
    @JsonProperty(value = "RecordDate")
    private String RecordDate;


}
