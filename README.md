# Control de Inventario y Ofertas — Noel & Novaventa

## Descripción

Repositorio con la solución de los retos del entregable NOEL-001-LITE y NOVA-001-LITE, correspondiente a la materia de lógica de programación con enfoque en back-end. Ambos retos consisten en herramientas de consola en Java que permiten consultar un catálogo (productos o combos de ofertas) y registrar nuevos elementos en un inventario de capacidad fija.

## Objetivos

- Aplicar el manejo de arreglos (`String[]`) de capacidad fija para representar un
  inventario simple.
- Practicar la modularización del código mediante funciones estáticas con parámetros
  y valores de retorno, separando la lógica de negocio de la interacción con el usuario.
- Reforzar el uso de estructuras de control iterativas (`while`) y selectivas (`switch`)
  en la construcción de un menú interactivo de consola.
- Manejar correctamente la clase `Scanner`, incluyendo la limpieza del búfer al alternar
  lecturas numéricas y de texto.
- Recorrer arreglos con el ciclo mejorado `for-each`, y con el ciclo `for` clásico cuando se necesita conocer la posición del elemento.

## Herramientas involucradas en el código

- Java (openJDK Temurin-21)
- Visual Studio Code
- Clase `Scanner` (`java.util.Scanner`) para la entrada de datos por consola

## Modelos de datos

Ambos retos representan su menu/catálogo con un único arreglo de texto de capacidad fija:

```java
String[] productos = new String[5];
String[] ofertas = new String[5];
```

Cada posición contiene el nombre de un producto (`String`) o `null` si la casilla
está disponible para un nuevo registro. No se utilizan clases ni estructuras de datos
adicionales en esta versión de los módulos.

## Retos incluidos

| Código | Título | Estado |
|---|---|---|
| NOEL-001-LITE | Módulo Básico de Búsqueda y Registro de Productos Noel | Completo |
| NOVA-001-LITE | Control básico de Ofertas y Registro de Combos Novavneta| Completo |

## Colaboración al repositorio

Este es un repositorio personal de práctica académica. No se aceptan Pull Requests
externos por el momento. Cualquier sugerencia o corrección puede reportarse mediante
un Issue.

## Datos del autor

- **Nombre:** Hernán Pérez
- **GitHub:** [@Amahlo](https://github.com/Amahlo)
- **Materia:** Lógica de Programación — enfoque back-end