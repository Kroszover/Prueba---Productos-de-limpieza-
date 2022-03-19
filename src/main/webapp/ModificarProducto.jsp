<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Producto</title>
</head>
<body>
<h1>Modificar Producto</h1>
<form action="ModificarProducto" method="POST">
	<input type = "hidden" value="${producto.getId()" name="id_producto"/>
	<Label for = "nombre">Nombre</Label>
	<input type = "text" name= "nombre" id="nombre" value="${producto.getNombre()}"/>
	<Label for = "precio">Precio</Label>
	<input type = "number" name= "precio" id="precio" value= "${producto.getPrecio}"/>
	<Label for = "descripcion">Descripcion</Label>
	<input type = "text" name= "descripcion" id="descripcion" value="${producto.getDescripcion}"/>
	<Label>Categoria</Label>
	<select name="categoria" id="categoria">
	<c:forEach items="${categorias}" var= "categoria">
	<option value="${categoria.getId()}"
	
	${categoria.getId() == producto.getIdCategoria() ? 'selected' : ''}>${categoria.getNombre()}</option>
	</c:forEach>
	</select>
	<button type="submit">Enviar</button>
</form>
<a href="/Prueba_-_Productos_de_Limpieza">Volver al inicio</a>

</body>
</html>