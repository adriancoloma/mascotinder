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
<title>Match Mascota</title>
<link rel="stylesheet" href="../css/styles.css">
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
		<div class="titulo">MIS MATCHS</div>
	</div>
	<br>
	<br>
	<br>
	<c:if test = "${mascotas.size() == 0 }">
		<h1 style="text-align: center;">Esta mascota aun no tiene un match :(</h1>
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
				<div class="d-flex justify-content-center align-items-center">

					<div class="texto">

						<a class="vinculo text-decoration-none d-flex"
							href="ChatController?duenoMascota=${mascota.dueno.id}">
							<div>

								<i class='bx bxs-bell bx-xs bx-tada pe-1'></i>
							</div> CHATEAR
							<div class="d-flex flex-column justify-content-center ps-1">
								<i class='bx bxs-message'></i>
							</div>

						</a>
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
	<script src="https://kit.fontawesome.com/1dcb9ecca7.js"
		crossorigin="anonymous"></script>
</body>

</html>
