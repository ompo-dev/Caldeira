package aula04.exercicio02;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica retangulo = new Retangulo(5,10);
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica triangulo = new Triangulo(5,10);
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica losango = new Losango(5,10);

        System.out.println("Area do retangulo: "+ retangulo.calcularArea());
        System.out.println("Area do circulo: "+ circulo.calcularArea());
        System.out.println("Area do tringulo: "+ triangulo.calcularArea());
        System.out.println("Area do quadrado "+ quadrado.calcularArea());
        System.out.println("Area do Losago "+ losango.calcularArea());
    }
}
