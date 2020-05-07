package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 问诊信息
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
public class Inquiry {

    @JsonProperty(value = "RecordType")
    private int RecordType;

    @JsonProperty(value = "CycleNo")
    private int CycleNo;

    @JsonProperty(value = "Date")
    private String Date;

    @JsonProperty(value = "IsPass")
    private String IsPass;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;

    @JsonProperty(value = "Details")
    private List<Details> Details ;

    @JsonProperty(value = "DataNo")
    private String DataNo;

}
