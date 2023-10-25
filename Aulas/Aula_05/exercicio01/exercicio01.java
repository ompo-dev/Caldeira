package aula05.exercicio01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] array = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o numero " + (i + 1));
            array[i] = scanner.nextInt();
        }

        double soma = 0;

        for (double numero : array){
            soma += numero;
        }

        System.out.println("A soma dos numeros e " + soma);
        System.out.println("A media dos numeros e " + (soma/array.length));

        scanner.close();

    }
}
