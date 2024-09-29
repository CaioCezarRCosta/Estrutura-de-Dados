package com.caiocezar.main;

import java.util.Random;
/*
17.Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/
public class Ex17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1,60);
            if(vetor[i]> 35){
                count = count + 1;
            }
        }
        System.out.println("Quantidade de pessoas com idade superior a 35 anos: " + count);
    }
}
