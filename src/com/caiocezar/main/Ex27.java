package com.caiocezar.main;

import java.util.Random;
/*
Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/
public class Ex27 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[vetorA.length - i - 1];
            System.out.print(vetorB[i] + " ");
        }

    }
}
