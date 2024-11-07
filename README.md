# CGI_INTERVIEW - Java Developer
# Patrones de Diseño en Java: Singleton, Builder y MVC

Este proyecto implementa tres patrones de diseño comunes en Java: **Singleton**, **Builder** y **MVC**. A continuación, se explica el propósito de cada patrón y en qué clase se encuentra su implementación.

## Patrones de Diseño Implementados

### 1. Singleton
El patrón **Singleton** asegura que una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia. Este patrón es útil para situaciones en las que solo se necesita una única instancia de una clase en toda la aplicación, como para gestionar configuraciones globales o conexiones a bases de datos.

- **Package:** `Singleton`
- **Class:** `Hotel.java`
- **Descripción:** La clase `Hotel` contiene una instancia única que se crea al cargar la clase y es accesible mediante el método estático `getInstance()`. El constructor es privado para evitar que se creen múltiples instancias.

#### Ejemplo de Uso
Para utilizar el patrón Singleton, llama al método `getInstance()` de la clase `Hotel` como se muestra en el ejemplo de la clase `Main.java`.

```java
public class Main {
    public static void main(String[] args) {
        Hotel singleton = Hotel.getInstance();
        singleton.newAccommodation();
    }
}
```

### 2. Builder
El patrón **Builder** permite construir objetos complejos paso a paso, evitando el uso de constructores largos y mejorando la legibilidad del código. Este patrón es útil para crear objetos con múltiples parámetros opcionales de manera más clara y estructurada.

- **Package:** `Builder`
- **Class:** `Carro.java`
- **Descripción:** La clase `Carro` utiliza una clase interna `Builder` que permite configurar los atributos del carro, como la placa, cilindrada, color, y otros atributos adicionales. El método `build()` de `Builder` crea una instancia final de `Carro` con todos los atributos especificados.

#### Ejemplo de Uso
Para utilizar el patrón Builder, crea una instancia de `Carro` mediante el `Builder`, especificando cada característica de la pizza deseada en la clase `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro.Builder()
                .setPlaca("MAY250")
                .setColor("Gris Carbon")
                .setCilindrada("1600 Litros")
                .setNumeroPuertas(5)
                .setCarroceria("Sedan").build();

        System.out.println(carro);
    }
}
```

### 3. MVC

El patrón **MVC** divide la aplicación en tres componentes principales:

1. **Modelo (Model):** Contiene los datos y la lógica de negocio de la aplicación. Es responsable de gestionar la información y notificar los cambios al controlador.

2. **Vista (View):** Es la interfaz de usuario que presenta los datos del modelo al usuario. La vista obtiene la información que debe mostrar desde el modelo, y su rol es únicamente presentar esos datos.

3. **Controlador (Controller):** Actúa como intermediario entre el modelo y la vista. Recibe las entradas del usuario desde la vista, realiza las actualizaciones en el modelo, y actualiza la vista según sea necesario.

## Estructura del Proyecto

- **Modelo:** `Model.java`
  - La clase `Model` representa los datos de la aplicación (en este caso, el nombre de un usuario).
  - Contiene métodos para establecer y obtener el nombre de usuario.

- **Vista:** `Vista.java`
  - La clase `Vista` maneja la interfaz de usuario.
  - Tiene métodos para mostrar el nombre de usuario, que recibe como parámetro desde el controlador.

- **Controlador:** `Controlador.java`
  - La clase `Controlador` se encarga de la lógica que conecta el modelo y la vista.
  - Permite actualizar el nombre en el modelo y actualizar la vista para reflejar esos cambios.

## Ejemplo de Uso
A continuación, se muestra cómo configurar y utilizar el patrón MVC en la clase `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        Model modelo = new Model();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.setNombreUsuario("Kevin Santiago Jimenez Salamanca");
        controlador.actualizarVista();
    }
}
```