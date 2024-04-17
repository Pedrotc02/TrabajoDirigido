<%--
  Created by IntelliJ IDEA.
  User: pedrotc
  Date: 17/4/24
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/disenoRegistrarVehiculo.css' />" />
    <title>Listado de vehiculos</title>
</head>

<body>
<tags:header/>

<main>
    <div class="container mt-5">
        <h1>Lista de Vehículos Registrados</h1>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Matrícula</th>
                <th>Marca/Modelo</th>
                <th>Kilometraje</th>
                <th>Año Matriculación</th>
                <th>Estado</th>
                <th>Acciones</th>
            </tr>
            </thead>
            <tbody>
            <c:url var="ctrlUrl" value="/vehiculos"/>
            <c:forEach items="${vehiculos}" var="vehiculo">
                <c:set var="qry" value="?id=${vehiculo.id}"/>
                <tr>
                    <td>${vehiculo.matricula}</td>
                    <td>${vehiculo.marca_modelo}</td>
                    <td>${vehiculo.kilometraje}</td>
                    <td>${vehiculo.anioMatriculacion}</td>
                    <td>${vehiculo.estado}</td>
                    <td>
                        <a href="${ctrlUrl}/visualiza${qry}" class="btn btn-info rounded-pill px-2">Visualizar</a>
                        <a href="${ctrlUrl}/edita${qry}" class="btn btn-warning rounded-pill px-2">Editar</a>
                        <a href="${ctrlUrl}/borra${qry}" class="btn btn-danger rounded-pill px-2">Borrar</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</main>

<tags:footer/>

</body>
</html>
