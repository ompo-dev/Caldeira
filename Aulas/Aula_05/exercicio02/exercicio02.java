package aula05.exercicio02;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayNum[i] = (int) (Math.random() * 100);
        }

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean numeroEcontrado = false;


        for (int i = 0; i < 10; i++) {
            if (numero == arrayNum[i]){
                numeroEcontrado = true;
                i = 10;
            }
        }

        if (numeroEcontrado){
            System.out.println("Numero encontrado");
        }else{
                System.out.println("Numero nao encontrado");
        }

        scanner.close();
    }
}
