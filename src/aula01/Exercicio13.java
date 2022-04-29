package aula01;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o custo de fábrica do veículo: ");
        double custoVeiculo = entrada.nextDouble();

        double porcentagemDistribuidor = custoVeiculo * 0.28;
        double impostos = custoVeiculo * 0.45;

        double precoFinal = custoVeiculo + porcentagemDistribuidor + impostos;

        System.out.printf("O preço final do veículo é R$ %.2f (Distribuidor 28%%: R$ %.2f " +
                "| Impostos 45%%: R$ %.2f", precoFinal, porcentagemDistribuidor, impostos );

        entrada.close();
    }

}
