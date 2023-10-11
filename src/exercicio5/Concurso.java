package exercicio5;

import java.time.LocalDate;
import java.util.Arrays;

public class Concurso {
    private Integer numero;
    private LocalDate data;
    private int[] sorteados;


    public Concurso(){}
    public Concurso(Integer numero, LocalDate data, int[] sorteados){
        this.numero = numero;
        this.data = data;
        this.sorteados = sorteados;
    }

    public Concurso(Integer numero, LocalDate data){
        this(numero, data, null);
    }
    public Concurso(Integer numero, int[] sorteados){
        this(numero, null, sorteados);
    }
    public Concurso(LocalDate data, int[] sorteados){
        this(null, data, sorteados);
    }
    public Concurso(Integer numero) {
        this(numero, null, null);
    }
    public Concurso(LocalDate data) {
        this(null, data,  null);
    }
    public Concurso(int[] sorteados) {
        this(null, null, sorteados);
    }


    @Override
    public String toString() {
        return "Concurso{\n" +
                "numero = " + numero +
                ", data = " + data +
                ", sorteados = " + Arrays.toString(sorteados) +
                "\n}\n\n";
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }
}
