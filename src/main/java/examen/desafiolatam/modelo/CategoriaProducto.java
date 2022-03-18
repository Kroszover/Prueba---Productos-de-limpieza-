package examen.desafiolatam.modelo;


/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */


public class CategoriaProducto {
	private Producto producto;
	private Categoria categoria;
	
	//Constructor Vacio.
	/**
	 * 
	 */
	public CategoriaProducto() {
		super();
	}

	//Constructor con parametros.
	/**
	 * @param producto
	 * @param categoria
	 */
	public CategoriaProducto(Producto producto, Categoria categoria) {
		super();
		this.producto = producto;
		this.categoria = categoria;
	}
	
	
	//GETTERS Y SETTERS
	

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	
	

}
