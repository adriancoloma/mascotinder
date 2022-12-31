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
<title>Document</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<link rel="stylesheet" href="../jsp/css/styles.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
</head>

<body>
	<%@include file="../templates/banner.html"%>
	<c:if test = "${mascotas.size() == 0 }">
		<h1 style="text-align: center; vertical-align: middle;">No se ha encontrado ninguna mascota que cumpla con tus preferencias</h1>
	</c:if>
	<div class="enmarcar mx-auto">
		<div id="carouselExampleDark" class="carousel  slide"
			data-ride="carousel">
			<c:set var="count" value="0" />
			<div class="carousel-inner">
				<c:forEach items="${mascotas}" var="mascota">
					<c:set var="count" value="${count + 1}" />

					<div class="carousel-item  ${count==1 ? 'active': ''}">
						<img style="border-radius: 20px; height: 300px;"
							src="img/${mascota.getPathImagenes()[0]}" class="d-block w-100"
							alt="next-slide">
						<div class="carousel-caption d-none d-md-block"></div>
						<h5>${mascota.nombre}</h5>
						<p>${mascota.descripcion}</p>
						<div>
							<form method="post" action="VerCatalogoController">
								<input type="hidden" name="accion" value="no_me_gusta">
								<input type="hidden" name="idMascota1" value="<%=request.getParameter("idMascota") %>">
								<input type="hidden" name="idMascota2" value="${mascota.id}">
								<button class="carousel-control-prev btn btn-primary "
									style="height: 60px; width: 60px; margin-top: 90%; margin-left: 20%; background-color: white"
									type="submit" data-bs-target="#carouselExampleDark">
									<i class="bi bi-x-lg" style="font-size: 30px; color: red;"></i>
								</button>
								<h3 class="sub"
									style="margin-top: 22%; float: left; margin-left: 12%; text-align: center; font-size: x-large;">
									No me gusta</h3>
							</form>

						</div>

						<div>
							<form method="post" action="VerCatalogoController">
								<input type="hidden" name="accion" value="me_gusta">
								<input type="hidden" name="idMascota1" value="<%=request.getParameter("idMascota") %>">
								<input type="hidden" name="idMascota2" value="${mascota.id}">
								<button class="carousel-control-next btn btn-primary "
									style="height: 60px; width: 60px; margin-top: 90%; margin-right: 20%; background-color: white"
									type="submit" data-bs-target="#carouselExampleDark">
									<i class="bi bi-suit-heart-fill"
										style="font-size: 30px; color: rgba(100, 230, 117, 0.9);"></i>
								</button>
							</form>

							<h3 class="sub"
								style="margin-top: 22%; float: right; margin-right: 17%; text-align: center; font-size: x-large;">
								Me gusta</h3>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<div style="margin-top: 40%; margin-right: 90%">
		<!-- Like -->
		<button
			class="carousel-control-prev btn btn-primary position-absolute "
			style="height: 30px; width: 40px; background-color: white; border: none; margin-left: 50%; margin-top: 44%;"
			type="button" data-bs-target="#carouselExampleDark" id="pasa"
			data-bs-slide="next">
			<i class="bi bi-arrow-right" style="font-size: 18px; color: black;"></i>
		</button>
		<!-- DisLike -->
		<button
			class="carousel-control-next btn btn-primary position-absolute "
			style="height: 30px; width: 40px; background-color: white; border: none; margin-right: 50%; margin-top: 44%;"
			type="button" data-bs-target="#carouselExampleDark" id="retrocede"
			data-bs-slide="prev">
			<i class="bi bi-arrow-left" style="font-size: 18px; color: black;"></i>
		</button>
	</div>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>