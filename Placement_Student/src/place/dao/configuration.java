package place.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class configuration {
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	static 
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU1");
		
	}
	public static EntityManager getEntityManager()
	{
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
		
	}

}
 