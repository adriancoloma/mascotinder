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
<title>Establecer Preferencias</title>
<link rel="stylesheet" href="css/styles.css">
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css"
	rel="stylesheet" />
<!-- Font Awesome -->
<link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
	rel="stylesheet">
</head>
<body>

	<%@include file="../templates/banner.html" %>
	<form method="post" action="EstablecerPreferenciasController"
		 style="text-align: center;">
		<input type="hidden" name="txtIdMascota" id="txtIdMascota"
			value="${mascota.id}">
		<h2 class="titulos">Preferencias</h2>
		<div>
			<p class="sub">Buscar mascotas que cumplen con:</p>

		</div>
		<br>
		<div>

			<div style="display: inline-block;">
				<p class="sub">TIPO</p>
				<select class="selects"
					style="width: 250px; height: 30px; margin-left: 50px;"
					name="selectTipo">

					<option value="Perro"
						${mascota.preferenciaTipo=="Perro" ? "selected": ''}>Perro</option>
					<option value="Gato"
						${mascota.preferenciaTipo=="Gato" ? "selected": ''}>Gato</option>
					<option value="Vaca"
						${mascota.preferenciaTipo=="Vaca" ? "selected": ''}>Vaca</option>
				</select>
			</div>
		</div>
		<br>
		<div>
			<p class="sub">SEXO</p>
			<select class="selects" style="width: 14%; height: 30px;"
				name="selectSexo">
				<option value="M"
					${mascota.preferenciaSexo=='M'.charAt(0) ? "selected": ''}>Macho</option>
				<option value="F"
					${mascota.preferenciaSexo=='F'.charAt(0) ? "selected": ''}>Hembra</option>
			</select>
		</div>
		<BR></BR>
		<div style="text-align: center;">
			<p class="sub">RANGOS DE EDAD</p>
			<br>

			<div
				style="display: inline-block; padding-right: 50px; margin-left: 2.5%;">
				<p class="sub">MAYORES A</p>
				<input type="number" style="width: 70px; height: 30px;"
					name="selectEdad1" min="3" max="8" required
					value="${mascota.preferenciaMinimoEdad}">

			</div>

			<div
				style="display: inline-block; padding-right: 50px; margin-left: 2.5%;">
				<p class="sub">MENORES A</p>
				<input type="number" style="width: 70px; height: 30px;"
					name="selectEdad2" min="3" max="8" required
					value="${mascota.preferenciaMaximoEdad}">

			</div>
		</div>
		<br> <br>
		<div>
			<input class="btn-primary inputs" style="margin-top: 0%;"
				value="GUARDAR" type="submit" name="guardar">
		</div>
	</form>
</body>
</html>