package aula05.exercicio03;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int inputIndice(List<Tarefa> listaTarefas, Scanner scanner){

        int indice;
        do {
            System.out.println("Informe o indice da tarefa que deseja remover de 0 a " + (listaTarefas.size() - 1));
            indice = scanner.nextInt();
        }while (indice < 0 || indice >= listaTarefas.size());

        return indice;
    }
}
