package aula02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = entrada.nextLine();

        System.out.print("Digite seu CEP: ");
        int cep = entrada.nextInt();


        System.out.printf("Seu nome é: %s \nSeu endereço é: %s \nSeu CEP é: %d", nome, endereco, cep);




        entrada.close();
    }

}
