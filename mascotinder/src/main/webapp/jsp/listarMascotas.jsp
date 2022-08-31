<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Listar Mascota</title>
<link rel="stylesheet" href="css/styles.css">
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css"
	rel="stylesheet" />

</head>
<body>

	<header>
		<span class="titulo">Mascot Tinder</span>
	</header>
	<button>Registrar</button>
	<c:forEach items="${mascotas}" var="mascota">
		<div class="cuadro">
			<div class="imgmascota">
				<img src="img/${mascota.getPathImagenes()[0]}">
			</div>
			<div class="mascota">
				<h3>${mascota.nombre}</h3>
				<div class="Descripcion">
					<span>${mascota.descripcion}</span>

				</div>
				<br> <br>
				<div>
					<a class="preferencias"
						href="EstablecerPreferenciasController?idMascota="{mascota.id}>Preferencias</a>
					Match
					<!--Traer numero de match de la base de datos-->
					<a class="buscar" href="BuscarParejaController?idMascota="{mascota.id}>Buscar</a>
				</div>
			</div>
		</div>
	</c:forEach>

</body>
</html>