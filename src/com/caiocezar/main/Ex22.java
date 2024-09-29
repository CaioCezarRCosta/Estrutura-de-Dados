package com.caiocezar.main;

import java.util.Random;

/*
Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito*/
public class Ex22 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(20);
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
        }
        System.out.println("\nVerificando números pares no vetor:");
        for (int i = 0; i<vetor.length ;i++) {
            if (!(vetor[i] % 2 == 0)) {
                System.out.println("Número ímpar encontrado em Vetor [" + i + "]: " + vetor[i]);
                break;
            }
            System.out.println("Vetor [" + i + "]: " + vetor[i]);
        }
    }
}
