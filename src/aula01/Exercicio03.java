package aula01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");

        double valorEmprestado = entrada.nextDouble();

        System.out.println("Qual o prazo para pagamento: ");
        double prazo = entrada.nextDouble();

        final double TAXA = 0.02;

        double montanteDevido = valorEmprestado * (Math.pow((1 + TAXA), prazo));

        System.out.printf("O valor devido após a aplicação dos juros é de R$ %.2f.\n ", montanteDevido);

        entrada.close();
    }
}
