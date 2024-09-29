package com.caiocezar.main;

import java.util.Random;

/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A*/
public class Ex21 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int countUm = 0;
        int countZero = 0;
        double percentUm = 0;
        double percentZero = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(2);
            if(vetor[i] == 0){
                countZero++;
            }else{
                countUm++;
            }
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
        }
        percentUm = (double) countUm / vetor.length * 100;
        percentZero = (double) countZero / vetor.length * 100;
        System.out.println("Percentual de 1's: " + percentUm + "%");
        System.out.println("Percentual de 0's: " + percentZero + "%");
    }
}
