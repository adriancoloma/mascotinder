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
<title>Buscar Mascota</title>
<link rel="stylesheet" href="css/styles.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
           <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css"
	rel="stylesheet" />
<!-- Font Awesome -->
    <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
</head>
<body>

	<header>
		<div id="ubicacionLogo">
			<span class="logo">Mascot Tinder</span> <span id="listarMascotas"><a
				href="ListarMascotasController">Mis Mascotas</a></span>
		</div>
		<div id="ubicacionUsuario">
			<br> 
			<i class="bx bx-user bx-sm"></i> 
			<span class="encabezado">${persona.getNombre()}</span>
			<span class="encabezado"><a href="SalirController">Salir</a></span>
		</div>
	</header>
	
    <div class="enmarcar mx-auto">
        <div id="carouselExampleDark" class="carousel  slide" data-ride="carousel">

        

                <!--<c:forEach items="${pets[0].images}" var="img">
                        <c:choose>
                            <c:when test="${img.id == 1}">
                                <div class="carousel-item active">
                                    <img style="border-radius: 20px;" src="../jsp/imagenesmatch/1.jpg" class="d-block w-100" alt="next-slide">
                                    <div class="carousel-caption d-none d-md-block"></div>
                                    <h5>Nombre</h5>
                                    <p>Descripcion del perro</p>
                                </div>
                            </c:when>
                            <c:otherwise>
                                <div class="carousel-item active">
                                    <img style="border-radius: 20px;" src="../jsp/imagenesmatch/1.jpg" class="d-block w-100" alt="next-slide">
                                    <div class="carousel-caption d-none d-md-block"></div>
                                    <h5>Nombre</h5>
                                    <p>Descripcion del perro</p>
                                </div>
                            </c:otherwise>
                        </c:choose> 
			        </c:forEach>  -->

			<c:forEach items="${mascotas}" var="mascota">


				<div class="carousel-inner">

					<div class="carousel-item active">

						<img style="border-radius: 20px;" src="img/${mascota.getPathImagenes()[0]}"
							class="d-block w-100" alt="next-slide">
						<div class="carousel-caption d-none d-md-block"></div>
						<h5>${mascota.nombre()[0]}</h5>
						<p>${mascota.descripcion()[0]}</p>
					</div>
					<div class="carousel-item">
						<img style="border-radius: 20px;" src="img/${mascota.getPathImagenes()[0]}"
							class="d-block w-100" alt="next-slide">
						<div class="carousel-caption d-none d-md-block"></div>
						<h5>${mascota.nombre()[0]}</h5>
						<p>${mascota.descripcion()[0]}</p>
					</div>
					<div class="carousel-item">
						<img style="border-radius: 20px;" src="img/${mascota.getPathImagenes()[0]}"
							class="d-block w-100" alt="next-slide">
						<div class="carousel-caption d-none d-md-block"></div>
						<h5>${mascota.nombre()[0]}</h5>
						<p>${mascota.descripcion()[0]}</p>
					</div>

				</div>
			</c:forEach>
			<div >
                <button class="carousel-control-prev btn btn-primary " style="height: 60px; width: 60px; margin-top: 90%; margin-left: 20%; background-color: white" type="button" data-bs-target="#carouselExampleDark" >
                    <i class="bi bi-x-lg" style="font-size: 30px; color: red;"></i>
                </button>
                <h3 class="sub" style="margin-top: 22%; float: left; margin-left: 12%; text-align: center; font-size: x-large;">No me gusta</h3>
            </div>
        
            <div >
                <button class="carousel-control-next btn btn-primary " style="height: 60px; width: 60px; margin-top: 90%; margin-right: 20%; background-color: white" type="button" data-bs-target="#carouselExampleDark" >
                    <i class="bi bi-suit-heart-fill" style="font-size: 30px; color: rgba(100, 230, 117, 0.9); "></i>
                </button>
                <h3 class="sub" style="margin-top: 22%; float: right; margin-right: 17%; text-align: center; font-size: x-large;">Me gusta</h3>
            </div>
    </div>
    
    <div style="margin-top: 40%; margin-right: 90%">
        <!-- Like -->
        <button class="carousel-control-prev btn btn-primary position-absolute "  style="height: 30px; width: 40px; background-color:white; border: none; margin-left: 50%; margin-top: 44%;" type="button" data-bs-target="#carouselExampleDark"  id="pasa" data-bs-slide="next">
            <i class="bi bi-arrow-right" style="font-size: 18px; color: black;"></i>
        </button>
        <!-- DisLike -->
        <button class="carousel-control-next btn btn-primary position-absolute " style="height: 30px; width: 40px; background-color:white; border: none; margin-right: 50%; margin-top: 44%;"  type="button" data-bs-target="#carouselExampleDark"  id="retrocede" data-bs-slide="prev">
            <i class="bi bi-arrow-left" style="font-size: 18px; color: black;"></i>
        </button>
    </div>


    <script>
        
    </script>

	
</body>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>


</html>