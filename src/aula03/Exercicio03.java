package aula03;

public class Exercicio03 {

    public static void main(String[] args) {

        int i = 0;
        for(i = 0; i <= 100; i++){
            System.out.println("numero " + i);
            if(i % 10 == 0) {
                System.out.println("Número Multiplo de 10");

            }
        }
    }
}
