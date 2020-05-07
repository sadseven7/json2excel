package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary {

    private int Finish;

    private String Date;

    private String UnfinishedReason;

    private String IsAE;

    private String IsAESolve;

    private String AESolveReason;

    private String Summary;

    private String RecordDate;

    private String DataNo;

}
