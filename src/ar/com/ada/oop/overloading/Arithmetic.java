package src.ar.com.ada.oop.overloading;

public class Arithmetic {
    public int sumandoA;
    public int sumandoB;
    public Integer sumandoC;
    public Integer sumandoD;
    public double sumandoE;
    public double sumandoF;
    public Double sumandoG;
    public Double sumandoH;

    public Arithmetic(int sumandoA, int sumandoB){
        this.sumandoA = sumandoA;
        this.sumandoB = sumandoB;
    }

    public Arithmetic(Integer sumandoC, Integer sumandoD){
        this.sumandoC = sumandoC;
        this.sumandoD = sumandoD;
    }
    public Arithmetic(int sumandoA, Integer sumandoC){
        this.sumandoA = sumandoA;
        this.sumandoC = sumandoC;
    }
    public Arithmetic(Integer sumandoC, int sumandoA){
        this.sumandoA = sumandoA;
        this.sumandoC = sumandoC;
    }
    public Arithmetic(double sumandoE,double sumandoF){
        this.sumandoE = sumandoE;
        this.sumandoF = sumandoF;
    }
    public Arithmetic(Double sumandoG, Double sumandoH){
        this.sumandoG = sumandoG;
        this.sumandoH = sumandoH;
    }
    public Arithmetic(double sumandoE, Double sumandoG){
        this.sumandoG = sumandoG;
        this.sumandoE = sumandoE;
    }
    public Arithmetic(Double sumandoG, double sumandoE){
        this.sumandoG = sumandoG;
        this.sumandoE = sumandoE;
    }

    public int Sum (){
         int resultado= sumandoA + sumandoB;
        return resultado;
    }

    public Integer SumInterger (){
        Integer resultado = sumandoC + sumandoD;
        return  resultado;
    }

}
