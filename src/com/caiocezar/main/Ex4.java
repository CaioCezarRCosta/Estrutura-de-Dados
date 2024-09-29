package com.caiocezar.main;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[15];
        int [] vetorB = new int[vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = (int) Math.round(Math.sqrt(vetorA[i]));
            System.out.println("VetorA[" + i + "]: " + vetorA[i] + " | VetorB[" + i + "]: " + vetorB[i]);

        }
    }
}
