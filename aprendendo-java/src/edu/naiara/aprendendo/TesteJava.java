package edu.naiara.aprendendo;

public class TesteJava {
    
    public static void main(String[] args) {
        
        float nota = 4;
        boolean resultado = aprovadoPorMedia(nota);

        if(resultado == true)
            System.out.println("APROVADO");
        else
            System.out.println("REPROVADO");

    }

    public static boolean aprovadoPorMedia (float nota){
        float media = 6;

        if(nota >= media)
            return true;
        else 
            return false;
    }
}
