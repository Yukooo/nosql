package it.discovery.hibernate.ogm.bootstrap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MongoStarter {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        try {
            emf = Persistence.createEntityManagerFactory("mongo");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            // Insert read/write operations

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (emf != null) {
                emf.close();
            }
        }
    }

}
