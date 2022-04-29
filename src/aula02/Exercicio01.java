package aula02;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a quantidade de notas: ");
        int tamanho = entrada.nextInt();

        double[] notas = new double[tamanho];

        for(int i = 0; i < tamanho; i++ ) {
            System.out.print("Insira a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;

        System.out.println("A média é " + media);

        System.out.println("As notas inseridas foram: " +  Arrays.toString(notas));

        entrada.close();
    }
}
