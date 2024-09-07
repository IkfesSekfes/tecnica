package estagio;

import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        //pegar numero da pessoa
        int n = 0;
        //fibo
        int n1 = 0, n2 = 1, som = 0;
   Scanner leitor = new Scanner(System.in); 
   
         System.out.println("-------Fibonacci--------");
         System.out.print("Digite um numero: ");
         n= leitor.nextInt();
         
         if(n == 0 || n == 1){
                System.out.println("numero: " + n + " pertence a fibonacci");

         }else{
                while(som<n){
                    som = n1 + n2;
                    n1 = n2;
                    n2 = som;
                    System.out.println("numero: "+ som );
   
             }

         }
         if(som == n){
                System.out.println("numero: " + n + " pertence a fibonacci");
         }else{
                System.out.println("numero: " + n + " nao pertence a fibonacci");

         }
         leitor.close();
         
         
    }
        
    
}
