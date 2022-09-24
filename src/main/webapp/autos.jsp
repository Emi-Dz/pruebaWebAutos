<%-- 
    Document   : autos
    Created on : 22 sep. 2022, 14:40:49
    Author     : emidz
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Autos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <link href="autos.css" rel="stylesheet">
    </head>
    <body>
        <h1>Ingrese Auto:</h1>
        <br/>
        <div class="container">
        <form class="row g-3" action="SvAutos" method="POST">
            <div class="col-md-6">
            <p><label for="patente" class="form-label">Patente:</label> <input id="patente" type="text" name="patente" placeholder="Ingrese patente" class="form-control"  >   </p>
            </div>
            <div class="col-md-6">
            <p><label for="marca" class="form-label">Marca:  </label> <input id="marca" type="text" name="marca" placeholder="Ingrese marca" class="form-control" >     </p>
            </div>
            <div class="col-md-6">
            <p><label for="modelo" class="form-label">Modelo:</label>  <input id="modelo" type="text" name="modelo" placeholder="Ingrese modelo" class="form-control" >     </p>
            </div>
            <div class="col-md-6">
            <p><label for="color" class="form-label">Color: </label><input id="color" type="text" name="color" placeholder="Ingrese color" class="form-control" >      </p>
            </div>
            <div class="col-md-4">
            <p><label for="tipoMotor" class="form-label">Tipo de Motor: </label><select id="tipoMotor" type="text" name="tipoMotor" placeholder="Ingrese tipo de motor" class="form-select"  >  
            <option selected>Elija una opción...</option>
            <option>1.0 nafta</option>
            <option>1.4 nafta</option>
            <option>1.6 nafta</option>
            <option>1.8 nafta</option>
            <option>2.0 nafta</option>
            <option>1.3 gasoil</option>
            <option>1.9 gasoil</option>
            </select></p>
            </div>
            <div>
            <button type="submit" class="btn btn-primary btn-lg">Ingresar</button>
            </div>
            </form>
            <br/>
             <form class="row g-3" action="SvAutos" method="GET"> 
                <div class="d-grid">
                <button type="submit" class="btn btn-outline-primary" >Mostrar Autos</button>
                </div>
             </form>
             
            
            
            
            </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>
