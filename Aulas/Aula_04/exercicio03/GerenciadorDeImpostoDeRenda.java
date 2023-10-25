package aula04.exercicio03;

public class GerenciadorDeImpostoDeRenda {

    private double totalTributos = 0;

    public void adicionar(Tributavel tributavel){
        totalTributos += tributavel.calculaTributos();
    }
    public double getTotalTributos() {
        return totalTributos;
    }
}
