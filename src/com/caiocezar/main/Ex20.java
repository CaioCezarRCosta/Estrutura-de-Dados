package com.caiocezar.main;

import java.text.DecimalFormat;

/*
20.Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20*/
public class Ex20 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        double dolar = 5.49;
        double  [] vetorA = new double [20];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = dolar * (i + 1);
            System.out.println("A[" + (i + 1) + "] = " + df.format(vetorA[i]));
        }
    }
}
