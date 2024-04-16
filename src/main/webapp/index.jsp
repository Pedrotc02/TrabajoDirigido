<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<?xml version="1.0" encoding="UTF-8"?>
<!--
Created by IntelliJ IDEA.
User: pedrotc
Date: 5/3/24
Time: 20:49
-->
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
        <link rel="stylesheet" type="text/css" href="<c:url value='/css/disenoInicio.css' />" />
        <title>Página de inicio</title>
    </head>

    <body>
    <tags:header/>

    <main>
        <div class="container">
            <div class="imagen cover-container d-flex w-100 h-100 p-2 mx-auto flex-column text-center">
                <div class="px-2 mx-2">
                    <h1>
    <%--                <c:choose>--%>
    <%--                    <c:when test="${not empty request.remoteUser}">--%>
    <%--                        <outputText value="Bienvenido, ${request.userPrincipal.usuario.nombre} ${request.userPrincipal.usuario.apellidos}" />--%>
    <%--                    </c:when>--%>
    <%--                    <c:otherwise>--%>
    <%--                        <outputText value="Tu gestor de citas para tu taller mecánico" />--%>
    <%--                    </c:otherwise>--%>
    <%--                </c:choose>--%>
                    </h1>
                    <p class="lead texto">
                    Con CitaMotorizada, olvídate de las llamadas al taller y de las largas esperas para conseguir una cita.
                    Mantén tus vehículos en óptimas condiciones sin tener que preocuparte por gestionar citas o perder tiempo
                    en interminables llamadas con el taller.
                    Además, con CitaMotorizada, disfrutarás de un servicio personalizado adaptado a las necesidades específicas
                    de cada vehículo que requiera atención en el taller.
                    </p>
                    <img src="<c:url value="/images/taller.jpg" />" alt="Taller" class="foto" />
                    <p class="lead">
                        <a href="${pageContext.request.contextPath}/Usuario/registrarUsuario" class="btn btn-lg btn-light fw-bold border-white bg-white mt-2">Únete ahora</a>
                    </p>
                </div>
            </div>
        </div>

    </main>

    <tags:footer/>

    </body>
</html>