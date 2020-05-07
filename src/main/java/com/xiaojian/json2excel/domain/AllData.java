package com.xiaojian.json2excel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllData {

    private SubjectInfo SubjectInfo;

    private List<AE> AE ;

    private List<Bmi> Bmi ;

    private List<CheckIn> CheckIn ;

    private List<CycleCheck> CycleCheck ;

    private List<Dine> Dine ;

    private List<Dose> Dose ;

    private List<DrugCombination> DrugCombination ;

    private List<Ecg> Ecg ;

    private List<Exam> Exam ;

//    private List<FaecesSampleGather> FaecesSampleGather ;

    private List<FollowUp> FollowUp ;

    private List<Glu> Glu ;

    private List<InformedConsent> InformedConsent ;

    private List<Inquiry> Inquiry ;

    private List<Lab> Lab ;

    private List<OtherExam> OtherExam ;

    private List<Physical> Physical ;

    private List<SampleGather> SampleGather ;

    private List<Screening> Screening ;

    private List<SpecialSurvey> SpecialSurvey ;

    private Summary Summary;

//    private List<UrineSampleGather> UrineSampleGather ;

    private List<VitalSign> VitalSign ;

}
