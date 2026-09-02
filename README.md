# Módulo de Búsqueda y Registro de Productos Noel

## Descripción

Repositorio con la solución de los retos del entregable **NOEL-001-LITE**, correspondiente
a la materia de lógica de programación con enfoque en back-end. Se trata de una
herramienta de consola en Java pensada para un auxiliar de bodega, que permite consultar
las líneas de producto disponibles y registrar nuevas variedades en el inventario.

## Objetivos

- Aplicar el manejo de arreglos (`String[]`) de capacidad fija para representar un
  inventario simple.
- Practicar la modularización del código mediante funciones estáticas con parámetros
  y valores de retorno.
- Reforzar el uso de estructuras de control iterativas (`while`) y selectivas (`switch`)
  en la construcción de un menú interactivo de consola.
- Manejar correctamente la clase `Scanner`, incluyendo la limpieza del búfer al alternar
  lecturas numéricas y de texto.
- Recorrer arreglos con el ciclo mejorado `for-each`.

## Herramientas involucradas en el código

- Java (openJDK Temurin-21)
- Visual Studio Code
- Clase `Scanner` (`java.util.Scanner`) para la entrada de datos por consola

## Modelos de datos

El inventario se representa con un único arreglo de texto de capacidad fija:

```java
String[] productos = new String[5];
```

Cada posición contiene el nombre de un producto (`String`) o `null` si la casilla
está disponible para un nuevo registro. No se utilizan clases ni estructuras de datos
adicionales en esta versión del módulo.

## Retos incluidos

| Código | Título | Estado |
|---|---|---|
| NOEL-001-LITE | Módulo Básico de Búsqueda y Registro de Productos Noel | Completo |
| *(pendiente)* | *(segundo reto del entregable)* | En desarrollo |

## Colaboración al repositorio

Este es un repositorio personal de práctica académica. No se aceptan Pull Requests
externos por el momento. Cualquier sugerencia o corrección puede reportarse mediante
un Issue.

## Datos del autor

- **Nombre:** Hernán Pérez
- **GitHub:** [@Amahlo](https://github.com/Amahlo)
- **Materia:** Lógica de Programación — enfoque back-end