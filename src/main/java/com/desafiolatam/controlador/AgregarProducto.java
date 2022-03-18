package com.desafiolatam.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.DAO.CategoriaDao;
import com.desafiolatam.DAO.CategoriaDaoImpl;
import com.desafiolatam.DAO.ProductoDao;
import com.desafiolatam.DAO.ProductoDaoImpl;
import com.desafiolatam.modelo.Categoria;
import com.desafiolatam.modelo.Producto;


@WebServlet("/AgregarProducto")
public class AgregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductoDao productoDao = new ProductoDaoImpl();
	CategoriaDao categoriaDao = new CategoriaDaoImpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Categoria> categorias = categoriaDao.listarCategorias();
		
		request.setAttribute("categorias", categorias);
	
		request.getRequestDispatcher("AgregarProducto.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		
		
		
		String nombreProducto = request.getParameter("Nombre");
		int precioProducto = Integer.parseInt(request.getParameter("precio"));
		String descripcionProducto = request.getParameter("descripcion");
		int idCategoria = Integer.parseInt(request.getParameter("Categoria"));
	
		int id = productoDao.obtenerUltimoId() + 1;
		
		Producto producto = new Producto ();
		
		producto.setIdCategoria(id);
		producto.setNombreProducto(nombreProducto);
		producto.setPrecioProducto(precioProducto);
		producto.setDescripcionProducto(descripcionProducto);
		producto.setIdCategoria(idCategoria);
		
		productoDao.agregarProducto(producto);
		
		request.getRequestDispatcher("PaginaInicio.jsp").forward(request, response);
		
		
	}

}
