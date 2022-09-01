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
    <form action="POST" style="text-align: center;">
        <h2 class="titulos">Nueva Mascota</h2>
        <div>
            <p class="sub">Nombre</p>
            <input class="inputs" type="text" name="nombreMascota" placeholder="Nombre">
        </div><br>
        <div>
            <p class="sub">Descripcion</p>
            <input class="inputs" style="height: 60px;" type="text" name="descripcionMascota" placeholder="Descripcion">
        </div><br>
        <div>
            <div style="display: inline-block; padding-right: 50px; margin-left: 2.5%;" >
                <p class="sub">EDAD</p>
                <input type="number" style="width: 70px; height: 30px;" name="selectEdad">
                   
            </div>
            <div style="display: inline-block;">
                <p class="sub">TIPO</p>
                <select class="selects" style="width: 70px; height: 30px;" name="selectTipo">
                    <option value="Perro">Perro</option>
                    <option value="Gato">Gato</option>
                    <option value="Vaca">Vaca</option>
                </select>
            </div>
        </div><br>
        <div>
            <p class="sub">SEXO</p>
            <select class="selects" style="width: 12%; height: 30px;" name="selectSexo">
                <option value="M">Macho</option>
                <option value="F">Hembra</option>
            </select>
        </div><BR></BR>
        <div style="text-align: center;">
            <p class="sub">FOTOGRAF�A</p><br>
            <label for="files" class="btn inputs">Cargar Foto</label>
            <input id="files" class="inputs" style="visibility:hidden; padding-top: 0%; margin-left: 50%;" type="file" name="fotoMascota" placeholder="Foto" accept="image/png, image/jpeg"><br>
            <label for="files" class="btn inputs">Cargar Foto</label>
            <input id="files" class="inputs" style="visibility:hidden; padding-top: 0%; margin-left: 50%;" type="file" name="fotoMascota" placeholder="Foto" accept="image/png, image/jpeg"><br>
            <label for="files" class="btn inputs">Cargar Foto</label>
            <input id="files" class="inputs" style="visibility:hidden; padding-top: 0%; margin-left: 50%;" type="file" name="fotoMascota" placeholder="Foto" accept="image/png, image/jpeg"><br>
        </div>
        <br>
        <br>
        <div>
            <input class="btn-primary inputs" style="margin-top: 0%;" value="GUARDAR" type="submit" name="guardar" >
        </div>

</body>
</html>