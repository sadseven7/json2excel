package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 出入院记录
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
public class CheckIn {

    @JsonProperty(value = "CycleNo")
    private int CycleNo;

    @JsonProperty(value = "InRegDate")
    private String InRegDate;

    @JsonProperty(value = "InDate")
    private String InDate;

    @JsonProperty(value = "InRemarks")
    private String InRemarks;

    @JsonProperty(value = "OutRegDate")
    private String OutRegDate;

    @JsonProperty(value = "OutDate")
    private String OutDate;

    @JsonProperty(value = "OutRemarks")
    private String OutRemarks;

    @JsonProperty(value = "DataNo")
    private String DataNo;

}
