/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author cuongdx
 */
public class HibernateUltils2 {

    public static SessionFactory getSessionFactory() {
//        try
//        {
        // Tạo đối tượng cấu hình.
        Configuration configuration = new Configuration();
       // Mặc định nó sẽ đọc cấu hình trong file hibernate.cfg.xml
        // Bạn có thể chỉ định rõ file nếu muốn:
        // configuration.configure("hiberante.cfg.xml");
        configuration.configure();

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        // Tạo đối tượng SessionFactory
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);
        return sessionFactory;
//        }
//        catch (Throwable ex)
//      {
//         System.err.println("Initial SessionFactory creation failed." + ex);
//         throw new ExceptionInInitializerError(ex);
//      }
    }

    public static void shutdown() {
       // Close caches and connection pools
        // Giải phóng cache và Connection Pools.
        getSessionFactory().close();
    }
}
