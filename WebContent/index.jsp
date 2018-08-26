<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
	 <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
     <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>
     <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>SSL Manager</title>
</head>
<style>
	form{

    background-color: white;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
	}

</style>
<body class="c0ca33 lime darken-1">
	 <nav>
	    <div class="nav-wrapper	#00695c teal darken-4">
	      <a href="img/ssl_digital.png" class="brand-logo left thin">SSL Manager</a>
	      <ul id="nav-mobile" class="right hide-on-med-and-down">
	        <li class="thin"><a href="https://ssl.com.mx">Abaout</a></li>
	        <li class="thin"><a  href="badges.html">Contact</a></li>
	      </ul>
	    </div>
  </nav>
 <br>
 <br>
 <br>
		<div>
	<div class="container">
   	 <div class="row">
    	<form class="col l4	m6 s12  z-depth-4 border" method="POST" action="validar">
    		<h4 class="center thin">login</h4>
      		<div class="row">
        	<div class="input-field col l8  m8 s12 push-l2">
          		<i class="material-icons prefix">face</i>
          	<input id="icon_prefix" type="text" class="validate" name="usuario">
          	<label for="icon_prefix" class="thin">User</label>
        	</div>
       		<div class="clearfix"></div>
        	<div class="input-field col l8 m8 s12 push-l2">
          		<i class="material-icons prefix">lock</i>
          		<input id="icon_tel" type="password" class="validate" name="clave">
          		<label for="icon_tel" class="thin">Password</label>
        	</div>
      		</div>
      <div class="row">
      <div class="col l6 m6 s12 push-l4">
     <button class="btn waves-effect waves-light teal hoverable thin" type="submit" name="action">go	
    <i class="material-icons right">flight_takeoff</i>
  </button>
  </div>
  </div>
    </form>	
  </div>
  </div>
</div>
<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
</body>
</html>