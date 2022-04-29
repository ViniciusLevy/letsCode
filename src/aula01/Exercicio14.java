package aula01;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio para calcular a Área: ");
        double raio = entrada.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A área do circulo digitado é %.2f m²", area);

        entrada.close();
    }
}
