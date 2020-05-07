package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {

    @JsonProperty(value = "ItemName")
    private String ItemName;

    @JsonProperty(value = "Explain")
    private String Explain;

    @JsonProperty(value = "Result")
    private String Result;

    @JsonProperty(value = "Remarks")
    private String Remarks;

}
