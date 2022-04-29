package aula03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(numeros));

        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 5; j++) {
                if(numeros[j] < numeros[i]){
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));

        entrada.close();
    }
}
