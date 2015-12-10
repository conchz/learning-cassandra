package com.github.dolphineor.main;

import com.github.dolphineor.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created on 2015-12-10.
 *
 * @author dolphineor
 */
public class KunderaCassandraExample {

    public static void main(String[] args) {
        User user = new User();
        user.setUserId("0001");
        user.setName("John");
        user.setGender(1);
        user.setAge(25);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cassandra_pu");
        EntityManager em = emf.createEntityManager();

        em.persist(user);
        em.close();
        emf.close();
    }
}
