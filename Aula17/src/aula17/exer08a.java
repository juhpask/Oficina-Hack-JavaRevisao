package aula17;

import java.util.Random;
public class exer08a {
    public static void main(String[] args) {
        /*Faça um programa que crie uma matriz M 10x10 com valores aleatórios
        entre 0 e 50 e faça as seguintes operações:
        Imprima o maior e o menor elemento da matriz; ok
        Imprima o maior e o menor elemento na linha 5 e também na coluna 7; ok
        Imprima a quantidade de números pares e ímpares;ok
        */
        
        Random nRandom = new Random();
        int[][] matrizM = new int[10][10];
        
        //gerar matriz
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                matrizM[i][j]= nRandom.nextInt(51);
            }
        }
        
        //imprimir matriz
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //buscar o maior valor
        int maior = 0;
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]> maior){
                    maior = matrizM[i][j];
                }
            }
        }
        System.out.println("Maior valor é: " + maior);
        
        //buscar o menor valor
        int menor = 50;
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]< menor){
                    menor = matrizM[i][j];
                }
            }
        }
        System.out.println("Menor valor é: " + menor);
        
        //buscar o maior valor da linha 5
        int maiorL5 = 0;
        for (int i, j=0; j<matrizM[4].length;j++){
            if(matrizM[4][j]> maiorL5){
                maiorL5 = matrizM[4][j];
            }
        }
        System.out.println("Maior valor da Linha 5 é: "+ maiorL5);
        
        //buscar o menor valor da linha 5
        int menorL5 = 50;
        for (int i, j=0; j<matrizM[4].length;j++){
            if(matrizM[4][j]< menorL5){
                menorL5 = matrizM[4][j];
            }
        }        
        System.out.println("Menor valor da Linha 5 é: "+ menorL5);
        
        //buscar o maior valor da coluna 7
        int maiorC7 = 0;
        for (int i=0; i<matrizM.length; i++){
            for (int j=6; j<matrizM[i].length;j++){
                if(matrizM[i][6]> maiorC7){
                    maiorC7 = matrizM[i][6];
                }
            }
        }
        System.out.println("Maior valor da Coluna 7 é: " + maiorC7);
        
        //buscar o menor valor da coluna 7
        int menorC7 = 50;
        for (int i=0; i<matrizM.length; i++){
            for (int j=6; j<matrizM[i].length;j++){
                if(matrizM[i][6]< menorC7){
                    menorC7 = matrizM[i][6];
                }
            }
        }
        System.out.println("Menor valor da Coluna 7 é: " + menorC7);
        
        //quantidade impares e pares
        int par = 0;
        int impar = 0;
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j] %2 ==0 ){
                    par++ ;
                } else{
                    impar++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
    }
}
