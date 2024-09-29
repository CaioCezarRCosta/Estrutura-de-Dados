package com.caiocezar.main;

import java.util.Random;
/*
13.Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/
public class Ex13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int acum = 0;
        for(int i =0; i<vetor.length; i++){
            vetor[i] = rand.nextInt(1,100);
            if(vetor[i]%5 ==0){
                acum = acum + vetor[i];
            }
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
        System.out.println("A soma dos números divisíveis por 5 é : "+ acum);
    }
}
