package net.javaguides.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import net.javaguides.model.Document;
import net.javaguides.model.Faculty1;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getsessionFactory()
	{
		if(sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				
				Properties settings = new Properties();
				settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL,"jdbc:mysql://localhost:3305/hibernate_Db?useSSL=false");
				settings.put(Environment.USER,"root");
				settings.put(Environment.PASS,"root");
				settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.SHOW_SQL,"true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
				settings.put(Environment.HBM2DDL_AUTO,"update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Faculty1.class);
				ServiceRegistry registory = new StandardServiceRegistryBuilder()
								.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(registory);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
