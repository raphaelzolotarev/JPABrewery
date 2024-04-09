package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Beers {
    @Id
    private int id;
    private String name;
    private int brewerid;
    private int categoryid;
    private double price;
    private int stock;
    private int alcohol;
    private int version;
    private UUID image;

}
