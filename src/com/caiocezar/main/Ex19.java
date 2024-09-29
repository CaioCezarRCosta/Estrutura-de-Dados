package com.caiocezar.main;

import java.text.DecimalFormat;
import java.util.Random;

public class Ex19 {
    public static void main(String[] args) {
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        double [] notas1 = new double[10];
        double [] notas2 = new double[notas1.length];
        double [] resultado = new double[notas1.length];
        for (int i = 0; i < notas1.length; i++) {
            notas1[i] = 1 + (99 * rand.nextDouble());
            notas2[i] = 1 + (99 * rand.nextDouble());
            resultado[i] = (notas1[i] + notas2[i])/2;
        }
        System.out.println("Notas 1: ");
        for(int i = 0; i < notas1.length; i++){
            System.out.println(df.format(notas1[i]));
        }
        System.out.println("Notas 2: ");

        for(int i = 0; i < notas2.length; i++){
            System.out.println(df.format(notas2[i]));
        }
        System.out.println("\nResultado: ");
        for (int i = 0; i < resultado.length; i++) {
            if(resultado[i] >= 70) {
                System.out.println("Aprovado");
                System.out.println(resultado[i]);
            }else{
                System.out.println("Reprovado");
                System.out.println(resultado[i]);
            }
        }

    }
}
