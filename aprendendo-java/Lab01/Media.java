import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Media {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float primeiroNumero = scan.nextFloat();
        float segundoNumero = scan.nextFloat();

        float media = (primeiroNumero + segundoNumero) / 2;

        if(media >= 7){
            System.out.println("pass: True!");
        }else {
            System.out.println("pass: False!");
        }
    }
}
