/**
 * 
 */
package examen.desafiolatam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examen.desafiolatam.conexion.ConexionDataBase;
import examen.desafiolatam.modelo.Producto;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */
public class ProductoDaoImpl implements ProductoDao {
	
	private ConexionDataBase conn = new ConexionDataBase();
	private Connection conexion; /*Conexion para conectarnos a la base de datos*/
	private PreparedStatement pstm; /*Para preparar y agregarle parametros a las sentencias SQL*/
	private ResultSet rs; /*Leer los datos provenientes de la base de datos, recorrer las filas y extraer datos.*/
	
	
//Se añaden los metodos no implementados.
	@Override
	public Producto buscarProducto(int idProducto) {
		String sql = "SELECT * FROM producto WHERE id = ?";
		Producto producto = new Producto();
		conexion = conn.obtenerConexion();
		try {
			pstm = conexion.prepareStatement(sql);
			pstm.setInt(1, idProducto);
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				producto.setIdProducto(rs.getInt("id_Producto"));
				producto.setNombreProducto(rs.getString("nombre_Producto"));
				producto.setPrecioProducto(rs.getInt("precio_Producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_Producto"));
				producto.setIdCategoria(rs.getInt("id_categoria_fk"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return producto;
	}

	@Override
	public List<Producto> listarProductos() {
		String sql = "SELECT * FROM producto";
		List<Producto> listaProductos = new ArrayList <>();
		conexion = conn.obtenerConexion();
		try {
			pstm = conexion.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while  (rs.next()) {
				Producto producto = new Producto();
				producto.setIdProducto(rs.getInt("id_Producto"));
				producto.setNombreProducto(rs.getString("nombre_Producto"));
				producto.setPrecioProducto(rs.getInt("precio_Producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_Producto"));
				producto.setIdCategoria(rs.getInt("id_categoria_fk"));
				listaProductos.add(producto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProductos;
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarProducto(int idProducto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int obtenerUltimoId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
