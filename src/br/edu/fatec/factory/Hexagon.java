package br.edu.fatec.factory;

public class Hexagon implements Calculable {
    private double lado;

    public Hexagon(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}
