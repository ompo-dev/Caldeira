import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 01
        System.out.print("Exercício 01 - Digite o número inicial: ");
        int numero_inicial = scanner.nextInt();
        System.out.print("Digite o número final: ");
        int numero_final = scanner.nextInt() + 1;
        int flag = numero_inicial;
        while (numero_final > flag) {
            if (flag % 2 != 0) {
                if (flag % 3 != 0) {
                    if (flag % 5 != 0) {
                        System.out.println(flag + ", ");
                    }
                }
            }
            flag++;
        }


        // Exercício 02
        System.out.println("Exercício 02 - Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        if (idade < 18 || salario < 2000) {
            System.out.println("Não pode fazer um consórcio");
        } else {
            System.out.println("Pode fazer um consórcio");
        }


        // Exercício 03
        System.out.print("Exercício 03 - Digite o numero que lhe representa \n1:Gestante, idoso ou pcd \n2:Nenhuma das anteriores ");
        int prioridade = scanner.nextInt();
        switch (prioridade) {
            case 1:
                System.out.println("Você vai para a fila prioritária");
                break;
            case 2:
                System.out.println("Você não vai para a fila prioritária");
                break;
        }


        // Exercício 04
        System.out.print("Exercício 04: ");
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite um número");
            double numero1 = scanner.nextDouble();
            System.out.println("Digite outro número");
            double numero2 = scanner.nextDouble();
            System.out.println("Escolha a operação:\n 1:x\n2:/\n3:+\n4:-");
            int operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println(numero1 * numero2);
                    break;
                case 2:
                    System.out.println(numero1 / numero2);
                    break;
                case 3:
                    System.out.println(numero1 + numero2);
                    break;
                case 4:
                    System.out.println(numero1 - numero2);
                    break;
            }
            System.out.println("Digite 1:Ir de novo \n2:Encerrar");
            int escolha = scanner.nextInt();
            if (escolha == 2) {
                continuar = false;
            }
        }


        // Exercício 05
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int length = input.length();

        if (length % 2 == 0) {
            // Se o comprimento da string for par
            String primeiraMetade = input.substring(0, length / 2);
            System.out.println("Primeira metade da string: " + primeiraMetade);
        } else {
            System.out.println("O comprimento da string não é par, não é possível dividi-la em duas metades iguais.");
        }


        // Exercício 06
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reversa = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversa += input.charAt(i);
        }

        System.out.println("String ao contrário: " + reversa);


        // Exercício 07
        System.out.print("Exercício 07 - Você faz parte do exercito de Lonidas, chute o numero de Persas que voces irao enfrentar ");
        int persas = scanner.nextInt();
        while (persas!=3000) {
            if (persas < 3000) {
                System.out.println("Leônidas: Um pouco mais");
                persas = scanner.nextInt();
            } else {
                System.out.println("Leônidas: Um pouco menos");
                persas = scanner.nextInt();
            }
        }
        System.out.println("Leônidas: Acertou!!!");
    }
}