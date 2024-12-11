package Exo2;

public class Calculatrice {
    private double a;
    private double b;

    public Calculatrice(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addition(){
        return a + b;
    }
    public double soustraction(){
        return a - b;
    }
    public double multiplication(){
        return a * b;
    }
    public double division(){
        return a / b;
    }

}
