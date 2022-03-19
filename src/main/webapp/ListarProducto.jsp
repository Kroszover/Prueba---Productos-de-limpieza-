<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Productos</title>
</head>
<body>
<h1>Listar Productos</h1>
<table>
<tr>
	<th>Nombre</th>
	<th>Precio</th>
	<th>Descripcion</th>
	<th>Categoria</th>
	<th>Acciones</th>
</tr>

<c:forEach items="${productos}" var="producto">
	<tr>
		<td>${producto.getProducto().getNombreProducto()}</td>
		<td>${producto.getProducto().getPrecioProducto()}</td>
		<td>${producto.getProducto().getDescripcionProducto()}</td>
		<td>${producto.getCategoria().getNombreCategoria()}</td>
		<td>
		<a href="ModificarProducto.jsp?id_producto=${producto.getProducto().getIdProducto()}">Modificar Producto</a>&nbsp;
		<a href="EliminarProducto.jsp?id_producto=${producto.getProducto().getIdProducto()}">Eliminar Producto</a>
		</td>
		
	</tr>
</c:forEach>


</table>
<a href="/Prueba_-_Productos_de_Limpieza">Volver al inicio</a>

</body>
</html>