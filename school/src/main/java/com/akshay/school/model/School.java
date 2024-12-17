package com.akshay.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
// import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
// @NoArgsConstructor
@Builder
public class School {

    @Id
    private Integer id;
    private String name;
    private String email;

}
