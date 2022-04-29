package aula01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor para conversão da moeda: ");
        double valorInicial = entrada.nextDouble();

        double dolar = 4.70;
        double euro = 5.11;
        double libra = 6.12;

        System.out.printf(
                "O valor de R$ %.2f tem as seguintes conversões: U$ %.2f, € %.2f, £ %.2f.",
                valorInicial, (valorInicial * dolar), (valorInicial * euro), (valorInicial * libra));
        entrada.close();
    }
}
