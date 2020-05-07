package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;


/**
 * (预)筛选判断信息
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
public class Screening {

    private int ScreeningMark;

    private String ScreeningDate;

    private int IsPass;

    private String ExclusionReasons;

    private String RecordDate;

    private List<Details> Details ;

    private String DataNo;

}
