<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>Form SSL Manager</title>
</head>
<body>
	<div class="container ">
		<h4 class="left thin">New Ticket</h4>
		<div class="clearfix"></div>
			<form class="col l12">
				<div class="row">
				<div class="col l12 m12 s12 ">
				<div class="input-field col l4 m4 s6 right">
    				<select name="estatus">
				      <option value="" disabled selected>Estatus</option>
				      <option value="1">Option 1</option>
				      <option value="2">Option 2</option>
				      <option value="3">Option 3</option>
    				</select>
    				<label class="">Estatus Ticket</label>
				  </div>
				 <div class="input-field col l4  m4 s6 right">
			          <i class="material-icons prefix">list_alt</i>
			          <input id="icon_prefix" type="text" class="validate" name="noticket">
			          <label for="icon_prefix" class="thin">Ticket</label>
        		</div>
				</div>
				</div>
 			 <div class="row">
 			 	<div class="col l3 m4 s2 push-l2">
	        		<p class="btn btn waves-effect z-depth-3  thin"> Daniel Millan</p>
	 			 </div>	
	 			 <div class="col l3 m4 s2  push-l2">
	        		<p class="btn btn waves-effect z-depth-3  thin"> Cabina Santaner</p>
	 			 </div>
	 			 <div class="col l3 m4 s2  push-l2">
	        		<p class="btn btn waves-effect z-depth-3  thin">Cliente Santender</p>
	 			 </div>		
 			 </div> 
			<div class="progress">
      			<div class="determinate" style="width: 100%"></div>
  			</div>
 			 <div class="row">
 			 	<div class="col l12 m12 s12">
 			 	<div class="input-field col l4  m2 s4 ">
			         <input id="branch" type="text" class="validate" name="sucursal">
			         <label for="branch" class="thin">Branch</label>
        		</div>
        		 	<div class="input-field col l4  m4 s5 ">
			        <input id="name" type="text" class="validate" name="nosucursal">
			        <label for="name" class="thin">Name</label>
        		</div>
        		<div class="input-field col l4 m6 s3">
        			<input id="country" type="text" class="validate" name="estado">
        			<label for="country" class="thin">Country</label>
        		</div>
        	<div class="row">
        		<div class="col l12 m12 s12">
        			<div class="input-field col l4 m6 s3">
        			 <input id="region" type="text" class="validate" name="region">
        			<label for="region" class="thin">Region</label>
        		</div>
           		<div class="input-field col l8 m6 s3">
        			<input id="addres" type="text" class="validate" name="direccion">
        			<label for="addres" class="thin">Addres</label>
        		</div>
        		</div>
        	</div>
        	<div class="row">
        		<div class="col l12 m12 s12">
        			<div class="input-field col l8 m6 s3">
        				<input id="customer" type="text" class="validate" name="cliente">
        			<label for="customer" class="thin">Customer Name</label>
        		</div>
         			<div class="input-field col l4 m6 s3">
        				<input id="employment" type="text" class="validate" name="puesto">
        			<label for="employment" class="thin">Employment</label>
        		</div>
        		</div>
        	</div>
 			 	</div>
 			 </div>
 			<div class="progress">
      			<div class="determinate" style="width: 100%"></div>
  			</div>
 			 <div class="row">
 			 	<div class="col l12 m12 s12">
 			 		<div class="input-field col l4  m2 s4 ">
			      	  	<input id="falla" type="text" class="validate" name="falla">
			        	<label for="falla" class="thin">falla</label>
        		</div>
        			<div class="input-field col l4  m2 s4 ">
			         	<input id="fallar" type="text" class="validate" name="fallareal">
			         	<label for="fallar" class="thin">Falla Real</label>
        		</div>
        			<div class="input-field col l4  m2 s4 ">
			         	<input id="Causa" type="text" class="validate" name="causa">
			         	<label for="Causa" class="thin">Causa</label>
        		</div>
 			 	</div>
 			 </div>
 			   <div class="row">
        			<div class="input-field col s12">
          				<textarea id="textarea1" class="materialize-textarea" name="descripsion"></textarea>
          				<label for="textarea1">Descripsion</label>
        			</div>
			      </div>
			<div class="row">
				<div class="col l12 m12 s12">
				<ul class="collapsible">
    				<li>
      					<div class="collapsible-header"><i class="material-icons">add_circle_outline</i>Service</div>
      					<div class="collapsible-body">
      						<div class="row">
      							<div class="col l12 m12 s12">
 				        		<div class="input-field col l3  m2 s4 ">
			         				<input id="modelo" type="text" class="validate" name="modelo1">
			         				<label for="modelo" class="thin">modelo</label>
   					     		</div>
   				        		<div class="input-field col l3  m2 s4 ">
			         				<input id="serie" type="text" class="validate" name="serie1">
			         				<label for="serie" class="thin">#serie</label>
   					     		</div>
   					     		 <div class="input-field col l3  m2 s4 ">
			         				<input id="modelo retirado" type="text" class="validate" name="modelo2">
			         				<label for="modelo retirado" class="thin">modelo retirado</label>
   					     		</div>   					
   					     		 <div class="input-field col l3  m2 s4 ">
			         				<input id="serie1" type="text" class="validate" name="serie2">
			         				<label for="serie1" class="thin">#serie</label>
   					     		</div>
      							</div>
      						</div>
      						<div class="row">
      							<div class="col l12 m12 s12">      			
   					     		 <div class="input-field col l3  m2 s4 ">
			         				<input id="version" type="text" class="validate" name="version1">
			         				<label for="version" class="thin">version1</label>
   					     		</div>
   					     		<div class="input-field col l3  m2 s4 ">
			         				<input id="version1" type="text" class="validate" name="version2">
			         				<label for="version1" class="thin">version2</label>
   					     		</div>
   					     		<div class="input-field col l3  m2 s4 ">
			         				<input id="ganancia" type="text" class="validate" name="ganancia">
			         				<label for="ganancia" class="thin">ganancia</label>
   					     		</div>
   					     		<div class="input-field col l3  m2 s4 ">
			         				<input id="rf" type="text" class="validate" name="rf">
			         				<label for="rf" class="thin">RF</label>
   					     		</div>
   					     		 <div class="input-field col l3  m2 s4 ">
			         				<input id="voltaje" type="text" class="validate" name="voltaje">
			         				<label for="voltaje" class="thin">Voltaje</label>
   					     		</div>
   					     		 <div class="input-field col l3  m2 s4 ">
			         				<input id="temperatura" type="text" class="validate" name="temperatura">
			         				<label for="temperatura" class="thin">temperatura</label>
   					     		</div>
      							</div>
      						</div>
      					</div>
    				</li>
    			</ul>
				</div>
			</div>
			</form>
	</div>

<script type="text/javascript" src="materialize/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
    $('select').formSelect();
  	});
</script>
<script type="text/javascript">
	$(document).ready(function(){
    $('.collapsible').collapsible();
  	});
</script>
</body>
</html>