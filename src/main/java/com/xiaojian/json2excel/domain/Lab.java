package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lab {


    @JsonProperty(value = "RecordType")
    private String RecordType;

    @JsonProperty(value = "CycleNo")
    private String CycleNo;

    @JsonProperty(value = "GatherDate")
    private String GatherDate;

    @JsonProperty(value = "ReceiveDate")
    private String ReceiveDate;

    @JsonProperty(value = "ReportDate")
    private String ReportDate;

    @JsonProperty(value = "ClassifyCode")
    private String ClassifyCode;

    @JsonProperty(value = "ClassifyName")
    private String ClassifyName;

    @JsonProperty(value = "ItemCode")
    private String ItemCode;

    @JsonProperty(value = "ItemName")
    private String ItemName;

    @JsonProperty(value = "ItemEName")
    private String ItemEName;

    @JsonProperty(value = "Result")
    private String Result;

    @JsonProperty(value = "Unit")
    private String Unit;

    @JsonProperty(value = "Reference")
    private String Reference;

    @JsonProperty(value = "Cs")
    private String Cs;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

}
