package com.medical.app.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "generator")
    private T id;

    private Date dateCreated;
    private Date dateUpdated;
}
