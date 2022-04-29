package aula03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
            System.out.printf("Sua média é %.2f, Aprovado!", media);
        } else {
            System.out.printf("\"Sua média é %.2f, Recuperação!", media);
        }

        entrada.close();


    }
}
