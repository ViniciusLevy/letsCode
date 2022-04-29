package aula04;

import java.util.Arrays;
import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args) {

        Random random = new Random();

        double[] array = new double[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(100); ;
        }
        System.out.println(Arrays.toString(array));

    }
}
