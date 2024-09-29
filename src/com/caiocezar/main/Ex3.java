package com.caiocezar.main;

import java.util.Random;
public class Ex3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int [15];
        int [] vetorB = new int [vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = (int) Math.pow(vetorA[i],2);
            System.out.println("VetorA: " + vetorA[i] + "\nVetorB: " + vetorB[i]);
            System.out.println();
        }

    }
}
