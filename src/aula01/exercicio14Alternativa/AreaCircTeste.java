package aula01.exercicio14Alternativa;

import java.util.Scanner;

public class AreaCircTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio para calcular a área do círculo: ");
        AreaCirc a1 = new AreaCirc(entrada.nextDouble());

        System.out.printf("A área do circulo digitado é %.2f m",a1.area());

        entrada.close();
    }
}
