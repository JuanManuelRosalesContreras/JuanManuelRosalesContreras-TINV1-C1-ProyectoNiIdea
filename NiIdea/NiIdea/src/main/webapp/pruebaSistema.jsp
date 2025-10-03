<%@ page import="java.util.*" %>
<%@ page import="tics.itess.domain.*" %>
<%
    // Datos demo
    Alumno alumno = new Alumno("TI701-123", "Juan Manuel");
    Logro logro1 = new Logro(13524, "Proyecto", "Sistema de Inventario", "2025-05-01");
    Logro logro2 = new Logro(09450, "Certificación", "Oracle Java Foundations", "2025-06-10");

    Portafolio portafolio = new Portafolio("Portafolio Juan", "Proyectos y certificaciones", "2025-07-01", alumno);
    portafolio.agregarLogro(logro1);
    portafolio.agregarLogro(logro2);

    Usuario usuario = new Usuario("juan123", "claveSegura", "alumno");
    Chismoso chismoso = new Chismoso("Luis", "Maestro", "Director del proyecto");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Prueba Sistema - ITESS</title>
</head>
<body>
    <h1>Prueba de Integración - Plataforma Perfil</h1>

    <h2>Alumno</h2>
    <p><strong>No. control:</strong> <%= alumno.getNumeroControl() %></p>
    <p><strong>Nombre:</strong> <%= alumno.getNombre() %></p>

    <h2>Usuario</h2>
    <p><strong>Username:</strong> <%= usuario.getUsername() %></p>
    <p><strong>Rol:</strong> <%= usuario.getRol() %></p>

    <h2>Portafolio</h2>
    <p><strong>Título:</strong> <%= portafolio.getTitulo() %></p>
    <p><strong>Descripción:</strong> <%= portafolio.getDescripcion() %></p>
    <p><strong>Fecha creación:</strong> <%= portafolio.getFechaCreacion() %></p>

    <h3>Logros</h3>
    <ul>
        <% for (Logro l : portafolio.getLogros()) { %>
            <li><strong><%= l.getTipo() %></strong> - <%= l.getDescripcion() %> (<%= l.getFecha() %>)</li>
        <% } %>
    </ul>

    <h2>Stakeholder</h2>
    <p><strong>Nombre:</strong> <%= chismoso.getNombre() %></p>
    <p><strong>Rol:</strong> <%= chismoso.getRol() %></p>
    <p><strong>Relación:</strong> <%= chismoso.getRelacion() %></p>
</body>
</html>
