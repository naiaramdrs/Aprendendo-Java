import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros Costa de Almeida - 122110617
 */

public class AlturaAviao {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

       int alturaDesejada = scan.nextInt(); 
       int alturaAtual = scan.nextInt();
       int diferenca = 0;

       if(alturaAtual < alturaDesejada){
        diferenca = alturaDesejada - alturaAtual; 
        } else {
        diferenca = alturaAtual - alturaDesejada;
        }
       
       while(alturaAtual != alturaDesejada){

        int proximaAltura = scan.nextInt();
        int subtraindo = 0;

        if(proximaAltura < alturaDesejada){
            subtraindo = alturaDesejada - proximaAltura; 
        } else {
            subtraindo = proximaAltura - alturaDesejada;
        }

        if (subtraindo >= diferenca){
            System.out.println("PERIGO");
        } else{
            if (proximaAltura != alturaDesejada){
                System.out.println("ADEQUADO");
            }
        }
        
        alturaAtual = proximaAltura;
        diferenca = subtraindo;

       }
       System.out.println("OK");
    }
}
