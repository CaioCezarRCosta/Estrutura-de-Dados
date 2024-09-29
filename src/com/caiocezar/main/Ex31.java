package com.caiocezar.main;

import java.util.Random;

public class Ex31 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[5];
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(6);
            System.out.print(vetorA[i]+ " ");
        }

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Tabuada do " + vetorA[i] + ": ");
            System.out.println();
            for(int j = 0; j <=10; j++){
                System.out.println(vetorA[i] + " * " + j + " = " + (vetorA[i] * j));
            }

        }


    }
}
