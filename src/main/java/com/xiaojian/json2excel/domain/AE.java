package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.poi.ss.formula.functions.EDate;

import javax.print.attribute.standard.Severity;

/**
 * 不良事件
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
public class AE {
    @JsonProperty(value = "Name")
    private String Name;
    @JsonProperty(value = "SDate")
    private String SDate;

    @JsonProperty(value = "Severity")
    private String Severity;

    @JsonProperty(value = "Feature")
    private String Feature;

    @JsonProperty(value = "Dose")
    private String Dose;

    @JsonProperty(value = "IsCure")
    private String IsCure;

    @JsonProperty(value = "IsQuit")
    private String IsQuit;

    @JsonProperty(value = "IsSAE")
    private String IsSAE;

    @JsonProperty(value = "SRecordDate")
    private String SRecordDate;

    @JsonProperty(value = "EDate")
    private String EDate;

    @JsonProperty(value = "LapseTo")
    private String LapseTo;

    @JsonProperty(value = "LapseToDate")
    private String LapseToDate;

    @JsonProperty(value = "Relationship")
    private String Relationship;

    @JsonProperty(value = "Remarks")
    private String Remarks;

    @JsonProperty(value = "RecordDate")
    private String RecordDate;


}
