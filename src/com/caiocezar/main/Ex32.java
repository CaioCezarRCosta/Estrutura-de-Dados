package com.caiocezar.main;

import java.util.Random;

public class Ex32 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetorA = new int[10];

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(100);
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVerificação de números primos:");
        for (int i = 0; i < vetorA.length; i++) {
            if (isPrimo(vetorA[i])) {
                System.out.println(vetorA[i] + " é primo");
            } else {
                System.out.println(vetorA[i] + " não é primo");
            }
        }
    }


    public static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
