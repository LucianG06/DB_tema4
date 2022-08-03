package com.db.tema4.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customers {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String username;

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @NotNull
    private String phone;

    @NotNull
    private String address;

    @NotNull
    private String city;

    private String postalCode;

    @NotNull
    private String country;

}
