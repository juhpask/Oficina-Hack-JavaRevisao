
package aula17;

import java.util.Scanner;
public class exer07b {
    public static void main(String[] args) {
        /* Faça um programa que crie um vetor A com 15 elementos, um vetor B
        de mesmo tamanho e faça as seguintes operações:
        B[i] = a[i] * 2;
        */

        Scanner scan = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[A.length];
        

        for (int i=0; i<A.length; i++) {
           System.out.println("Indique o valor da posição " + i +": ");
           A[i] = scan.nextInt();

           B[i] = (A[i])*2;
        }
        
        System.out.print("Array A = ");
        for (int i=0; i<A.length; i++) {
           System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int i=0; i<B.length; i++) {
           System.out.print(B[i] + " ");
        }
        
        scan.close();
    }
}
