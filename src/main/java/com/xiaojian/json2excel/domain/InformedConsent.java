package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 签署知情同意书信息
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
public class InformedConsent {
    @JsonProperty(value = "PreachDate")
    private String PreachDate;
    @JsonProperty(value = "QuestionAndAnswer")
    private String QuestionAndAnswer;
    @JsonProperty(value = "IsSign")
    private int IsSign;
    @JsonProperty(value = "SignDate")
    private String SignDate;
    @JsonProperty(value = "DataNo")
    private String DataNo;

}
