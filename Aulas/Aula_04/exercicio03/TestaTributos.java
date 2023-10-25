package aula04.exercicio03;

public class TestaTributos {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(5000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        GerenciadorDeImpostoDeRenda gerencia = new GerenciadorDeImpostoDeRenda();

        adicionaSeTributavel(gerencia,contaCorrente);
        adicionaSeTributavel(gerencia,contaPoupanca);
        adicionaSeTributavel(gerencia,seguroDeVida);

        System.out.println("Total de tributos para pagar R$"+ gerencia.getTotalTributos());

    }

    public static void adicionaSeTributavel(GerenciadorDeImpostoDeRenda gerencia, Object objeto){
        if (objeto instanceof Tributavel) {
            gerencia.adicionar((Tributavel)objeto);
        }else{
            System.out.println( objeto.getClass().getSimpleName() + " Nao e tributavel");
        }
    }
}
