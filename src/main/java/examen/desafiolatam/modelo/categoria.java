/**
 * 
 */
package examen.desafiolatam.modelo;

/**
 * @author camilo Lavado
 * @date 18/03/2022
 * @version 1.0.0
 * @category Pruebas y Examenes
 *
 */

//Atributos de los objetos de las tablas
public class Categoria {
	//Atributos de clase
	private int idCategoria;
	private String nombreCategoria;

	//Constructor vacio.
	public Categoria() {
		super();
	}
	
	//Constructor con parametros.
	/**
	 * @param idCategoria
	 * @param nombreCategoria
	 */
	public Categoria(int idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}
	
	
	
	//GETTERS Y SETTERS.

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

	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	
	
}
