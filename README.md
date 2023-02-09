# micalculadora-jsp
Aplicación web de calculadora con operaciones básicas, construida sobre JAVA WEB, JSP, SERVLET, HTML

![img](https://github.com/dugadev17/micalculadora-jsp/blob/master/web/img/1.png)

![img](https://github.com/dugadev17/micalculadora-jsp/blob/master/web/img/2.png)

```java

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

```
