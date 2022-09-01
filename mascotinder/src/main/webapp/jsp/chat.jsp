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
<title>Chat Mascota</title>
<link rel="stylesheet" href="css/styles.css">
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
   <form class="container" action="POST">
        <div class="row justify-content-center m-3">
            <div class="col-8">
                <h2 class="titulos my-5 px-0 text-start">Mensajes</h2>
            </div>
        </div>

        <div class="row justify-content-center m-3">
            <div class="col-8">
                <textarea type="text-area" class="form-control" rows="10"></textarea>
            </div>
        </div>
        <div class="row m-3 justify-content-center">
            <div class="col-6">
                <input class="form-control" type="text">
            </div>
            <div class="col-2">
                <button class="btn btn-primary">Enviar</button>
            </div>

        </div>

    </form>
</body>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>

</html>