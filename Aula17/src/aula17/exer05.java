package aula17;


import java.util.Scanner;
public class exer05 {
    public static void main(String[] args) {
        /*Dado um inteiro, N, escreva sua tabuada. Cada múltiplo N x i (onde 1 ≤ i ≤ 10)
        deve ser escrito em uma nova linha no formato: N x i = resultado.
        Limitação
        2 ≤ N ≤ 20*/
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 2 a 20 para ver sua tabuada: ");
        int n = scan.nextInt();
        
        
        if(n>=2 && n<=20){
            System.out.println("Tabuada do: " + n);
            
            for (int i = 1; i<=10; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
        } else {
            System.out.println("Número inválido!");
        }
        
        scan.close();

    }
}
