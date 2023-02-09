<%-- 
    Document   : newjsp
    Created on : Feb 7, 2023, 11:23:00 AM
    Author     : mdeodanes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    int num1 = 0;
    int num2 = 0;
    int resultado = 0;
    String opcion = "";

    if (request.getMethod() == "POST") {

        num1 = Integer.parseInt(request.getParameter("num1"));
        num2 = Integer.parseInt(request.getParameter("num2"));

        opcion = request.getParameter("opcion");

        if (opcion.equals("suma")) {
            resultado = num1 + num2;

        } else if (opcion.equals("resta")) {
            resultado = num1 - num2;

        } else if (opcion.equals("multiplicacion")) {
            resultado = num1 * num2;

        } else if (opcion.equals("division")) {

            resultado = num1 / num2;
        }
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Mi Calculadora JSP</title>
    </head>
    <body>

        <div class="container">

            <div class="row align-items-center justify-content-center min-vh-100">


                <div class="col-lg-5 col-md-8 py-8 py-xl-0">


                    <div class="card shadow border-0 p-3">

                        <h1 class="display-5 py-2 text-center">MI CALCULADORA JSP</h1>

                        <form action="operacion.jsp" method="POST">

                            <div class="mb-3">

                                <label class="form-label">Primer numero :</label>
                                <input type="text" class="form-control" name="num1" pattern="[0-9, .]+" value="<%=num1%>" required=""/>

                            </div>

                            <div class="mb-3">

                                <label class="form-label">Segundo numero :</label>
                                <input type="text" class="form-control" name="num2" pattern="[0-9,.]+" value="<%=num2%>" required=""/>

                            </div>


                           <div class="mb-3">

                                <select name="opcion" class="form-select">

                                    <option  value="suma" name="suma">Suma</option>
                                    <option value="resta" name="resta">Resta</option>
                                    <option value="multiplicacion" name="multiplicacion">Multiplicacion</option>
                                    <option value="division" name="division">Division</option>

                                </select>

                            </div>

                            <div class="mb-3">

                                <label class="form-label">Resultado : <%=opcion%></label>
                                <input class="form-control" value="<%=resultado%>" disabled="" />

                            </div>

                            <div class="d-grid gap-2">

                                <button type="submit" class="btn btn-warning" value="submit">Calcular</button>
                                <a href="index.html" class="btn btn-info">Regresar</a>

                            </div>

                        </form>

                    </div>

                </div>

            </div>

        </div>


    </body>
</html>
