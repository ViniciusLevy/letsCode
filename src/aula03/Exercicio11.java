package aula03;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();

        for (int i = num1 + 1; i < num2; i++){
            System.out.println(i);
        }

        entrada.close();
    }
}
