package com.medical.app.model.user;

import com.medical.app.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "USER_JOB_EXPERIENCE")
@Data
public class JobExperience extends BaseModel<Long> {

    private String instituteName;
    private String jobPosition;
    private Integer startingYear;
    private Integer endYear;
    private boolean isWorking;

    @ManyToOne
    @JoinColumn(name = "JOB_EXPERIENCE_ID", nullable = false)
    private User user;
}
