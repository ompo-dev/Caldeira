package aula04.exercicio02;

public class Triangulo extends FormaGeometrica{

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (base * altura)  / 2 ;
    }
}
