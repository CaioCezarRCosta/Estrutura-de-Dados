package com.caiocezar.main;

import java.util.Random;
/*
10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.
*/
public class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = vetorA[i] % 2 ;
            System.out.println("VetorA[" + i + "]: " + vetorA[i] + " | VetorB[" + i + "]: " + vetorB[i]);

        }

    }
}
