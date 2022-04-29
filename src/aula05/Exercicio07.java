package aula05;

import java.util.Scanner;

/*
7. Uma loja utiliza o código V para transação à vista e P para transação a prazo.
Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
* O valor total das compras à vista
* O valor total das compras a prazo.
* O valor total das compras efetuadas
* O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double prazo = 0;
        double vista = 0;
        double total = 0;
        double parcelas = 0;
        double valorDaCompra;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o código V para transação à vista e P para transação parcelada: ");
            String tipoDeCompra = entrada.next();
            System.out.print("Digite o valor da compra: ");
            valorDaCompra = entrada.nextDouble();

            if (tipoDeCompra.equals("p")) {
                prazo += valorDaCompra;
            } else if (tipoDeCompra.equals("v")) {
                vista += valorDaCompra;
            }

            total += valorDaCompra;
        }

        parcelas = prazo / 3;

        System.out.printf("O valor total das compras à vista é R$ %.2f\n",vista);
        System.out.printf("O valor total das compras a prazo é R$ %.2f\n",prazo);
        System.out.printf("O valor total de todas as compras é R$ %.2f\n",total);
        System.out.printf("A primeira parcela das compras a prazo será de R$ %.2f\n",parcelas);

        entrada.close();

    }
}
