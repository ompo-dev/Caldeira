package aula05.exercicio05;



import java.util.LinkedList;
import java.util.Scanner;

public class ListaImpressora {

    public static void main(String[] args) {

        LinkedList<Impressora>  listaImpressora = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                1 - Adicionar Impressao
                2 - Imprimir
                3 - Fechar
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> adicionaImpressao(listaImpressora, scanner);
                case 2 -> {if(verificaListaVazia(listaImpressora)){Imprime(listaImpressora);}}
                case 3 -> System.out.println("Fechando a impressora");
            }

        }
        scanner.close();
    }

    private static void adicionaImpressao(LinkedList<Impressora> listaImpressoras, Scanner scanner){
        System.out.println("Informe o nome da impressao");
        String nome = scanner.nextLine();
        System.out.println("Informe a quantidade de paginas");
        int paginas = scanner.nextInt();
        Impressora newImpressao = new Impressora(nome,paginas);
        listaImpressoras.add(newImpressao);

        System.out.println("Impressora!!");
    }
    private static void Imprime(LinkedList<Impressora> listaImpressoras){
        while (!listaImpressoras.isEmpty()){
            System.out.println("Imprimindo -> " + listaImpressoras.getFirst().getNome() + " Paginas " + listaImpressoras.getFirst().getPaginas());
            listaImpressoras.removeFirst();

        }

    }
    private static boolean verificaListaVazia(LinkedList<Impressora> listaImpressora){
        if (!listaImpressora.isEmpty()){
            return true;
        }else{
            System.out.println("Impressora vazia");
            return false;
        }
    }

}
