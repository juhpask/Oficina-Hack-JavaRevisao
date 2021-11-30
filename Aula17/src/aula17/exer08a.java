
package aula17;

import java.util.Random;
public class exer08a {
    public static void main(String[] args) {
        /*Faça um programa que crie uma matriz M 10x10 com valores aleatórios
        entre 0 e 50 e faça as seguintes operações:
        Imprima o maior e o menor elemento da matriz; ok
        Imprima o maior e o menor elemento na linha 5 e também na coluna 7;
        Imprima a quantidade de números pares e ímpares;
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
        
        //buscar o maior valor
        int maior = 0;
        
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]> maior){
                    maior = matrizM[i][j];
                };
            }
        }
        
        //buscar o menor valor
        int menor = 0;
        
        for (int i=0; i<matrizM.length; i++){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]< menor){
                    menor = matrizM[i][j];
                };
            }
        }
        
        //buscar o maior valor da linha 5
        int maiorL5 = 0;
        
        for (int i=4; i<matrizM.length; ){
            for (int j=0; j<matrizM[i].length;j++){
                if(matrizM[i][j]> maior){
                    maiorL5 = matrizM[i][j];
                };
            }
        }
        
        
        
        
        System.out.println("Maior valor é: "+ maior);
        System.out.println("Menor valor é: "+ menor);
        System.out.println("Maior valor da Linha 5 é: "+ maiorL5);
        //System.out.println("Coluna: "+ coluna);
        
    }
}
