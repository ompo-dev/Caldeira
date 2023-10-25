package aula05.exercicio04;

public class Compra {

    private String nome;
    private String dataDeValidade;

    public Compra(String nome, String data) {
        this.nome = nome;
        this.dataDeValidade = data;
    }

    public String getNome() {
        return nome;
    }


    public String getData() {
        return dataDeValidade;
    }
}
