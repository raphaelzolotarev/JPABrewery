package org.example.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static EntityManagerFactory emf;
    public static EntityManager entityManager;
    public static void dbConnection() {
        emf = Persistence.createEntityManagerFactory("database-configuration");
        entityManager = emf.createEntityManager();
    }
    public static void closeConnection(){
        emf.close();
        entityManager.close();
    }
}
