package aula05.exercicio05;

public class Impressora {

    private String nome;

    private int paginas;

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public Impressora(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}
