import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Provas {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int maiorNota = 0;
        int menorNota = 1001;
        int somaNotas = 0;
        int media = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;
        int count = 0;

        String[] entrada;

        while(true){
            entrada = scan.nextLine().split(" ");

            if(entrada[0].equals("-")){
                break;
            }

            int nota = Integer.valueOf(entrada[1]);
            
            if(nota > maiorNota){
                maiorNota = nota;
            }
            if (nota < menorNota){
                menorNota = nota;
            }

            somaNotas = somaNotas + nota;
            count++;

            
            if (nota >= 700){
                acimaMedia++;
            }else {
                abaixoMedia++;
            }

        }
        media = somaNotas / count;

        System.out.println("maior: " + maiorNota);
        System.out.println("menor: " + menorNota);
        System.out.println("media: " + media);
        System.out.println("acima: " + acimaMedia);
        System.out.println("abaixo: " + abaixoMedia);
    }
}
