package aula17;

import java.util.Scanner;
public class exer04 {
    
    public static void main(String[] args) {
        /*Dado um inteiro, n, realize as seguintes ações condicionais:
        Se n for ímpar, escreva Esquisito.
        Se n for par e estiver contido no conjunto {2, ..., 5}, escreva Normal.
        Se n for par e estiver contido no conjunto {6, ..., 20}, escreva Esquisito.
        Se n for par e for maior que 20, escreva Normal.

        Limitação
        1 ≤ n ≤ 100
        */
        
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.println("Informe um número inteiro:");
        n = scan.nextInt();
        if(n>=1 && n<=100){ //Limitação
            if (n%2 != 0){ //impar
                    System.out.println("Esquisito");
            } else { //par
                    if (n>=2 && n<=5){
                        System.out.println("Normal");
                    } else if (n>=6 && n<=20){
                        System.out.println("Esquisito");
                    } else if (n>20){
                        System.out.println("Normal");
                    }
            }
        } else {
            System.out.println("Número inválido");
        }
        
        scan.close();
    }
    
}
