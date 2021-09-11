package com.medical.app.model.user;

import com.medical.app.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "APP_USER")
public class User extends BaseModel<Long> {

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    private UserType type;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private Integer nationalCode;
    private Gender gender;
    private String placeOfBirth;
    private Integer yearOfBirth;
    private ConfirmationStatus confirmationStatus;
    private Boolean isActive;
    private Integer photo;

}
