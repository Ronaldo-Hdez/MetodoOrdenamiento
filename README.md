# Método de Ordenamiento de Burbuja en Java

## Información del alumno

- **Nombre:** Ronaldo
- **Matrícula:** 20250993
- **Lenguaje:** Java

## Descripción del proyecto

Este proyecto implementa dos versiones del algoritmo de ordenamiento de burbuja en Java: el método tradicional y el método mejorado. Ambos ordenan un arreglo de números enteros de menor a mayor.

El objetivo es comprender cómo funcionan los algoritmos de ordenamiento y comparar sus diferencias mediante pruebas de ejecución.

## Métodos implementados

### 1. Burbuja normal

El método `burbujaNormal(int[] arr)` recorre el arreglo mediante dos ciclos `for`. Compara elementos adyacentes e intercambia sus posiciones cuando el elemento de la izquierda es mayor que el de la derecha.

Este proceso se repite hasta completar las pasadas establecidas.

### 2. Burbuja mejorada

El método `burbujaMejorada(int[] arr)` utiliza una variable booleana llamada `intercambio` para detectar si se realizaron cambios durante una pasada.

Si termina una pasada sin intercambios, el algoritmo detiene la ejecución anticipadamente, ya que el arreglo se encuentra ordenado.

## Estructura del proyecto

```text
MetodoOrdenamiento/
├── src/
│   └── com/
│       └── uthh/
│           └── edd/
│               └── metodoordenamiento/
│                   ├── MetodoOrdenamiento.java
│                   └── clsBubbleSort.java
└── README.md
```

## Pruebas de ejecución

Se utilizan dos arreglos para comprobar el funcionamiento de los métodos.

**Prueba 1: Burbuja normal**

Arreglo inicial:

```text
[8, 3, 6, 1, 5]
```

Resultado esperado:

```text
[1, 3, 5, 6, 8]
```

**Prueba 2: Burbuja mejorada**

Arreglo inicial:

```text
[8, 1, 15, 8, 10]
```

Resultado esperado:

```text
[1, 8, 8, 10, 15]
```

## Requisitos

- Tener instalado el JDK de Java.
- Contar con un entorno de desarrollo compatible, como NetBeans.
- Descargar o clonar el repositorio del proyecto.

## Ejecución

1. Abrir el proyecto en NetBeans o en otro entorno compatible con Java.
2. Ejecutar la clase `MetodoOrdenamiento`.
3. Revisar la salida en consola para comparar los arreglos originales y ordenados.
