package com.tutorial.personnumberservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "number")
@NoArgsConstructor
@AllArgsConstructor
public class NumberPersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberPerson;
}


