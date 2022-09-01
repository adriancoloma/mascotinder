<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Mascota</title>
    <link rel="stylesheet" href="../jsp/css/styles.css">
    <!-- MDB -->
    <link
    href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.4.0/mdb.min.css"
    rel="stylesheet"
    />
</head>
<body  style="background-image: linear-gradient(rgba(100, 230, 117, 0.9), rgba(173, 240, 162, 0.9)); background-attachment: fixed;">
    <header>
        <span class="titulo">Masco Tinder</span>
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
                <select class="selects" style="width: 70px; height: 30px;" name="select1">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
            <div style="display: inline-block;">
                <p class="sub">TIPO</p>
                <select class="selects" style="width: 70px; height: 30px;" name="select1">
                    <option value="1">Perro</option>
                    <option value="2">Gato</option>
                    <option value="3">Vaca</option>
                </select>
            </div>
        </div><br>
        <div>
            <p class="sub">SEXO</p>
            <select class="selects" style="width: 12%; height: 30px;" name="select1">
                <option value="1">Macho</option>
                <option value="2">Hembra</option>
            </select>
        </div><BR></BR>
        <div style="text-align: center;">
            <p class="sub">FOTOGRAFÍA</p><br>
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
    </form>

</body>
</html>