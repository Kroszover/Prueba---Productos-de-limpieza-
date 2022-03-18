
package com.desafiolatam.modelo;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */

//Atributos de los objetos de las tablas

public class Producto {
	private int idProducto;
	private String nombreProducto;
	private int precioProducto;
	private String descripcionProducto;
	private int idCategoria;
	
	//Constructor vacio.
	/**
	 * 
	 */
	public Producto() {
		super();
	}
	
	
	//Constructor con parametros.
	/**
	 * @param idProducto
	 * @param nombreProducto
	 * @param precioProducto
	 * @param descripcionProducto
	 * @param idCategoria
	 */
	public Producto(int idProducto, String nombreProducto, int precioProducto, String descripcionProducto,
			int idCategoria) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.descripcionProducto = descripcionProducto;
		this.idCategoria = idCategoria;
	}

//GETTERS Y SETTERS.
	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}


	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}


	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	/**
	 * @return the precioProducto
	 */
	public int getPrecioProducto() {
		return precioProducto;
	}


	/**
	 * @param precioProducto the precioProducto to set
	 */
	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}


	/**
	 * @return the descripcionProducto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}


	/**
	 * @param descripcionProducto the descripcionProducto to set
	 */
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}


	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}


	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
