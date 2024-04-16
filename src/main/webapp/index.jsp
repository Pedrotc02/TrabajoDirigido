<?xml version="1.0" encoding="UTF-8"?>
<!--
Created by IntelliJ IDEA.
User: pedrotc
Date: 5/3/24
Time: 20:49
-->
<!DOCTYPE html>
<head>

    <%@include file="/WEB-INF/layout/bootstrapheader.jsp"%>
    <title>Página de inicio</title>
</head>

<body>
<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
                <span class="fs-2">
                    <graphicImage width="90" name="img.png" library="imagenes" />
                  CitaMotorizada
                </span>

    <panelGroup rendered="#{not empty request.remoteUser}">
        <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><link outcome="/index" value="Home" styleClass="nav-link px-2 link-secondary" /></li>
            <li><link outcome="/Vehiculos/registrarVehiculo" value="Registrar vehículo" styleClass="nav-link px-2"/></li>
            <li><link outcome="/Vehiculos/vehiculosRegistrados" value="Vehículos registrados" styleClass="nav-link px-2"/></li>
            <li><link outcome="/Cita/citasRegistradas" value="Citas programadas" styleClass="nav-link px-2"/></li>
            <li><link outcome="/Cita/reservarCita" value="Reservar cita" styleClass="nav-link px-2"/></li>
        </ul>
    </panelGroup>

    <panelGroup rendered="#{empty request.remoteUser}">
        <div class="col-md-3 text-end">
            <link outcome="/loginUsuario" styleClass="btn btn-outline-primary me-2" value="Inicia Sesión"/>
            <link outcome="/Usuario/registrarUsuario" styleClass="btn btn-primary me-2" value="Regístrate"/>
        </div>
    </panelGroup>
    <panelGroup rendered="#{not empty request.remoteUser}">
        <form class="col-md-3 text-end">
            <commandButton action="#{ctrlLogin.logout}" class="btn bg-danger test-dark me-2" value="Cerrar Sesión"/>
        </form>
    </panelGroup>
</header>

<main>
    <insert name="contenido">
        Sección para personalizar
    </insert>
</main>

<footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top fixed-bottom">
    <p class="col-md-4 mb-0 text-body-secondary">© 2024 CitaMotorizada, Inc</p>

    <ul class="nav col-md-4 justify-content-end">
        <li class="nav-item"><link outcome="/index" value="Home" styleClass="nav-link px-2 text-body-secondary"/>
        </li>
        <li class="nav-item"><link outcome="#" value="FAQs" styleClass="nav-link px-2 text-body-secondary"/>
        </li>
        <li class="nav-item"><link outcome="#" value="About" styleClass="nav-link px-2 text-body-secondary"/>
        </li>
    </ul>
</footer>

</body>

</html>