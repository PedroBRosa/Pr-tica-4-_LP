package Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int notas [] = new int[10];
        int acumulador=0, media;
        Scanner ler = new Scanner(System.in);
        for (int i=0;i<notas.length;i++){
            System.out.printf("Escreva a %d° nota: \n",i+1);
            notas[i] = ler.nextInt();
            acumulador+=notas[i];
        }
        Arrays.sort(notas);
        System.out.println("A maior nota é: "+notas[9]);
        System.out.println("A segunda maior nota é: "+notas[8]);
        System.out.println("A terceira maior nota é: "+notas[7]);
        System.out.println("A menor nota é: "+notas[0]);
        System.out.println("A media das notas : "+(media=acumulador/10));
    }
}
