package aula17;

import java.util.Scanner;
public class exer06 {
    public static void main(String[] args) {
        /*Um programa pode ser utilizado para validar informações.
        Faça um algoritmo em Java que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que 0;
        Estado Civil: ‘s’, ‘c’, ‘v’, ‘d’;
        O programa deve solicitar novamente a entrada da informação caso ela seja inválida.
        */
        
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double salary;
        String civil;
        String estadoCivil = "";
        
        //name
        boolean nameOK = false;
        do{
            System.out.println("Informe o seu nome: ");
            name = scan.next();
            if (name.length()>=3){
                nameOK = true;
            } else {
                System.out.println("Nome inválido. Seu nome deve possuir pelo menos 3 letras.");
            }
        } while(!nameOK);
        
        //age
        boolean ageOK = false;
        do{
            System.out.println("Informe a sua idade: ");
            age = scan.nextInt();
            if(age>=0 && age <=150){
                ageOK = true;
            } else {
                System.out.println("Idade inválida, tente novamente!");
            }
        } while (!ageOK);
        
        
        //salário
        System.out.println("Informe o seu salário: ");
        salary = scan.nextDouble();
        while (salary<0){
            System.out.println("Valor inválido, tente novamente!");
            System.out.println("Informe o seu salário: ");
            salary = scan.nextDouble();
        }
        
       
        
        //civil
        boolean civilOK = false;
        do{
            System.out.println("Informe o seu estado civil");
            System.out.println("('S' para solteiro, 'C' para casado, 'V' para viúvo e 'D' para Divorciado)");
            civil = scan.next();
            if (civil.equalsIgnoreCase("s")){
                estadoCivil = "Solteiro";
                civilOK = true;
            } else if (civil.equalsIgnoreCase("c")){
                estadoCivil = "Casado";
                civilOK = true;
            } else if (civil.equalsIgnoreCase("v")){
                estadoCivil = "Viúvo";
                civilOK = true;
            } else if (civil.equalsIgnoreCase("d")){
                estadoCivil = "Divorciado";
                civilOK = true;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (!civilOK);
        
        
        //Saída exemplo
        System.out.println();
        System.out.println("As suas informações são: ");
        System.out.println("Nome válido: " + name +".");
        System.out.println("Idade Válida: " + age + " anos.");
        System.out.println("Salário Válido: " + salary + " reais.");
        System.out.println("Estado Civil válido: "+ estadoCivil);


        
        scan.close();
        
    }
}
