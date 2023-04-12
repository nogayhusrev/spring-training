package com.nogayhusrev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class Genre extends BaseEntity {

    private String name;
}
