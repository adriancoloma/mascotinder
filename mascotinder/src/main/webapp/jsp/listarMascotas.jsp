<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
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
<!-- Font Awesome -->
<link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
	rel="stylesheet">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>

<body>

	<%@include file="../templates/banner.html"%>
	<div class="franja">
		<div class="titulo">MIS MASCOTAS</div>
		<a class="registrar" href="InsertarMascotaController">Registrar</a>
	</div>
	<br>
	<br>
	<br>
	<c:if test = "${mascotas.size() == 0 }">
		<h1 style="text-align: center; color: red;">No tienes ingresada ninguna mascota aun</h1>
	</c:if>
	<c:forEach items="${mascotas}" var="mascota">
		<div class="cuadro">
			<div class="imgmascota">
				<img src="img/${mascota.getPathImagenes()[0]}">
			</div>
			<div class="mascota d-flex flex-column justify-content-around">
				<h3>${mascota.nombre}</h3>
				<div class="Descripcion">
					<br> <span>${mascota.descripcion}</span>

				</div>
				<br>
				<div>
					<div class="texto">
						<a class="vinculo text-decoration-none"
							href="EstablecerPreferenciasController?idMascota=${mascota.id}">PREFERENCIAS</a>
					</div>
					<div class="texto">
						<a class="vinculo text-decoration-none"
							href="MatchController?idMascota=${mascota.id}">MATCHS </a><i
							class="bx bxs-heart"></i>

						<!--Traer numero de match de la base de datos-->
					</div>
					<div class="texto">
						<a class="vinculo text-decoration-none"
							href="VerCatalogoController?idMascota=${mascota.id}">BUSCAR</a>
					</div>

				</div>
			</div>
		</div>
	</c:forEach>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>

</html>