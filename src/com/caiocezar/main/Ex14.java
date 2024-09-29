package com.caiocezar.main;

import java.util.Random;
/*
14.Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor
*/
public class Ex14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int count = 0;
        int acum = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            if(!(vetor[i]%2 ==0)) {
                count++;
                acum += vetor[i];
            }
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
        }

        if(count >0){
            System.out.println("Média dos números ímpares: " + (double) acum / count);
        }else{
            System.out.println("Não há números impares no vetor");
        }
    }
}
