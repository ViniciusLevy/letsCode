package aula01;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o custo do produto: ");
        double custoProduto = entrada.nextDouble();

        System.out.print("Digite a margem do produto (apenas números): ");
        double margemProduto = entrada.nextDouble();

        double conversaoMargemProduto = margemProduto / 100;

        double precoVendaProduto = custoProduto * (1 + conversaoMargemProduto);

        System.out.printf("O valor de venda do produto é R$ %.2f (custo: R$ %.2f, margem: %.2f%%)",
                precoVendaProduto, custoProduto, margemProduto);

        entrada.close();
    }
}
