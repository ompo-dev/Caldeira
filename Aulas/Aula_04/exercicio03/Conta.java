package aula04.exercicio03;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Nao foi possivel sacar");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
