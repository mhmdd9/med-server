package com.medical.app.model.user;

import com.medical.app.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity(name="USER_EDU_DEGREE")
@Data
public class EduDegree extends BaseModel<Long> {

    private String universityName;
    private EducationGrade grade;
    private String fieldOfStudy;
    private Integer startingYear;
    private Integer endYear;
    private boolean isStudying;
    private boolean isLatestDegree;

    @ManyToOne
    @JoinColumn(name = "EDU_DEGREE_ID", nullable = false)
    private User user;
}
