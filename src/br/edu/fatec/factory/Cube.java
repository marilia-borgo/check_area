package br.edu.fatec.factory;

public class Cube implements Calculable {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calcularArea() {
        return 6 * side * side;
    }
}
