package exercicio3;

public class Contador {
    public static int contarPalavras(String string){
        int numeroDePalavras = string.split(" ").length;
        System.out.println("A frase: \n\t\"" + string + "\" \ntem " + numeroDePalavras + " palavras.");
        return numeroDePalavras;
    }
}
