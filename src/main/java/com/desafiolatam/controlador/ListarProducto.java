package com.desafiolatam.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.DAO.CategoriaProductoDao;
import com.desafiolatam.DAO.CategoriaProductoDaoImpl;
import com.desafiolatam.modelo.CategoriaProducto;

@WebServlet("/ListarProducto")
public class ListarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CategoriaProductoDao categoriaProductoDao = new  CategoriaProductoDaoImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Estamos en el servlet");
	List<CategoriaProducto>	 lista = categoriaProductoDao.listarCategoriaProducto();
	
	request.setAttribute("productos", lista);
	request.getRequestDispatcher("ListarProducto.jsp").forward(request, response);
		
	}

}
