package com.uthh.edd.metodoordenamiento;

/**
 * Contiene los métodos de ordenamiento de burbuja normal
 * y burbuja mejorada para ordenar arreglos de enteros
 * de menor a mayor.
 *
 * @author Ronaldo
 * @matricula 20250993
 */
public class clsBubbleSort {

    /**
     * Ordena un arreglo de enteros mediante el algoritmo
     * tradicional de ordenamiento de burbuja.
     *
     * Compara elementos adyacentes e intercambia sus valores
     * cuando el elemento de la izquierda es mayor que el
     * elemento de la derecha.
     *
     * @param arr arreglo de enteros que se desea ordenar
     */
    public static void burbujaNormal(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Ordena un arreglo de enteros mediante el algoritmo
     * de burbuja mejorado.
     *
     * Utiliza una bandera para detectar si se realizaron
     * intercambios durante una pasada. Si no hubo ninguno,
     * el algoritmo termina anticipadamente porque el arreglo
     * ya se encuentra ordenado.
     *
     * @param arr arreglo de enteros que se desea ordenar
     */
    public static void burbujaMejorada(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean intercambio = false;

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;

                    intercambio = true;
                }
            }

            // Si no hubo intercambios, termina el ordenamiento.
            if (intercambio == false) {
                break;
            }
        }
    }
}