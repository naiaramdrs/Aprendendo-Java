import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Numeros {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
    
        int numero = scanner.nextInt();
        System.out.println("dobro: " + numero * 2 + ", triplo: " + numero * 3);

    }
}
