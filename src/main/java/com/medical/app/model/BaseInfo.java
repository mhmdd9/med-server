package com.medical.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "CORE_BASE_INFO")
@Data
public class BaseInfo extends BaseModel<Long> {

    private String title;
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "TOPIC_ID", nullable = false)
    private BaseInfoTopic topic;
}
