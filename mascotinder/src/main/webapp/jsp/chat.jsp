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
<link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
	rel="stylesheet">
</head>

<body>

	<%@include file="../templates/banner.html"%>
	<form class="container" action="ChatController" method="post">
		<div class="row justify-content-center m-3">
			<div class="col-8">
				<h2 class="titulos my-5 px-0 text-start">Mensajes</h2>
			</div>
		</div>

		<div class="row justify-content-center m-3">
			<div class="col-8">
				<div class="form-control" rows="10">
					<c:forEach items="${mensajes}" var="mensaje">
						<div class="cuadro d-flex flex-column ">
							<div class="d-flex flex-column rounded-1 m-1 p-1"
								style="background: linear-gradient(to right, rgba(205, 242, 126, 0.9), rgba(173, 242, 162, 0.9));">
								<div class="h6 fw-bold">Para: ${mensaje.receptor.nombre}</div>
								<div class="lead ms-3">${mensaje.contenido}</div>

							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<div class="row m-3 justify-content-center">
			<div class="col-6">
				<input class="form-control" type="text" name="contenido" required>
			</div>
			<div class="col-2">
			<input type="hidden" name="idDestinatario" value="<%= request.getParameter("duenoMascota")%>">
			<button type="submit" class="btn btn-primary">Enviar</button>
			</div>

		</div>

	</form>
</body>

<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

</html>