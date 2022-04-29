package aula05;

/*
8. Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
* A quantidade de pessoas com mais de 90 quilos;
* A média das idades das sete pessoas;
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] pesos = new double[7];
        int[] idades = new int[7];
        double maior = Double.MIN_VALUE;
        int contador = 0;
        int somaIdades = 0;

        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Digite o peso da %dº pessoa: ", (i + 1));
            pesos[i] = entrada.nextInt();

            if (pesos[i] >= 90) {
                maior = pesos[i];
                contador++;
            }
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a idade da %dº pessoa: ", (i + 1));
            idades[i] = entrada.nextInt();
            somaIdades += idades[i];
        }

        System.out.println(Arrays.toString(pesos));
        System.out.println(Arrays.toString(idades));
        System.out.printf("A quantidade de pessoas com mais de 90 kg é: %d\n",contador);
        System.out.printf("A média da idade das pessoas é: %d", somaIdades / idades.length);

        entrada.close();
    }
}
