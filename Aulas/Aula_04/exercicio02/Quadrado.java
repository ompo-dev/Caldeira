package aula04.exercicio02;

public class Quadrado extends FormaGeometrica{

    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }
}
