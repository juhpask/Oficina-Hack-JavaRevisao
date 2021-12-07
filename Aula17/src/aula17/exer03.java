package aula17;

import java.util.Scanner;
public class exer03 {
    public static void main(String[] args) {
        //Dado um inteiro, defina quais os tipos de dado primitivo são capazes de armazená-lo.
        
        Scanner scan = new Scanner(System.in);
        long n;
        Boolean byte1 = false;
        Boolean short1 = false;
        Boolean int1 = false;
        Boolean long1 = false;
               
        //recebendo o número
        System.out.println("Informe um número inteiro: ");
        n = scan.nextInt();
        
        
        //verificando onde ele cabe
        if(n>= -128 && n<=127){
            byte1 = true;
        } else{
            byte1 = false;
        }
        if(n>= -32768 && n<=32767){
            short1 = true;
        } else{
            short1 = false;
        }
        if(n>= -2147483648 && n<=2147483647){
            int1 = true;
        } else{
            int1 = false;
        }
        if(n>= -9223372036854775808L && n<=9223372036854775807L){
            long1 = true;
        } else{
            long1 = false;
        }
        
        
        //demonstrando onde ele cabe
        if(byte1 == true || short1 == true || int1 == true || long1 == true){
            System.out.println(n + " pode ser armazenado em: ");
            if(byte1 == true){
                System.out.println("Byte");
            }
            if(short1 == true){
                System.out.println("Short");
            }
            if(int1 == true){
                System.out.println("Int");
            }
            if(long1 == true){
                System.out.println("Long");
            }
        } else if (byte1 == false && short1 == false && int1 == false && long1 == false) {
            System.out.println(n + " não pode ser armazenado.");
        } //a validação de não poder ser armazenado da erro, justamente por não poder ser armazenado rsrs
       
        scan.close();
       
    }
}
