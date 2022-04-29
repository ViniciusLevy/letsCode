package aula03;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        if(nome.length() < 3){
            System.out.print("Nome inválido, deve conter mín 3 caracteres.\n");
        }else {
            System.out.printf("Nome: %s é válido.\n", nome);
        }

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 0 && idade <= 150) {
            System.out.printf("A idade %d é válida.\n", idade);
        } else {
            System.out.printf("A idade %d é inválida, deve estar entre 0 e 150.\n", idade);
        }

        System.out.print("Digite seu Salário: ");
        double salario = entrada.nextDouble();
        entrada.nextLine();

        if(salario > 0) {
            System.out.printf("O salário R$ %.2f é válido\n", salario);
        } else {
            System.out.printf("O salário R$ %.2f é inválido, deve ser maior que zero.\n", salario);
        }

        System.out.print("Digite seu sexo, \"f\" p/ feminino ou \"m\" p/ masculino : ");
        String sexo = entrada.nextLine();

        if((Objects.equals(sexo, "f")) || (Objects.equals(sexo, "m"))) {
            System.out.println("Entrada válida\n");
        } else {
            System.out.println("Apenas os caracteres \"f\" ou \"m\" são aceitos\n");
        }

        System.out.print("Digite seu estado civil:\n \"s\" p/ solteiro\n " +
                "\"c\" p/ casado\n \"v\" p/ viúvo\n \"d\" p/ divociado\n Resposta: ");
        String estadoCivil = entrada.nextLine();

        if((Objects.equals(estadoCivil, "s")) || (Objects.equals(estadoCivil, "c"))
                || (Objects.equals(estadoCivil, "v")) || (Objects.equals(estadoCivil, "d"))) {
            System.out.println("Entrada válida");
        } else {
            System.out.println("Apenas os caracteres \"s\", \"c\", \"v\" ou \"d\" são aceitos");
        }

        System.out.printf("Seu nome é %s, você tem %d anos, seu salário é R$ %.2f, " +
                "seu sexo é %s e seu estado civil é %s.", nome, idade, salario, sexo, estadoCivil);

        entrada.close();
    }
}
