package estagio;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int cont = 0;
        String palavra;
        char letraA = 'a';
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        palavra = leitor.nextLine();
        
        palavra = palavra.toLowerCase();
        letraA = Character.toLowerCase(letraA);
        
        
        for (int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) == letraA){
            cont++;
            }
        }
        System.out.println("A letra |a| aparece: "+ cont + " vezes");
        
        
    }
    
}
