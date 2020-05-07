package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Exam {


    @JsonProperty(value = "RecordType")
   private String RecordType;

    @JsonProperty(value = "CycleNo")
   private String CycleNo;

    @JsonProperty(value = "ExamDate")
   private String ExamDate;

    @JsonProperty(value = "ReportDate")
   private String ReportDate;

    @JsonProperty(value = "ItemName")
   private String ItemName;

    @JsonProperty(value = "Result")
   private String Result;

    @JsonProperty(value = "Description")
   private String Description;

    @JsonProperty(value = "Cs")
   private String Cs;

    @JsonProperty(value = "Remarks")
   private String Remarks;

    @JsonProperty(value = "RecordDate")
   private String RecordDate;

}
