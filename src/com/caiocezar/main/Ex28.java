package com.caiocezar.main;

import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length+vetorB.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = rand.nextInt(100);
        }

        for(int i = 0; i < vetorA.length; i++){
                vetorC[i] = vetorA[i];
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorC[vetorA.length+ i] = vetorB[i];
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.print("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
