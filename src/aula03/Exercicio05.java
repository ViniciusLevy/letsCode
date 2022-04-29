package aula03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Com peso normal");
        } else if(imc >= 25 && imc <= 29.9) {
            System.out.println("Com excesso de peso");
        } else {
            System.out.println("Obeso");
        }
        System.out.println(imc);
        entrada.close();
    }
}
