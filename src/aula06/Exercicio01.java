package aula06;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double melhorSalto = Double.MIN_VALUE;
        double piorSalto = Double.MAX_VALUE;

        double[] saltos = new double[5];

        for (int i = 0; i < saltos.length; i++) {
            System.out.print("Digite o salto nº " + (i + 1) + ": ");
            saltos[i] = scanner.nextDouble();

            if (melhorSalto < saltos[i]) {
                melhorSalto = saltos[i];
                saltos[i] = 0;
            } else if (piorSalto > saltos[i]) {
                piorSalto = saltos[i];
                saltos[i] = 0;
            }

        }






        System.out.println(melhorSalto);
        System.out.println(piorSalto);
    }
}
