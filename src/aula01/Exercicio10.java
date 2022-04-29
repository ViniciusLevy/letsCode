package aula01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor a ser depositado: ");
        double valor = entrada.nextDouble();

        double saldo = valor * (1 + 0.07);

        System.out.printf("O valor depositado é de R$ %.2f, " +
                "seu saldo atual com rendimentos é de: R$ %.2f.", valor, saldo);

        entrada.close();
    }
}
