
package enterprise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Main {

    public static void main(String[] args) {

        sessionFactory();
        Session session = sessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        /*
        Create a local "database" schema
        Enter your username and password to connect to the database
        in the XML file hibernate.cfg.xml and run the program
        Check database all entities must be created
         */

        transaction.commit();
        sessionFactory().close();
    }

    private static SessionFactory sessionFactory() {

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        MetadataSources metadataSources = new MetadataSources(registry);
        Metadata metadata = metadataSources.buildMetadata();

        return metadata.getSessionFactoryBuilder().build();
    }
}
