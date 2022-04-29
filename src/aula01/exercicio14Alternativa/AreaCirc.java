package aula01.exercicio14Alternativa;

public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raio) {
        this.raio = raio;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }



}
