package aula05.exercicio06;

/* Crie um programa Java que represente um sistema de reservas de passagens de avião.
 O programa deve permitir que os usuários reservem passagens, cancelem reservas e exibam a lista de reservas.
  Use uma LinkedList para representar as reservas de passagens. Reserva deve ser uma classe do seu código com os atributos:
nome, local, cpf de quem reservou, data de entrada e data de saída, e métodos que você julgue necessários.*/
public class Reserva {

    private Cliente tituar;

    private String local;

    private String dataInicio;

    private String dataFim;

    public Cliente getTituar() {
        return tituar;
    }

    public String getLocal() {
        return local;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void InformacoesDaViagem(){
        System.out.println("Titular: " + tituar.getNome());
        System.out.println("Cpf do Titular: " + tituar.getCpf());
        System.out.println("Local da Reserva: " + local);
        System.out.println("Data de Inicio: " + dataInicio);
        System.out.println("Data do Fim: " + dataInicio);
    }

    public Reserva(Cliente tituar, String local, String dataInicio, String dataFim) {
        this.tituar = tituar;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
