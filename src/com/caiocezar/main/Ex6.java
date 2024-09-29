package com.caiocezar.main;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = rand.nextInt(100);
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("VetorA[" + i + "]: " + vetorA[i] + " | VetorB[" + i + "]: " + vetorB[i] + " | VetorC[" + i + "]: " + vetorC[i]);
        }
    }
}
