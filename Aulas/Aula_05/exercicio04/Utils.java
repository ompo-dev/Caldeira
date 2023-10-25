package aula05.exercicio04;


import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int inputIndiceCompra(List<Compra> listaCompra, Scanner scanner){

        int indice;
        do {
            System.out.println("Informe o indice da Compra que deseja remover de 0 a " + (listaCompra.size() - 1));
            indice = scanner.nextInt();
        }while (indice < 0 || indice >= listaCompra.size());

        return indice;
    }
}
