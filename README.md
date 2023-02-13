# micalculadora-jsp
Aplicación web de calculadora con operaciones básicas, construida sobre JAVA WEB, JSP, SERVLET, HTML

![img](https://github.com/dugadev17/micalculadora-jsp/blob/master/web/img/1.png)

![img](https://github.com/dugadev17/micalculadora-jsp/blob/master/web/img/2.png)

# html & bootstrap V5.3 css

```html
 <form action="Servlet" method="POST">
  <div class="mb-3">
    <label class="form-label">Primer numero :</label>
    <input
      type="text"
      class="form-control"
      name="num1"
      pattern="[0-9]+"
      required=""
    />
  </div>
  <div class="mb-3">
    <label class="form-label">Segundo numero :</label>
    <input
      type="text"
      class="form-control"
      name="num2"
      pattern="[0-9]+"
      required=""
    />
  </div>
  <div class="mb-3">
    <select name="opcion" class="form-select">
      <option value="suma">Suma</option>
      <option value="resta">Resta</option>
      <option value="multiplicacion">Multiplicacion</option>
      <option value="division">Division</option>
    </select>
  </div>
  <div class="d-grid">
    <button type="submit" class="btn btn-warning" value="submit">
      Calcular
    </button>
  </div>
</form>

```

# Code java

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
