package com.caiocezar.main;

import java.util.Random;
/*
16.Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/
public class Ex16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetor = new int[10];
        int acumMenorQuinze = 0;
        int countIgualQuinze = 0;
        int acumMaiorQuinze = 0;
        int countMaiorQuinze = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1,25);
            System.out.println("Vetor [" + i + "]: " + vetor[i]);

            //A)
            if(vetor[i]< 15){
                acumMenorQuinze = acumMenorQuinze + vetor[i];
            }
            //B)
            else if(vetor[i] == 15){
                countIgualQuinze++;
            }
            //C)
            else{
                acumMaiorQuinze = acumMaiorQuinze + vetor[i];
                countMaiorQuinze++;
            }
        }
        System.out.println("Soma dos elementos menores que 15: " + acumMenorQuinze);
        System.out.println("Quantidade de elementos iguais a 15: " + countIgualQuinze);
        if(countMaiorQuinze > 0) {
            float  media =(float) acumMaiorQuinze / countMaiorQuinze;
            System.out.println("Média dos elementos maiores que 15: " + media);
        }else{
            System.out.println("Não há elementos maiores que 15 para calcular a média.");
        }
    }
}
