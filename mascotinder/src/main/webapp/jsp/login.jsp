<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Persona</title>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- CSS only -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.scss">
</head>

<body style=" background: linear-gradient(to right, rgba(205, 242, 126, 0.9), rgba(173, 242, 162, 0.9)); background-attachment: fixed;">
        <div class="container h-100 text-white">
            <div class="row justify-content-sm-center h-100">
                <div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
                    <div class="text-center my-2">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                        <path
                            d="M226.5 92.85C240.8 135.7 226.2 179.1 193.9 189.7C161.6 200.2 123.8 174 109.5 131.1C95.19 88.26 109.8 44.92 142.1 34.34C174.4 23.77 212.2 49.96 226.5 92.85zM100.4 198.6C119.2 231 114.7 268.7 90.16 282.7C65.65 296.8 30.49 281.9 11.63 249.4C-7.237 216.1-2.664 179.3 21.84 165.3C46.35 151.2 81.51 166.1 100.4 198.6zM69.21 401.2C121.6 259.9 214.7 224 256 224C297.3 224 390.4 259.9 442.8 401.2C446.4 410.9 448 421.3 448 431.7V433.3C448 459.1 427.1 480 401.3 480C389.8 480 378.4 478.6 367.3 475.8L279.3 453.8C263.1 450 248 450 232.7 453.8L144.7 475.8C133.6 478.6 122.2 480 110.7 480C84.93 480 64 459.1 64 433.3V431.7C64 421.3 65.6 410.9 69.21 401.2H69.21zM421.8 282.7C397.3 268.7 392.8 231 411.6 198.6C430.5 166.1 465.7 151.2 490.2 165.3C514.7 179.3 519.2 216.1 500.4 249.4C481.5 281.9 446.3 296.8 421.8 282.7zM310.1 189.7C277.8 179.1 263.2 135.7 277.5 92.85C291.8 49.96 329.6 23.77 361.9 34.34C394.2 44.92 408.8 88.26 394.5 131.1C380.2 174 342.4 200.2 310.1 189.7z" />
                    	</svg>
                    </div>
                    <div class="card shadow-lg bg-dark">
                        <div class="card-body p-5">
                            <h1 class="fs-4 card-title fw-bold mb-4">Inicio de sesión</h1>
                            <form method="post" action="../mascotinder/IngresarSistemaController" class="needs-validation" novalidate="" autocomplete="off">
                                
                                <div class="mb-3">
                                    <label class="mb-2 text-muted" for="txtCedula">Usuario</label>
                                    <input  type="text" class="form-control" placeholder="Usuario" name="usuario" >
                                    <div class="invalid-feedback">
                                        Credenciales incorrectas
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <div class="mb-2 w-100">
                                        <label class="text-muted" for="password">Clave</label>
                                    </div>
                                    <input id="txtPassword" type="password" class="form-control bg.dark" placeholder="Clave" name="password" >
                                    <div class="invalid-feedback">
                                        Contraseña requerida
                                    </div>
                                </div>
                                <div class="d-flex align-items-center">
                                    <div class="form-check">
                                        <input type="checkbox" name="remember" id="recordarme" value="true" class="form-check-input" ${recordarme}>
                                        <label for="remember" class="form-check-label" >	Recordarme</label>
                                    </div>
                                    <button type="submit" value="Ingresar"  class="btn btn-primary ms-auto">
                                        Ingresar
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>


</html>