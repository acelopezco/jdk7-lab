package com.acelopez.jdk7.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * Tarea que permite la suma de los numeros de un arreglo usando el framework ForkJoin.
 */
public class ForkSum extends RecursiveTask<Integer> {

    /**
     * Especifica la cantidad de datos que procesa una tarea pequeña.
     */
    private static final int THRESHOLD = 1_000;

    /**
     * Arreglo que contiene los datos que procesa esta tarea.
     */
    private int[] array;
    /**
     * Indice de inicio para esta tarea.
     */
    private int start;
    /**
     * Cantidad de datos a procesar por esta tarea.
     */
    private int end;

    public ForkSum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    /**
     * Realiza el proceso principal de esta tarea.
     */
    @Override
    protected Integer compute() {
        //TODO: Implementar este método

        return null;
    }
}
