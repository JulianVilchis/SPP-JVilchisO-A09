/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a09;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class SPPJVilchisOA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dimension = pedirDimension();
                int [][] a= arreglo ("A", dimension);
                int [][] b= arreglo ("B", dimension);
               
    }
          public static int pedirDimension(){
           Scanner kb= new Scanner (System.in);
           boolean flag;
            int a = 0;
            do{
                try{ 
                    System.out.println("De cuantas dimensiones es el arreglo");
                    a=kb.nextInt();
                    flag=false;
                }
                catch(Exception er){
                    System.out.println("El numero que introdujo no es valido");
                    kb.next();
                    flag=true;
                }
            }
            while(flag);
            return a;
          }
      public static int solicitarEntero(){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int a=0;
        do{
            try{
                System.out.println("Escriba un numero entero");
                a=kb.nextInt();
                flag=false;
            }
            catch(Exception er){
                System.out.println("El numero ingresado no es un entero");
                kb.next();
                flag=true;
            }
        }
        while (flag);
        return a;
      }    
      public static int [][] arreglo (String a, int dimension){
          int[][] arreglo = new int [dimension][dimension];
          System.out.println("Arreglo" + a);
          for(int i = 0; j <arreglo.length;i++){
              for(int j = 0; j <arreglo[i].length;j++){
               arreglo[i][j]=solicitarEntero();   
              }
          }
          return arreglo;
      }
      public static int[][] sumadematriz (int[][]a,int[][]b){
          int[][] suma = new int [a.length][a.length];
          for(int i = 0; i <a.length;i++){
              for(int j = 0; j<a[i].length;j++){
                  suma[i][j]= a[i][j] + b[i][j];
                  System.out.println("[" + suma[i][j] + "]");
              }
              System.out.println("");
          }
          return suma;
      }
}