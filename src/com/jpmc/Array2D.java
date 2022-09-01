package com.jpmc;

public class Array2D {
    public static void main(String[] args) {
//        int array[][] = new int[rows][cols]
        int population[][] = new int[3][4];
//        arrya.length shows number of rows
        System.out.println(population.length);
//        array[rowindex].length shows number of columns for that row index
        System.out.println(population[0].length);
        int i = 0;
        int j = 0;
        for (i=0; i< population.length; i++) {
            for (j=0;j < population[i].length; j++) {
                // when i is 0, j = 0,1,2,3
                population[i][j] = i+j;
            }
        }
        System.out.println(population[i][j]);
    }
}
