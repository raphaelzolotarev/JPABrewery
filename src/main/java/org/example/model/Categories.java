package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
    @Id
    private int id;
    private String category;
}
