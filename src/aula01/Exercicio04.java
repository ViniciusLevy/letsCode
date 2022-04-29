package aula01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        int diasVividos = idade * 365;

        System.out.printf("Com %d anos de idade você já viveu %d dias.", idade, diasVividos);

        entrada.close();
    }
}
