
package com.desafiolatam.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */

/*Atributos de la conexion a la base de datos.*/
//Conexion en patron de diseño singleton.
public class ConexionDataBase {
	private static Connection conexion;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USUARIO = "pruebaproductos_limpieza";
	private static final String PASSWORD = "1234";
	
	
	/*Creacion del primer metodo*/
	private void crearConexion ()  {
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
			
			// Manejo de excepciones si no encuentra la clase
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	//Metodo publico para obtener la conexion del metodo privado de arriba
public Connection obtenerConexion() {
	if (conexion == null) {
		crearConexion();
	}
	return conexion;
	
}

}

