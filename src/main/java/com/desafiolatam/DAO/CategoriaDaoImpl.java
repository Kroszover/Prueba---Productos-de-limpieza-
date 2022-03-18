/**
 * 
 */
package com.desafiolatam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.conexion.ConexionDataBase;
import com.desafiolatam.modelo.Categoria;


/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */
public class CategoriaDaoImpl implements CategoriaDao {
	private ConexionDataBase conn = new ConexionDataBase();
	private Connection conexion;
	private PreparedStatement pstm;
	private ResultSet rs;
	@Override
	public Categoria buscarCategoria(int idCategoria) {
			String sql = "SELECT * FROM categoria WHERE id_categoria = ?";
			Categoria categoria = new Categoria();
			conexion = conn.obtenerConexion();
			try {
				pstm = conexion.prepareStatement(sql);
				pstm.setInt(1, idCategoria);
				rs = pstm.executeQuery();
				
				if (rs.next()) {
			categoria.setIdCategoria(rs.getInt("id_categoria"));
			categoria.setNombreCategoria("nombre_categoria");
			
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return categoria;
	}

	@Override
	public List<Categoria> listarCategorias() {
		String sql = "SELECT * FROM categoria";
		List<Categoria> listaCategorias = new ArrayList <>();
		
		conexion = conn.obtenerConexion();
		try {
			pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				Categoria categoria = new Categoria();
		categoria.setIdCategoria(rs.getInt("id_categoria"));
		categoria.setNombreCategoria("nombre_categoria");
		listaCategorias.add(categoria);
		
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCategorias;
	}

}
