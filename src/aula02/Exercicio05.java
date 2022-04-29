package aula02;


import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o tempo da viagem em horas: ");
        double tempo = entrada.nextDouble();
        System.out.print("Insira a velocidade média da viagem: ");
        double velocidade = entrada.nextDouble();

        int kmPorLitro = 12;

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / kmPorLitro;

        System.out.printf("O consumo no percurso foi de %.2f km/litro,", litrosUsados);

        entrada.close();
    }
}





