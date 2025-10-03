<%@ page import="tics.itess.domain.Alumno" %>
<%
    String no = request.getParameter("numeroControl");
    String nombre = request.getParameter("nombre");

    Alumno alumno;
    if (no != null && nombre != null) {
        alumno = new Alumno(no, nombre);
    } else {
        alumno = new Alumno("TI701-DEFAULT", "Alumno Demo");
    }
%>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Alumno JSP</title></head>
<body>
    <h1>Datos del Alumno (desde JSP)</h1>
    <p>No. control: <%= alumno.getNoControl() %></p>
    <p>Nombre: <%= alumno.getNombre() %></p>
    <p>Prueba rápida: <%= alumno.mostrarInfo() %></p>
    <hr/>
    <p>Para probar con parámetros: <code>?numeroControl=TI701-999&nombre=TuNombre</code></p>
</body>
</html>
