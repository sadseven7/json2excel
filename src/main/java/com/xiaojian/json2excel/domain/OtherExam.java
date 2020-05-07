package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherExam {
    @JsonProperty(value = "RecordType")
   private String RecordType;
    @JsonProperty(value = "CycleNo")
   private String CycleNo;
    @JsonProperty(value = "Date")
   private String Date;
    @JsonProperty(value = "ExamName")
   private String ExamName;
    @JsonProperty(value = "ExamExplain")
   private String ExamExplain;
    @JsonProperty(value = "Result")
   private String Result;
    @JsonProperty(value = "Remarks")
   private String Remarks;
    @JsonProperty(value = "RecordDate")
   private String RecordDate;

}
