package aula05.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static aula05.exercicio03.Utils.inputIndice;

public class ListaDeTarefas {
    public static void main(String[] args) {

    List<Tarefa> listaTarefas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    while(opcao != 4){
        System.out.println("""
                1 - Adicionar tarefa
                2 - Remover Tarefa
                3 - Exibir tarefas
                4 - Fechar
                Escolha uma opcao:
                """);
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 ->adicionarTarefa(listaTarefas, scanner);
            case 2 -> {if (verificaListaVazia(listaTarefas)) remmoverTarefa(listaTarefas, scanner);}
            case 3 ->{if (verificaListaVazia(listaTarefas)) exibirTarefas(listaTarefas);}
            case 4 -> System.out.println("Fechadno o Programa");
        }


    }
        scanner.close();
    }

    private static void adicionarTarefa(List<Tarefa> listaTarefas, Scanner scanner){

        System.out.println("Informe o nome da tarefa");
        String nome = scanner.nextLine();
        System.out.println("Informe a descricao da tarefa");
        String descricao = scanner.nextLine();
        System.out.println("Informe a data da tarefa use dia/mes/ano");
        String data = scanner.nextLine();

        Tarefa newTarefa = new Tarefa(nome, descricao, data);
        listaTarefas.add(newTarefa);

        System.out.println("Tarefa criada!!");
    }
    private static void remmoverTarefa(List<Tarefa> listaTarefas, Scanner scanner){
        listaTarefas.remove(inputIndice(listaTarefas,scanner));
        System.out.println("Tarefa removida!!");
    }
    private static void exibirTarefas(List<Tarefa> listaTarefas){
        System.out.println("Tarefas Cadastradas");
        for (Tarefa tarefa : listaTarefas){
            System.out.println("   " + tarefa.getNome());
            System.out.println("       Descricao: " + tarefa.getDescricao());
            System.out.println("            Data: " + tarefa.getData());
        }
    }

    private static boolean verificaListaVazia(List<Tarefa> listaTarefas){
        if (!listaTarefas.isEmpty()){
                return true;
        }else{
            System.out.println("Lista de tarefa vazia");
            return false;
        }
    }

}
