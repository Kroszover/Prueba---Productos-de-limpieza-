
package com.desafiolatam.DAO;

import java.util.List;

import com.desafiolatam.modelo.Producto;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */

public interface ProductoDao {
	
	//Definir operaciones/Metodos para la entidad Producto
	public Producto buscarProducto (int idProducto);
	public List<Producto> listarProductos();
	public boolean agregarProducto(Producto producto);
	public boolean modificarProducto(Producto producto);
	public boolean eliminarProducto(int idProducto);
	public int obtenerUltimoId()/*Metodo que se va a usar cada vez que agreguemos un producto.*/;

}
