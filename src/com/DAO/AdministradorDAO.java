package com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Administrador;

public class AdministradorDAO {
	private EntityManager em = Persistence.createEntityManagerFactory("PSIG").createEntityManager();
	
	public void crearAdmin(Administrador adm) {		
		try {
			em.getTransaction().begin();
			em.persist(adm);
			em.getTransaction().commit();
			
			System.out.println("Admin creado correctamente");
			
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.print("\n" + ex.getMessage());
			throw ex;
		}
		finally{
			em.close();
		}
	}
	
}
