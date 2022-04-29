package aula05;
/*
Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma,
o nº de cigarros fumados por dia e
o preço de uma carteira com 20 cigarros.
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A quantos anos você fuma? ");
        int anosFumando = scanner.nextInt();

        System.out.println("Quantos cigarros, fuma por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.println("Qual o valor de uma carteira de 20 cigarros? ");
        double valorCarteira = scanner.nextDouble();

        double totalDeCigarrosDia = anosFumando * 365 * cigarrosPorDia;
        double carteirasFumadas = totalDeCigarrosDia / 20;
        double valorGasto = carteirasFumadas * valorCarteira;

        System.out.printf("Você já gastou com cigarro R$ %.2f.",valorGasto);

        scanner.close();

    }
}
