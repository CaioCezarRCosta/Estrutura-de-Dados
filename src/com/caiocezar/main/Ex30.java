package com.caiocezar.main;

import java.util.Random;

public class Ex30 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[20];
        int [] vetorB = new int[vetorA.length];
        int index = 0;
        // Preenchendo vetor A
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
        }
        //Preencher vetorB pares

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i]%2 == 0){
                vetorB[index] = vetorA[i];
                index++;
            }
        }
        //Preencher vetor B Impares
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                vetorB[index] = vetorA[i];
                index++;
            }
        }

        //Exibição
        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
