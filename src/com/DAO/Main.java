package com.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Administrador;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo Java");
		
		
	
		 AdministradorDAO pp = new AdministradorDAO();		
		 
		 ArrayList<Administrador> lista = pp.getAdministrador();
		 System.out.println(lista.size());
		 
		 for(int i=0; i<= lista.size(); i++) {
			 System.out.println("entre al for");
			 
			 Administrador adm = lista.get(i);						 
	         
			 System.out.println(adm.getApellido()+ adm.getEmail());
	     }
	
		 
		//insertar();   //Prueba de instartar datos.
			
	}

	
	
	
	public static void insertar(){
		AdministradorDAO admdao = new AdministradorDAO();
		Administrador adm = new Administrador();
		adm.setLogin("vanecas");
		adm.setClave("123456");
		adm.setNombre("Vanessa");
		adm.setApellido("Caseres");
		adm.setEmail("caseres@gmail.com");
		adm.setCedula(33295008);
		adm.setTelefono(94740086);
		adm.setRol(true);
		
		admdao.crearAdmin(adm);
	}
	
}
