package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactoryImpl();

        Calculable square = factory.getShape(ShapeType.SQUARE, new Double[]{5.0});
        System.out.println("Área do quadrado: " + square.calcularArea());

        Calculable rectangle = factory.getShape(ShapeType.RECTANGLE, new Double[]{5.0, 10.0});
        System.out.println("Área do retângulo: " + rectangle.calcularArea());

        Calculable circle = factory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        System.out.println("Área do círculo: " + circle.calcularArea());

        Calculable triangle = factory.getShape(ShapeType.TRIANGLE, new Double[]{5.0, 10.0});
        System.out.println("Área do triângulo: " + triangle.calcularArea());

        Calculable parallelogram = factory.getShape(ShapeType.PARALLELOGRAM, new Double[]{5.0, 10.0});
        System.out.println("Área do paralelogramo: " + parallelogram.calcularArea());

        Calculable trapezo = factory.getShape(ShapeType.TRAPEZO, new Double[]{5.0, 10.0, 15.0});
        System.out.println("Área do trapézio: " + trapezo.calcularArea());

        Calculable hexagon = factory.getShape(ShapeType.HEXAGON, new Double[]{5.0});
        System.out.println("Área do hexágono: " + hexagon.calcularArea());

        Calculable diamond = factory.getShape(ShapeType.DIAMOND, new Double[]{5.0, 10.0});
        System.out.println("Área do losango: " + diamond.calcularArea());

        Calculable cube = factory.getShape(ShapeType.CUBE, new Double[]{5.0});
        System.out.println("Área do cubo: " + cube.calcularArea());
    }
}

