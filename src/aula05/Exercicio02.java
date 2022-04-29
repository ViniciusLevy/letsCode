package aula05;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a
11% do salário bruto, mas não é descontado (é a empresa que deposita.)
 salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor
 da sua hora e a quantidade de horas trabalhadas no mês.
 a. Desconto do IR;
 b. Salário Bruto até R$900,00 (inclusive) – Isento;
 c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
 d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
 e. Salário bruto acima de 2500 – Desconto de 20%.
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhas no mês: ");
        double horasMes = scanner.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double salarioLiquido = 0;

        if (salarioBruto > 2500) {
            salarioLiquido += salarioBruto * (0.80);
            System.out.println("Desconto de IR de 20%");
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            salarioLiquido += salarioBruto * (0.90);
            System.out.println("Desconto de IR de 10%");
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            salarioLiquido += salarioBruto * (0.95);
            System.out.println("Desconto de IR de 5%");
        } else {
            salarioLiquido += salarioBruto;
            System.out.println("Não há desconto de IR");
        }

        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        System.out.printf("Seu salário bruto é de R$ %.2f \nSeu salário líquido é de R$ %.2f \n" +
                "Sindicato (3%%): %.2f \nFGTS(sem desconto): R$ %.2f ", salarioBruto, salarioLiquido, sindicato, fgts);

        scanner.close();
    }


}
