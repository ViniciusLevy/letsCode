package aula01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para x: ");
        int x = entrada.nextInt();

        System.out.print("Digite um segundo valor para y: ");
        int y = entrada.nextInt();

        System.out.printf("Para os valores x = %d e y = %d temos as seguintes operações: \n", x, y);
        System.out.printf("soma  %d + %d = %d \n", x, y, x + y);
        System.out.printf("subtracao %d - %d = %d \n", x, y, x - y);
        System.out.printf("multiplicação %d * %d = %d \n", x, y, x * y);
        System.out.printf("divisão %d / %d = %d \n", x, y, x / y);

        entrada.close();
    }
}