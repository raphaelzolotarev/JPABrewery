package org.example;

import org.example.connection.EntityManagerProvider;
import org.example.model.Beers;
import org.example.model.Brewers;
import org.example.model.Categories;

import static org.example.connection.EntityManagerProvider.entityManager;

public class Main {
    public static void main(String[] args) {
        EntityManagerProvider.dbConnection();
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(new Beers());
            entityManager.persist(new Brewers());
            entityManager.persist(new Categories());
            entityManager.getTransaction().commit();
        } finally {
            EntityManagerProvider.closeConnection();
        }
    }
}