package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrugCombination {

    @JsonProperty(value = "DrugName")
    private String DrugName;

    @JsonProperty(value = "Dose")
    private String Dose;

    @JsonProperty(value = "Frequency")
    private String Frequency;

    @JsonProperty(value = "Route")
    private String Route;

    @JsonProperty(value = "Reason")
    private String Reason;

    @JsonProperty(value = "SDate")
    private String SDate;

    @JsonProperty(value = "SRecordDate")
    private String SRecordDate;

    @JsonProperty(value = "EDate")
    private String  EDate;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

}
