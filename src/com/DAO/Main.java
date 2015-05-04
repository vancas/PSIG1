package com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Administrador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Hola Mundo Java");
			insertar();
			
	}

	public static void insertar(){
		System.out.println("Admin2 creado correctamente");
		
			EntityManager   em = Persistence.createEntityManagerFactory("PSIG").createEntityManager();
			try {
			Administrador adm = new Administrador();
			adm.setLogin("vanecas");
			adm.setClave("123456");
			adm.setNombre("Vanessa");
			adm.setApellido("caseres");
			adm.setEmail("caseres@gmail.com");
			adm.setCedula(33295008);
			adm.setTelefono(94740086);
			adm.setRol(true);
			em.getTransaction().begin();
			em.merge(adm);
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
