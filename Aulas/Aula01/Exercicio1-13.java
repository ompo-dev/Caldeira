import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 01
        System.out.print("Exercício 01 - Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome);

        // Exercício 02
        System.out.print("Exercício 02 - Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Os números digitados foram: " + num1 + " e " + num2);

        // Exercício 03
        System.out.print("Exercício 03 - Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maior = Math.max(Math.max(numero1, numero2), numero3);
        double menor = Math.min(Math.min(numero1, numero2), numero3);
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);

        // Exercício 04
        double salarioMinimo = 1320.0;
        System.out.print("Exercício 04 - Digite o salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");

        // Exercício 05
        System.out.print("Exercício 05 - Digite a hora atual (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Digite o minuto atual (0-59): ");
        int minuto = scanner.nextInt();
        System.out.print("Digite o segundo atual (0-59): ");
        int segundo = scanner.nextInt();

        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;
        int segundosParaMeiaNoite = 86400 - segundosDesdeMeiaNoite; // 86400 segundos em um dia

        System.out.println("Segundos desde meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos para meia-noite: " + segundosParaMeiaNoite);

        // Exercício 06
        System.out.print("Exercício 06 - Digite a idade do usuário: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 && idade <= 17 || idade > 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        // Exercício 07
        System.out.print("Exercício 07 - Digite a sua idade: ");
        int idadeConsorcio = scanner.nextInt();
        System.out.print("Digite o seu salário: ");
        double salarioConsorcio = scanner.nextDouble();

        if (idadeConsorcio >= 18 && salarioConsorcio > 2000.0) {
            System.out.println("Você pode comprar um automóvel.");
        } else {
            System.out.println("Você não pode comprar um automóvel.");
        }

        // Exercício 08
        System.out.print("Exercício 08 - Você é Gestante, Idosa, Deficiente ou Nenhuma das alternativas? ");
        String categoria = scanner.next();

        if (categoria.equalsIgnoreCase("Gestante") || categoria.equalsIgnoreCase("Idosa") || categoria.equalsIgnoreCase("Deficiente")) {
            System.out.println("Você tem direito à fila prioritária.");
        } else {
            System.out.println("Você não tem direito à fila prioritária.");
        }

        // Exercício 09
        System.out.print("Exercício 09 - Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2023;

        int idadeUsuario = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idadeUsuario + " anos.");

        // Exercício 10
        System.out.print("Exercício 10 - Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + " °F.");

        // Exercício 11
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.print("Exercício 11 - Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        int contadorVogais = contarVogais(texto);
        System.out.println("Número de vogais na frase: " + contadorVogais);

        // Exercício 12
        System.out.print("Exercício 12 - Digite a quantia em dólares: ");
        double quantiaDolares = scanner.nextDouble();
        System.out.print("Digite a taxa de câmbio atual: ");
        double taxaCambio = scanner.nextDouble();

        double valorConvertido = quantiaDolares * taxaCambio;
        System.out.println("Valor convertido: " + valorConvertido + " unidades da moeda estrangeira.");

        // Exercício 13
        System.out.print("Exercício 13 - Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}