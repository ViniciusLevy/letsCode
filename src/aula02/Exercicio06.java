package aula02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite um número: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite um número: ");
        double n3 = entrada.nextDouble();
        System.out.print("Digite um número: ");
        double n4 = entrada.nextDouble();

        double quadradoN1 = Math.pow(n1, 2);
        double quadradoN2 = Math.pow(n2, 2);
        double quadradoN3 = Math.pow(n3, 2);
        double quadradoN4 = Math.pow(n4, 2);

        System.out.printf("O quadrado de %.2f é %.2f, de %.2f é %.2f, de %.2f é %.2f e de %.2f é %.2f\n",
                n1, quadradoN1, n2, quadradoN2, n3, quadradoN3, n4, quadradoN4);

        double soma = quadradoN1 + quadradoN2 +quadradoN3 + quadradoN4;

        System.out.printf("A soma dos quadrados %.2f, %.2f, %.2f e %.2f é %.2f.",
                quadradoN1, quadradoN2, quadradoN3, quadradoN4, soma);

        entrada.close();
    }
}
