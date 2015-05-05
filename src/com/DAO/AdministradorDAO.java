package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Administrador;
import com.utiles.ConexionSQL;


public class AdministradorDAO {
	
	public void crearAdmin(Administrador adm){
		
		try
		{
			Connection con = ConexionSQL.getConnection();
			Statement st = null;
			st = con.createStatement();	
			String query = "insert into Administrador (login,clave,nombre,apellido,email,cedula,telefono,rol) values('" + adm.getLogin() + "','" + adm.getClave() + "','" + adm.getNombre() + "','" + adm.getApellido() + "','" + adm.getEmail() + "'," + adm.getCedula() + "," + adm.getTelefono() + "," + adm.getRol() + ")" ;
			ResultSet result = st.executeQuery(query);
			
		}
		catch(Exception e)
		{
			System.out.print("\n" + e.getMessage());			
		}
	}
	
	public ArrayList<Administrador> getAdministrador(){
		
		ArrayList<Administrador> listadm = new ArrayList<Administrador>();
		try
		{
			Connection con = ConexionSQL.getConnection();
			Statement st = null;
			st = con.createStatement();		
		
			//obtengo los administradores del sitio
			String query = "select * from Administrador";
			
			ResultSet result = st.executeQuery(query);
			
			while (result.next())
			{
				Administrador adm = new Administrador();
				adm.setLogin(result.getString("login"));
				adm.setNombre(result.getString("nombre"));
				adm.setApellido(result.getString("apellido"));
				adm.setCedula(result.getInt("cedula"));
				adm.setEmail(result.getString("email"));
				adm.setTelefono(result.getInt("telefono"));
				adm.setRol(result.getBoolean("rol"));
							
				listadm.add(adm);
			}					
		}
		catch(Exception e)
		{
			System.out.print("\n" + e.getMessage());
			return null;
		}
						
		return listadm;
	}
	
	
	
}
