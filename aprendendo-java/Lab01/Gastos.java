import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Gastos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine();
        String[] meses = entrada.split(" ");

        String entradaNumeros = scan.nextLine();
        String[] gastos = entradaNumeros.split(" ");

        String mes = scan.next();

        for (int i = 0; i < meses.length; i++){
            if (mes.equals(meses[i])){
                System.out.println(Integer.parseInt(gastos[i]));
            }
        }
    }
}
