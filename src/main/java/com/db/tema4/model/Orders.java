package com.db.tema4.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Orders {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private Date orderDate;

    private Date shippedDate;

    @NotNull
    private String status;

    private String comments;

    @NotNull
    private int customerId;
}
