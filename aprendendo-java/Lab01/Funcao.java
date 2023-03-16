import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Funcao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int primeiroNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        int terceiroNumero = scan.nextInt();
        int quartoNumero = scan.nextInt();

        if(primeiroNumero < segundoNumero && segundoNumero < terceiroNumero && terceiroNumero < quartoNumero) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero && terceiroNumero > quartoNumero){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
}
