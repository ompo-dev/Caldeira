package aula05.exercicio06;



import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int inputIndiceReserva(LinkedList<Reserva> listaReserva, Scanner scanner){

        int indice;
        do {
            System.out.println("Informe o indice da reserva que vc deseja remover de 0 a " + (listaReserva.size() - 1));
            indice = scanner.nextInt();
        }while (indice < 0 || indice >= listaReserva.size());

        return indice;
    }
}
