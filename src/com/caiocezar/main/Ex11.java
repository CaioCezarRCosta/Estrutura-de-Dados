package com.caiocezar.main;

import java.util.Random;
/*
11.Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/
public class Ex11 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] vetorA  = new int[10];
        int cont = 0;
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            if(vetorA[i]%2==0) {
                cont++;
            }
            System.out.println("VetorA[" + i + "]: " + vetorA[i]);

        }
        System.out.println("O total de número pares é: "+ cont);
    }
}
