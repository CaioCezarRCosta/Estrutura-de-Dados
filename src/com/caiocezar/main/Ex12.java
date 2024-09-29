package com.caiocezar.main;

import java.util.Random;
/*
12.Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/
public class Ex12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int acum= 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            acum = acum + vetor[i];
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
        System.out.println("A soma dos vetores é: " + acum);
    }
}
