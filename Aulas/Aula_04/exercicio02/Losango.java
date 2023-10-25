package aula04.exercicio02;

public class Losango extends FormaGeometrica{

    private final double Diagonal1;
    private final double Diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        Diagonal1 = diagonal1;
        Diagonal2 = diagonal2;
    }

    @Override
    public double calcularArea() {
        return (Diagonal1 * Diagonal2) /2;
    }
}
