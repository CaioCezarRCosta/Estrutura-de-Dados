package com.caiocezar.main;

import java.util.Random;

/*
.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.*/
public class Ex25 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = rand.nextInt(100);
        }
        for(int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }
            else if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
            else{
                vetorC[i] = 0;
            }
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("\nVetor C: ");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }


}
