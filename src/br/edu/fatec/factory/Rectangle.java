package br.edu.fatec.factory;

class Rectangle implements Calculable {
    private double lado1;
    private double lado2;


    public Rectangle(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}