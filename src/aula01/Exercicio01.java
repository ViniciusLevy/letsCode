package aula01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = entrada.nextDouble();

        System.out.println(tempCelsius);

        double tempKelvin = tempCelsius + 273.15;
        System.out.printf("A temperatura digitada de %.2fºC equivale a %.2fºK \n", tempCelsius, tempKelvin);

        double tempFahrenheit = tempCelsius * 1.8 + 32;
        System.out.printf("A temperatura digitada de %.2fºC equivale a %.2fºF \n", tempCelsius, tempFahrenheit);

        double tempRankine = tempCelsius * 1.8 + 32 + 459.67;
        System.out.printf("A temperatura digitada de %.2fºC equivale a %.2fºF \n", tempCelsius, tempRankine);

        double tempReaumur = tempCelsius * 0.8;
        System.out.printf("A temperatura digitada de %.2fºC equivale a %.2fºF", tempCelsius, tempReaumur);

        entrada.close();

    }
}
