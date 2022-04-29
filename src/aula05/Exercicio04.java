package aula05;

/*
4. Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela
e calcule a multa que uma pessoa vai receber, sabendo que são pagos:
a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h;
motorista a 60km/h ou a 56km/h);
b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade do veículo: ");
        int velocidade = scanner.nextInt();

        if (velocidade <= 60) {
            System.out.printf("Velocidade: %d km/h, MULTA DE R$ 50,00, VELOCIDADE 10KM ACIMA DO PERMITIDO", velocidade);
        } else if (velocidade <= 80 ) {
            System.out.printf("Velocidade: %d km/h, MULTA DE R$ 100,00, VELOCIDADE 11 A 30KM ACIMA DO PERMITIDO", velocidade);
        } else {
            System.out.printf("Velocidade: %d km/h, MULTA DE R$ 200,00, VELOCIDADE 31KM ACIMA DO PERMITIDO", velocidade);
        }

        scanner.close();
    }
}
