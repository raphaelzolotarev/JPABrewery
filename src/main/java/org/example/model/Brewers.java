package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brewers {
    @Id
    private int id;
    private String name;
    private String address;
    private int zipcode;
    private String city;
    private int turnover;
}
