package com.acelopez.jdk7.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * Clase que permite practicar el uso de ForkJoin framework.
 */
public class ForkJoin {

    /**
     * Tamaño del arreglo de numeros.
     */
    private static final int TOTAL = 200_000;

    /**
     * Obtiene un arreglo de numeros enteros aleatorios.
     *
     * @return Arreglo de numeros enteros aleatorios.
     */
    public static int[] getArreglo() {

        System.out.println("Inicializando arreglo");

        int[] arreglo = new int[TOTAL];
        Random random = new Random(500);

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt();
        }

        System.out.println("Inicialización finalizada");

        return arreglo;
    }

    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.printf("%d " + (processors != 1 ? "procesadores disponibles" : " procesador disponible") + "\n", processors);

        ForkSum fs = new ForkSum();
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(fs);
    }
}
