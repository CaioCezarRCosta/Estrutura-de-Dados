package com.caiocezar.main;

import java.util.Random;
public class Ex18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(100);
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
            if(vetor[i] > maiorIdade){
                maiorIdade = vetor[i];
            }

            else if(vetor[i] < menorIdade){
                menorIdade = vetor[i];
            }
        }
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
    }
}
