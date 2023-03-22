import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */


public class AbaixoAssinado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd_pessoas = 0;
        int soma = 0;

        while(true){
            String entrada = scan.nextLine();

            if(entrada.equals("fim")){
                break;
            }

            String[] participante = entrada.split(" ");
            qtd_pessoas++;
            soma = soma + Integer.parseInt(participante[1]);
        }

        System.out.println(qtd_pessoas);
        System.out.println(soma/qtd_pessoas);
    }    
}
