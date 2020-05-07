package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Physical {

    @JsonProperty(value = "RecordType")
    private String RecordType;
    @JsonProperty(value = "CycleNo")
    private String CycleNo;
    @JsonProperty(value = "Date")
    private String Date;
    @JsonProperty(value = "IsPass")
    private String IsPass;
    @JsonProperty(value = "Remarks")
    private String Remarks;
    @JsonProperty(value = "RecordDate")
    private String RecordDate;
    @JsonProperty(value = "Details")
    private String Details;


}
