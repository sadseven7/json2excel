package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FollowUp {

    @JsonProperty(value = "RecordType")
    private String RecordType;

    @JsonProperty(value = "CycleNo")
    private String CycleNo;

    @JsonProperty(value = "Date")
    private String Date;

    @JsonProperty(value = "Mode")
    private String Mode;

    @JsonProperty(value = "Contents")
    private String Contents;

    @JsonProperty(value = "Response")
    private String Response;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

}
