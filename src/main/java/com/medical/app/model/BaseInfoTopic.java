package com.medical.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "CORE_BASE_INFO_TOPIC")
@Data
public class BaseInfoTopic extends BaseModel<Long> {

    private String title;
    private Integer code;
}
