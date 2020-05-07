package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CycleCheck {


    @JsonProperty(value = "CycleNo")
    private String CycleNo;

    @JsonProperty(value = "IsPass")
    private String IsPass;

    @JsonProperty(value = "ExclusionReasons")
    private String ExclusionReasons;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

    @JsonProperty(value = "Details")
    private String Details;

}
