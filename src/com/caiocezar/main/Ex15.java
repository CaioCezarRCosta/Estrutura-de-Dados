package com.caiocezar.main;

import java.util.Random;
/*
15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/
public class Ex15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int countPar = 0;
        float percentPar = 0;
        int countImpar = 0;
        float percentImpar = 0;
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(100);
            if(vetor[i]%2 == 0){ //par
                countPar++;
            }else{
                countImpar++;
            }
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
        }
        percentPar = (float) countPar/vetor.length * 100;
        percentImpar = (float) countImpar/vetor.length * 100;
        System.out.println("Percentual de pares: " + percentPar + "%");
        System.out.println("Percentual de ímpares: " + percentImpar + "%");
    }
}
