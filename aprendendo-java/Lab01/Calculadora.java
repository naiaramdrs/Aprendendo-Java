import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String operacao = scan.next();

        if(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){

            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            if(operacao.equals("/") && num2 == 0){
                System.out.println("ERRO");

            } else {
                if (operacao.equals("+")){
                    System.out.println("RESULTADO: " + (num1 + num2) );
                } else if (operacao.equals("-")){
                    System.out.println("RESULTADO: " + (num1 - num2) );
                } else if (operacao.equals("*")) {
                    System.out.println("RESULTADO: " + (num1 * num2) );
                } else {
                    System.out.println("RESULTADO: " + (num1 / num2) );
                }

            }

        } else {
            System.out.println("ENTRADA INVALIDA");
        }
    }
}
