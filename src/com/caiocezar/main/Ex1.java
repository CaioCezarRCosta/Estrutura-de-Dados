package com.caiocezar.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = vetorA[i];
            System.out.println("VetorA: " + vetorA[i] + "\nVetorB: " + vetorB[i]);
        }
        System.out.println();
    }
}