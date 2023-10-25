package aula04.exercicio01;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.2;
    }
}

