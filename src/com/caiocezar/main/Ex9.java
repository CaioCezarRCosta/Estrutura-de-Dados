package com.caiocezar.main;
import java.text.DecimalFormat;
import java.util.Random;
public class Ex9 {

    public static void main (String [] args){
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.00");
        int  [] vetorA = new int[10];
        int  [] vetorB = new int[vetorA.length];
        double  [] vetorC = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = rand.nextInt(1,100);
            vetorC[i] = (double)vetorA[i]/ vetorB[i];
            System.out.println("VetorA[" + i + "]: " + vetorA[i] + " | VetorB[" + i + "]: " + vetorB[i] + " | VetorC[" + i + "]: " + df.format(vetorC[i]));

        }
    }

}
