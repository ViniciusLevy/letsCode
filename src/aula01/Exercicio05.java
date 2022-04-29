package aula01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu salário: ");
        double salario = entrada.nextDouble();

        double salarioReajustado = salario * (1 + 0.07);

        System.out.printf("Seu salário é de R$ %.2f com reajuste de 7%% vai para R$ %.2f.", salario, salarioReajustado );

        entrada.close();
    }
}
