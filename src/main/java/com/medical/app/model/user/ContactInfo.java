package com.medical.app.model.user;

import com.medical.app.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "USER_CONTACT_INFO")
public class ContactInfo extends BaseModel<Long> {

    private String province;
    private String city;
    private String homeAddress;
    private String homePostalCode;
    private String homePhone;
    private String workAddress;
    private String workPostalCode;
    private String workPhone;
    private String website;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;
}
