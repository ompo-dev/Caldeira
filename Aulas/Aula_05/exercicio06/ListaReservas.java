package aula05.exercicio06;

import aula05.exercicio05.Impressora;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaReservas {
    public static void main(String[] args) {
        LinkedList<Reserva> listaReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                1 - Adicionar Reserva
                2 - Remover Reserva
                3 - Visualizar reservas
                4 - Sair
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> adicionaReserva(listaReservas, scanner);
                case 2 -> {if(verificaListaVazia(listaReservas)){removeReserva(listaReservas, scanner);}}
                case 3 ->  {if (verificaListaVazia(listaReservas)){ImprimeReservas(listaReservas);}}
                case 4 -> System.out.println("Fechando programa");
            }

        }
        scanner.close();
    }

    private static void adicionaReserva(LinkedList<Reserva> listaReserva, Scanner scanner){
        System.out.println("Informe o nome do titutar da reserva");
        String nome = scanner.nextLine();
        System.out.println("Informe o cpf do titular: ");
        String cpf = scanner.nextLine();
        Cliente novoCliente = new Cliente(nome,cpf);

        System.out.println("Informe o local da reserva");
        String local = scanner.nextLine();
        System.out.println("Informe a data de inicio use dd/mm/aaaa: ");
        String dataInicio = scanner.nextLine();
        System.out.println("Informe a data do fim use dd/mm/aaaa: ");
        String dataFim = scanner.nextLine();

        Reserva novaReserva = new Reserva(novoCliente,local,dataInicio,dataFim);
        listaReserva.add(novaReserva);

        System.out.println("Reserva Adicionada!!");

 }

    private static void removeReserva(LinkedList<Reserva> listaReserva, Scanner scanner){
        listaReserva.remove(Utils.inputIndiceReserva(listaReserva, scanner));
        System.out.println("Reserva Removida!!");
    }

    private static void ImprimeReservas(LinkedList<Reserva> listaReserva){
        for (Reserva reserva : listaReserva){
            reserva.InformacoesDaViagem();
        }
    }

    private static boolean verificaListaVazia(LinkedList<Reserva> listaReserva){
        if (!listaReserva.isEmpty()){
            return true;
        }else{
            System.out.println("Lista Vazia");
            return false;
        }
    }
}
