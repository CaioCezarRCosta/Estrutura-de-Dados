package com.caiocezar.main;

import java.util.Random;

/*
27.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];*/
public class Ex26 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] vetorA = new int[10];
        String [] vetorB = new String[vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(20);
        }
        for(int i = 0; i < vetorB.length; i++){
            if(vetorA[i]<7){
                vetorB[i] = "A";
            }
            else if(vetorA[i] == 7){
                vetorB[i] = "B";
            }
            else if(vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = "C";
            }
            else if(vetorA[i] == 10){
                vetorB[i] = "D";
            }
            else if(vetorA[i] > 10){
                vetorB[i] = "E";
            }
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor "+i+": "+vetorA[i]);
        }
        System.out.println("\nVetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.println("vetor "+i+": "+vetorB[i]);
        }
    }
}
