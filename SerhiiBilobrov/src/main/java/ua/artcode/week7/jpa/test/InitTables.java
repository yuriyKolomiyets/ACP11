package ua.artcode.week7.jpa.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by serhii on 23.01.16.
 */
public class InitTables {

    public static void main(String[] args) {
        // init configuration and create
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate-unit");
    }

}
