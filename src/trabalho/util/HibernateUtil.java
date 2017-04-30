/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    public static SessionFactory factory;
//to disallow creating objects by other classes.
 
    private HibernateUtil() {
    }
//maling the Hibernate SessionFactory object as singleton
 
    public static synchronized SessionFactory getSessionFactory() {
 
        if (factory == null) {
            factory = new Configuration().configure("hibernate.cfg.xml").
                    buildSessionFactory();
        }
        return factory;
    }
}
