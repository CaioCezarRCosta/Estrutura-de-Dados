package com.caiocezar.main;

import java.util.Random;

public class Ex29 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[20];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];
        int indexB = 0;
        int indexC = 0;
        // Preencher vetor A
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(100);

        }

        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i]%2 == 0) {
                vetorB[indexB++] = vetorA[i];
            }else{
                vetorC[indexC++] = vetorA[i];
            }
        }
        System.out.print("\n Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]+" ");
        }
        System.out.print("\n Vetor B: ");
        for(int i = 0; i < indexB; i++) {
            System.out.print(vetorB[i]+" ");
        }
        System.out.print("\n Vetor C: ");
        for(int i = 0; i < indexC; i++) {
            System.out.print(vetorC[i]+" ");
        }
    }
}
