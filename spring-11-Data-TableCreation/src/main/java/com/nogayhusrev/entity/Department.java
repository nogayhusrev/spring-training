package com.nogayhusrev.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Department extends BaseEntity {

    private String department;
    private String division;
}
