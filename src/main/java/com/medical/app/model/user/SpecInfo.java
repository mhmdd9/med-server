package com.medical.app.model.user;


import com.medical.app.model.BaseInfo;
import com.medical.app.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "USER_SPEC_INFO")
@Data
public class SpecInfo extends BaseModel<Long> {

    private String licenseNo;
    private LicenseType licenseType;
    private Grade grade;
    private CaseType acceptingCasesType;

    @OneToOne
    @MapsId
    private User user;

    @OneToMany
    private Set<BaseInfo> acceptingProvinces;

    @OneToMany
    private Set<BaseInfo> acceptingWorkTopics;
}
