/**
 * 
 */
package com.desafiolatam.DAO;

import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.modelo.Categoria;
import com.desafiolatam.modelo.CategoriaProducto;
import com.desafiolatam.modelo.Producto;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */
public class CategoriaProductoDaoImpl implements CategoriaProductoDao {
	
	private ProductoDao productoDao = new ProductoDaoImpl();
	private CategoriaDao categoriaDao = new CategoriaDaoImpl ();
	

	@Override
	public List<CategoriaProducto> listarCategoriaProducto() {
		
		List <CategoriaProducto> lista = new ArrayList<>();
		List<Producto> listaProductos = productoDao.listarProductos();
		
		for (Producto producto: listaProductos) {
			Categoria categoria = categoriaDao.buscarCategoria(producto.getIdCategoria());
			
			CategoriaProducto categoriaProducto = new CategoriaProducto();
			categoriaProducto.setProducto(producto);
			categoriaProducto.setCategoria(categoria);
			System.out.println("nombre categoria:" + categoriaProducto.getCategoria().getNombreCategoria());
			System.out.println("Id = " + categoriaProducto.getCategoria().getIdCategoria());
			lista.add(categoriaProducto);
			
		}
	
		return lista;
	}

}
