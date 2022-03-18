/**
 * 
 */
package com.desafiolatam.DAO;

import java.util.List;

import com.desafiolatam.modelo.Categoria;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */
public interface CategoriaDao {
	public Categoria buscarCategoria(int idCategoria);
	public List<Categoria> listarCategorias();

}
