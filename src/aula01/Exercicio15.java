package aula01;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de cavalos: ");
        int cavalos = entrada.nextInt();

        int ferraduras = cavalos * 4;

        System.out.printf("Serão necessárias %d ferraduras para a quantidade de cavalos inserida.", ferraduras);

        entrada.close();
    }
}
