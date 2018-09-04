<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="es">
	<meta charset="utf-8">
	<title>Join Account</title>
</head>
<body>

	<h1>Nuevo usuario</h1>
	<form method="POST" action="nuevousuario">
		<label>nombre</label><br>
		<input type="text" name="nombre"><br>
		<label>correo</label><br>
		<input type="text" name="correo"><br>
		<label>nivel</label><br>
		<input type="text" name="nivel"><br>
		<label>cabina</label><br>
		<input type="text" name="cabina"><br>
		<label>usuario</label><br>
		<input type="text" name="usuario"><br>
		<label>clave</label><br>
		<input type="text" name="clave"><br>
		<input type="submit" name="enviar">
	</form>

</body>
</html>