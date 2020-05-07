package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 身体质量指数
 * <p>
 * Description:
 * </p>
 *
 * @author s7
 * @version v1.0.0
 * @date 2020-04-30
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bmi {

    @JsonProperty(value = "RecordType")
    private int RecordType;

    @JsonProperty(value = "CycleNo")
    private int CycleNo;

    @JsonProperty(value = "Weigh")
    private String Weigh;

    @JsonProperty(value = "Stature")
    private String Stature;

    @JsonProperty(value = "Bmi")
    private String Bmi;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

    @JsonProperty(value = "DataNo")
    private String DataNo;

}
