<%@tag description="CitaMotorizada header" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
    <span class="fs-2">
        <img src="<c:url value='/images/img.png' />" width="90" alt="Logo" />
        CitaMotorizada
    </span>

    <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
        <li class="nav-link px-2"><a href="<c:url value="/"/>" class="nav-link">Home</a></li>
        <li class="nav-link px-2"><a href="<c:url value="/vehiculos/registrar"/>" class="nav-link">Registrar vehículo</a></li>
        <li class="nav-link px-2"><a href="<c:url value="/vehiculos/listado"/>" class="nav-link px-2">Vehículos registrados</a></li>
    </ul>

    <div class="col-md-3 text-end">
<%--        <a href="${pageContext.request.contextPath}/loginUsuario" class="btn btn-outline-primary me-2">Inicia Sesión</a>--%>
<%--        <a href="${pageContext.request.contextPath}/Usuario/registrarUsuario" class="btn btn-primary me-2">Regístrate</a>--%>
    </div>
</header>
