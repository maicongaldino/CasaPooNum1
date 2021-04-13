package Programa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [] A = new int [5];
        int [] B = new int [5];
        int [] C = new int [5];
        double total = 0;

        for (int i = 0; i <= 4; i++)
        {
            System.out.printf("Digite o primeiro número do vetor A:  ");
            A[i] = ler.nextInt();

            System.out.printf("Digite o segundo número do vetor B:  ");
            B[i] = ler.nextInt();

            C[i] = A[i] + B[i];

            System.out.printf("\nA soma do número %d do vetor A, com o número %d do vetor B é: %d\n\n", A[i], B[i], C[i]);

            total = total + C[i];
        }

        System.out.println("Resultado total dos 5 números A com os 5 números B: " + total);

        ler.close();
    }
}