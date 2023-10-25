package aula04.exercicio01;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro("fiat", "4 roda", 2023);
        Veiculo moto = new Moto("fiat", "2 roda", 2023);

        System.out.println("Custo com a viagem de carro " + carro.calcularCustoViagem(200));
        System.out.println("Custo com a viagem de moto " + moto.calcularCustoViagem(200));
    }
}
