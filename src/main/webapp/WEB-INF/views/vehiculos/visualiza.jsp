<%--
  Created by IntelliJ IDEA.
  User: pedrotc
  Date: 17/4/24
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/disenoRegistrarVehiculo.css' />" />
    <title>Visualizar vehiculo</title>
</head>

<body>
<tags:header/>

<main>
    <div class="container mt-5">
        <h1 class="mb-4">Detalles del Vehículo</h1>
        <div class="row">
            <div class="col-md-6">
                <ul>
                    <li><strong>Matrícula:</strong> ${vehiculo.matricula}</li>
                    <li><strong>Marca y Modelo:</strong> ${vehiculo.marca_modelo}</li>
                    <li><strong>Kilometraje:</strong> ${vehiculo.kilometraje}</li>
                </ul>
            </div>
            <div class="col-md-6">
                <ul>
                    <li><strong>Año de Fabricación:</strong> ${vehiculo.anioMatriculacion}</li>
                    <li><strong>Estado del Vehículo:</strong> ${vehiculo.estado}</li>
                </ul>
            </div>
        </div>
        <div class="col-lg-6 col-xxl-4 my-5 d-flex">
            <a href="<c:url value="/vehiculos"/>" class="btn btn-primary m-2">Volver</a>
            <a href="<c:url value="/vehiculos/edita?id=${vehiculo.id}"/>" class="btn btn-warning rounded-pill m-2">Editar</a>
            <a href="<c:url value="/vehiculos/borra?id=${vehiculo.id}"/>" class="btn btn-danger rounded-pill px-2">Borrar</a>
        </div>
    </div>
    </div>
</main>

<tags:footer/>

</body>
</html>
