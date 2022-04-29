package aula03;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para saber seu fatorial: ");
        int numero = entrada.nextInt();
        int f = numero;

        while(numero > 1) {
            f = f * (numero - 1);
            numero--;
            System.out.println(f);
        }

        entrada.close();
    }
}
