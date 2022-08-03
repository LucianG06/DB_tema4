package com.db.tema4.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private String code;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private int stock;

    @NotNull
    private Double price;

}
