import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Vogal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] palavras = new String[5];

        for (int i = 0; i < 5; i++){
            palavras[i] = scan.next();
        }

        for (String palavra : palavras) {
            char caracter = palavra.charAt(0);
            char vogal = 'a';
            if(caracter == vogal){
                System.out.println("s");
            } else {
                System.out.println("n");
            }
        }
    }    
}
