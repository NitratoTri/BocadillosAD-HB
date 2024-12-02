package org.example.bocadillosadhb;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    /**
     * Creates and returns a Hibernate Session object.
     * 
     * This method configures Hibernate using the "hibernate.cfg.xml" file,
     * adds the Inmueble class as an annotated class, builds a SessionFactory,
     * and opens a new Session.
     * 
     * @return A new Hibernate Session object if successful, or null if an exception occurs.
     */
    public static Session creaSesion(){
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        //La siguiente línea la modificaré para adaptarla a cada proyecto
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(Pedido.class);
        configuration.addAnnotatedClass(Producto.class);
        SessionFactory sessionFactory = null;
        Session session = null;
        // Create Session Factory and auto-close with try-with-resources.
        try{
            sessionFactory = configuration.buildSessionFactory();
            // Initialize Session Object
            session = sessionFactory.openSession();

        }catch (Exception e){
            e.printStackTrace();
        }
        return session;
    }
}
