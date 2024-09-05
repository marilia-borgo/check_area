package br.edu.fatec.factory;

public class Triangle implements Calculable {
    private double base;
    private double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
    
}
