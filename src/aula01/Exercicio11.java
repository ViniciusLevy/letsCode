package aula01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor total da compra: ");
        double totalCompra = entrada.nextDouble();

        System.out.print("Gostaria de parcelar em até 5x sem juros? Insira a quantidade de parcelas: ");
        int prestacoes = entrada.nextInt();

        while(prestacoes > 5) {
            if (prestacoes > 0 && prestacoes <= 5) {
                double valorPrestacao = totalCompra / prestacoes;
                System.out.printf("Total: R$ %.2f. Compra em %d prestações sem juros de R$ %.2f.",
                        totalCompra, prestacoes, valorPrestacao);
            } else if (prestacoes == 0) {
                System.out.printf("Total: R$ %.2f.", totalCompra);
            } else {
                System.out.println("VALOR DE PARCELAS INVÁLIDO, DIGITE NOVAMENTE");
            }
        }
        entrada.close();
    }
}

