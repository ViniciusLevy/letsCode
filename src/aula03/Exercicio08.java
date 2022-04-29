package aula03;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Insira o número de ordem " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int maiorValor = numeros[0];
        int menorValor = numeros[0];


        for(int i = 0; i < 10; i++){
            if(numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
        }
        int totalNumeros = 0;
        for(int i = 0; i < numeros.length; i++){
            totalNumeros += numeros[i];
        }

        System.out.printf("O maior valor inserido é %d\n", maiorValor);
        System.out.printf("O menor valor inserido é %d\n", menorValor);
        System.out.printf("A média dos números inseridos é %d", totalNumeros/ numeros.length);

        entrada.close();

    }
}
