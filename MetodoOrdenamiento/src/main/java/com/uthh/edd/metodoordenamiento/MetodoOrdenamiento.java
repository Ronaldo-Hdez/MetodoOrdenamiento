package com.uthh.edd.metodoordenamiento;

import java.util.Arrays;

/**
 * Clase principal para probar los algoritmos de ordenamiento
 * de burbuja normal y burbuja mejorada.
 *
 * @author Ronaldo
 * @matricula 20250993
 */
public class MetodoOrdenamiento {

    /**
     * Método principal del programa. Crea los arreglos de prueba,
     * muestra sus valores originales y ejecuta ambos algoritmos
     * de ordenamiento para mostrar los resultados en consola.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        clsBubbleSort bubble = new clsBubbleSort();

        // Arreglos utilizados para probar los algoritmos
        int[] arr = {8, 3, 6, 1, 5};
        int[] arr2 = {8, 1, 15, 8, 10};

        // Prueba del método de burbuja normal
        System.out.println("Arreglo original (burbuja normal): " + Arrays.toString(arr));
        bubble.burbujaNormal(arr);
        System.out.println("Arreglo ordenado (burbuja normal): " + Arrays.toString(arr));

        // Prueba del método de burbuja mejorada
        System.out.println("Arreglo original (burbuja mejorada): " + Arrays.toString(arr2));
        bubble.burbujaMejorada(arr2);
        System.out.println("Arreglo ordenado (burbuja mejorada): " + Arrays.toString(arr2));
    }
}
