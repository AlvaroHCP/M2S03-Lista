package exercicio4;

public class Contador2 {
    private String frase;

    public Contador2(String frase){
        this.frase = frase;
    }

    public int contarPalavras(){
        int numeroDePalavras = this.frase.split(" ").length;
        System.out.println("A frase: \n\t\"" + this.frase + "\" \ntem " + numeroDePalavras + " palavras.");
        return numeroDePalavras;
    }
}
