package com.caiocezar.main;

import java.util.Scanner;

/*
Números palíndromos são aqueles que escritos da direita para a
esquerda têm o mesmo valor quando escritos da esquerda para a
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
programa que verifique se um dado vetor A de 10 elementos inteiros é
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
último, se o segundo elemento do vetor é igual ao penúltimo e assim
por diante até verificar todos os elementos ou chegar a conclusão que
o vetor não é um palíndromo.
*/
public class Ex23 {
    public static void main(String[] args) {
        int [] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }
        boolean palindromo = true;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] != vetor[vetor.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        if(palindromo) {
            System.out.println("Palindromo");
        }
        else{
            System.out.println("Não é palindromo");
        }
    }
}
