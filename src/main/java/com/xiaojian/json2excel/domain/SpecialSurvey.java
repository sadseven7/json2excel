package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecialSurvey {

    @JsonProperty(value = "RecordType")
    private String RecordType;

    @JsonProperty(value = "CycleNo")
    private String CycleNo;

    @JsonProperty(value = "Item")
    private String Item;

    @JsonProperty(value = "GatherSDate")
    private String GatherSDate;

    @JsonProperty(value = "GatherEDate")
    private String GatherEDate;

    @JsonProperty(value = "SDate")
    private String SDate;

    @JsonProperty(value = "EDate")
    private String EDate;

    @JsonProperty(value = "Result")
    private String Result;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

}
