<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: pedrotc
  Date: 15/4/24
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/disenoRegistrarVehiculo.css' />" />
    <title>Página de inicio</title>
</head>

<body>
<tags:header/>

<main>
    <div>
        <div class="col-md-7 col-lg-8 ml-300" style="margin-left: 300px">
            <h4 class="mb-3">Datos del Vehiculo</h4>
            <div class="flexbox-align mt-5">
                <form:errors path="vehiculo.*" cssClass="text-danger" element="div" />
                <form:form class="needs-validation" method="post">
                    <div class="row g-3">

                        <div class="col-sm-6">
                            <form:label path="matricula">Matricula</form:label>
                            <form:input path="matricula" class="form-control"/>
                            <div><form:errors cssClass="form-text text-danger" path="matricula"/></div>
                        </div>

                        <div class="col-sm-6">
                            <form:label path="marcaModelo">Marca y Modelo</form:label>
                            <form:input path="marcaModelo" class="form-control"/>
                            <div><form:errors cssClass="form-text text-danger" path="marcaModelo"/></div>
                        </div>

                        <div class="col-sm-6">
                            <form:label path="kilometraje">Kilometraje</form:label>
                            <form:input path="kilometraje" class="form-control"/>
                            <div><form:errors cssClass="form-text text-danger" path="kilometraje"/></div>
                        </div>

                        <div class="col-6">
                            <form:label path="anio">Año de Fabricación</form:label>
                            <form:input path="anio" class="form-control"/>
                            <div><form:errors cssClass="form-text text-danger" path="anio"/></div>
                        </div>

                        <div class="col-4">
                            <form:label path="estado">Estado del Vehiculo</form:label>
                            <form:textarea path="estado" class="form-control"/>
                            <div><form:errors cssClass="form-text text-danger" path="estado"/></div>
                        </div>

                    </div>

                    <div class="col-lg-6 col-xxl-4 my-5 mx-auto d-flex">
                        <a href="/index.jsp" class="d-block w-100 btn btn-danger btn-lg mx-1">Cancelar</a>
                        <input type="submit" value="Registrar" class="d-block w-100 btn btn-primary btn-lg mx-1" />
                    </div>

                </form:form>
            </div>
        </div>
    </div>


</main>

<tags:footer/>

</body>
</html>
