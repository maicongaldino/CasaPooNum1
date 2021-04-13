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
            System.out.printf("Digite o número %d° do vetor A:\t", (i+1));
            A[i] = ler.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i <= 4; i++)
        {
            System.out.printf("Digite o número %d° do vetor B:\t", (i+1));
            B[i] = ler.nextInt();
        }
        for (int i = 0; i <= 4; i++)
        {
            C[i] = A[i] + B[i];
            total += C[i];

            System.out.printf("\nNúmero %d do vetor A mais o número %d do vetor B é: %d", A[i], B[i], C[i]);
        }

        System.out.println("\n\nO valor da soma total dos 5 números de A com os 5 números de B é: " + total);

        ler.close();
    }
}