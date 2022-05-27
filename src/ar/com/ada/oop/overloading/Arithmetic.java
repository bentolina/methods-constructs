package src.ar.com.ada.oop.overloading;

public class Arithmetic {

    public int sum(int sumandoA, int sumandoB) {
        int resultado = sumandoA + sumandoB;
        return resultado;
    }

    public int sum(Integer sumandoA, int sumandoB) {
        int resultado = sumandoA + sumandoB;
        return resultado;
    }

    public int sum(int sumandoA, Integer sumandoB) {
        int resultado = sumandoA + sumandoB;
        return resultado;
    }
    public Integer sum(Integer sumandoA, Integer sumandoB) {
        Integer resultado = sumandoA + sumandoB;
        return resultado;
    }

    public double sum (double sumandoA , double sumandoB){
        double resultado = sumandoA+sumandoB;
        return resultado;
    }

    public double sum (Double sumandoA , double sumandoB){
        double resultado = sumandoA+sumandoB;
        return resultado;
    }

    public double sum (double sumandoA , Double sumandoB){
        double resultado = sumandoA+sumandoB;
        return resultado;
    }
    public Double sum (Double sumandoA , Double sumandoB){
        Double resultado = sumandoA+sumandoB;
        return resultado;
    }

}


