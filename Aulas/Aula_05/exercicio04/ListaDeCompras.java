package aula05.exercicio04;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static aula05.exercicio03.Utils.inputIndice;

public class ListaDeCompras {
    public static void main(String[] args) {

    List<Compra> listaCompras = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    while(opcao != 4){
        System.out.println("""
                1 - Adicionar Compra
                2 - Remover compra
                3 - Exibir compras
                4 - Fechar
                Escolha uma opcao:
                """);
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 -> adicionarCompra(listaCompras, scanner);
            case 2 -> {if (verificaListaVazia(listaCompras)) remmoverCompra(listaCompras, scanner);}
            case 3 ->{if (verificaListaVazia(listaCompras)) exibirCompras(listaCompras);}
            case 4 -> System.out.println("Fechadno o Programa");
        }


    }
        scanner.close();
    }

    private static void adicionarCompra(List<Compra> listaCompras, Scanner scanner){

        System.out.println("Informe o nome da compra");
        String nome = scanner.nextLine();
        System.out.println("Informe a data de validade do produto use dia/mes/ano");
        String data = scanner.nextLine();
        Compra newCompra = new Compra(nome,data);
        listaCompras.add(newCompra);

        System.out.println("Compra criada!!");
    }
    private static void remmoverCompra(List<Compra> listaCompras, Scanner scanner){
        listaCompras.remove(Utils.inputIndiceCompra(listaCompras,scanner));
        System.out.println("Item removida!!");
    }
    private static void exibirCompras(List<Compra> listaCompra){
        System.out.println("Tarefas Cadastradas");
        for (Compra compra : listaCompra){
            System.out.println("   " + compra.getNome());
            System.out.println("            Data de validade: " + compra.getData());
        }
    }

    private static boolean verificaListaVazia(List<Compra> listaCompra){
        if (!listaCompra.isEmpty()){
                return true;
        }else{
            System.out.println("Lista de compras vazia");
            return false;
        }
    }

}
