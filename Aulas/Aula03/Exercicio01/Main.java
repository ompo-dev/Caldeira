import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio 1
        class ContaBancaria {
            private String nome;
            private int cpf;
            private int identificadorConta;
            private String banco;
            private String endereco;
            private double saldo;
            private int horarioAtual = LocalTime.now().getHour();
            private List<String> historicoTransacoes= new ArrayList<>();
            private double taxaManutencaoMensal;

            //int hora = LocalTime.now().getHour();

            // Construtor
            public ContaBancaria(String nome, int cpf, int identificadorConta, String banco, String endereco, double saldoInicial) {
                this.nome = nome;
                this.cpf = cpf;
                this.identificadorConta = identificadorConta;
                this.banco = banco;
                this.endereco = endereco;
                this.saldo = saldoInicial;
                this.horarioAtual = horarioAtual;
                this.historicoTransacoes = historicoTransacoes;
                this.taxaManutencaoMensal = 5.0; // Taxa de manutenção mensal de exemplo
            }

            public void saque(double valor) {
                if (valor <= saldo) {
                    saldo -= valor;
                    historicoTransacoes.add("Saque de " + valor + " realizado.");
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            }

            public void deposito(double valor) {
                saldo += valor;
                historicoTransacoes.add("Depósito de " + valor + " realizado.");
            }

            public void pix(double valor) {
                if (saldo >= valor && horarioAtual>=8 || horarioAtual<=19) {
                    saldo -= valor;
                    historicoTransacoes.add("Transferência PIX de " + valor + " realizada.");
                } else {
                    System.out.println("Saldo insuficiente ou horário não permitido para PIX.");
                }
            }

            public void transferencia(ContaBancaria destino, double valor) {
                if (horarioAtual>=8 || horarioAtual<=19) {
                    if (saldo >= valor) {
                        saldo -= valor;
                        destino.deposito(valor);
                        historicoTransacoes.add("Transferência de " + valor + " realizada para a conta de " + destino.getNome());
                    } else {
                        System.out.println("Saldo insuficiente para transferência.");
                    }
                } else {
                    System.out.println("Horário não permitido para transferência.");
                }
            }

            public void verificarSaldo() {
                System.out.println("Saldo atual: " + saldo);
            }

            public void verificarHorario() {
                System.out.println("Horário atual: " + horarioAtual);
            }

            public void verificarInformacoes() {
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Saldo: " + saldo);
                System.out.println("Banco: " + banco);
                System.out.println("Endereço: " + endereco);
                System.out.println("Identificador da Conta: " + identificadorConta);
            }

            public void alterarEndereco(String novoEndereco) {
                this.endereco = novoEndereco;
            }

            public void calcularJuros(double taxa) {
                double juros = saldo * (taxa / 100);
                saldo += juros;
                historicoTransacoes.add("Juros de " + taxa + "% calculados e adicionados.");
            }

            public void taxaManutencaoMensal() {
                if (saldo >= taxaManutencaoMensal) {
                    saldo -= taxaManutencaoMensal;
                    historicoTransacoes.add("Taxa de manutenção mensal de " + taxaManutencaoMensal + " debitada.");
                } else {
                    System.out.println("Saldo insuficiente para cobrar taxa de manutenção.");
                }
            }

            public void fecharConta() {
                saldo = 0;
                historicoTransacoes.add("Conta encerrada.");
            }

            public String getNome() {
                return nome;
            }

            public List<String> getHistoricoTransacoes() {
                return historicoTransacoes;
            }
        }
    }
}