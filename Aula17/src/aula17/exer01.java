package aula17;

import java.util.Scanner;
public class exer01 {

    public static void main(String[] args) {
        /*Crie um programa Java que receba 3 inteiros num stdin e escreva-os
        em stdout. Cada inteiro deve ser escrito em uma linha separada.*/
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Informe o primeiro número inteiro: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        num2 = scan.nextInt();
        System.out.println("Informe o terceiro número inteiro: ");
        num3 = scan.nextInt();
        
        System.out.println("O primeiro inteiro é: " + num1);
        System.out.println("O segundo inteiro é: " + num2);
        System.out.println("O terceiro inteiro é: " + num3);
        
        scan.close();
    }
    
}
