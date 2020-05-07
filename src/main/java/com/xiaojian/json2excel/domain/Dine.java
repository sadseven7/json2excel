package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dine {

    @JsonProperty(value = "CycleNo")
    private String CycleNo;

    @JsonProperty(value = "Type")
    private String Type;

    @JsonProperty(value = "SDate")
    private String SDate;

    @JsonProperty(value = "EDate")
    private String EDate;

    @JsonProperty(value = "ResidueCalories")
    private String ResidueCalories;

    @JsonProperty(value = "ResidueRemarks")
    private String ResidueRemarks;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;


}
