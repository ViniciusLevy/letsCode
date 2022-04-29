package aula01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a quantidade de km percorridos: ");
        double kmPercorrido = entrada.nextDouble();
        System.out.print("Insira a quantidade de litros gastos: ");
        double litrosGastos = entrada.nextDouble();

        double consumoMedio = kmPercorrido / litrosGastos;

        System.out.printf("O consumo médio do automóvel é %.2f km/litro.", consumoMedio);

        entrada.close();
    }
}
