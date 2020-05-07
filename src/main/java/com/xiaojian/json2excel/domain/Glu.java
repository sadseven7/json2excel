package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Glu {

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
    private String  EDate;

    @JsonProperty(value = "Value")
    private String Value;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

}
