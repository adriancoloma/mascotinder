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
	<div class="enmarcar mx-auto">
		<div id="carouselExampleDark" class="carousel  slide"
			data-ride="carousel">
			<c:set var="count" value="0" />
			<div class="carousel-inner">
				<c:forEach items="${mascotas}" var="mascota">
					<c:set var="count" value="${count + 1}" />

					<div class="carousel-item  ${count==1 ? 'active': ''}">
						<div class="carousel-item">
							<img style="border-radius: 20px;"
								src="img/${mascota.getPathImagenes()[0]}" class="d-block w-100"
								alt="next-slide">
							<div class="carousel-caption d-none d-md-block"></div>
							<h5>${mascota.nombre}</h5>
							<p>${mascota.descripcion}</p>
							<div style="margin-top: 40%; margin-right: 90%"
								class="d-flex justify-content-start align-items-center">
								<!-- Derecha-->
								<div class="order-1">
									<button
										class="carousel-control-prev btn btn-primary position-relative"
										style="height: 30px; width: 40px; background-color: white; border: none; margin-left: 165px; margin-top: 0;"
										type="button" data-bs-target="#carouselExampleDark" id="pasa"
										data-bs-slide="next">
										<i class="bi bi-arrow-right"
											style="font-size: 18px; color: black;"></i>
									</button>
								</div>
								<!-- Izquierda -->
								<div class="order-0">
									<button
										class="carousel-control-next btn btn-primary   position-relative"
										style="height: 30px; width: 40px; background-color: white; border: none; margin-right: 210px; margin-top: 0;"
										type="button" data-bs-target="#carouselExampleDark"
										id="retrocede" data-bs-slide="prev">
										<i class="bi bi-arrow-left"
											style="font-size: 18px; color: black;"></i>
									</button>
								</div>
							</div>
							<div>
								<div>
									<button class="carousel-control-prev btn btn-primary "
										style="height: 60px; width: 60px; margin-top: 90%; margin-left: 20%; background-color: white"
										type="button" data-bs-target="#carouselExampleDark">
										<i class="bi bi-x-lg" style="font-size: 30px; color: red;"></i>
									</button>
								</div>
								<div>
									<button class="carousel-control-next btn btn-primary "
										style="height: 60px; width: 60px; margin-top: 90%; margin-right: 20%; background-color: white"
										type="button" data-bs-target="#carouselExampleDark">
										<i class="bi bi-suit-heart-fill"
											style="font-size: 30px; color: rgba(100, 230, 117, 0.9);"></i>
									</button>
								</div>
							</div>
						</div>
					</div>


				</c:forEach>
			</div>
		</div>
	</div>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>