package aula01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite em kg a massa a ser levantada: ");
        double massa = entrada.nextDouble();

        System.out.print("Digite a altura em metros a ser levantada:  ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o tempo desejado de levantamento em segundos:  ");
        double tempo = entrada.nextDouble();

        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.printf("A quantidade de cavalos necessária para levantar a massa de %.2f será de %.2f. \n", massa, cavalos);

        entrada.close();

    }
}

