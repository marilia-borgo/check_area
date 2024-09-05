package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case SQUARE:
                return new Square(values[0]);
            default:
                return null;
        }
    }
}
