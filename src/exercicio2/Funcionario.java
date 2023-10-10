package exercicio2;

public class Funcionario {

    private String nome;
    private float salario;

    public Funcionario(){}
    public Funcionario (String nome){
        this();
        this.nome = nome;
    }
    public Funcionario(String nome, float salario){
        this(nome);
        this.salario = salario;
    }

    public float aumentar(float valor){
        return this.salario += valor;
    }
    public float aumentar(float valor, float comissao){
        return this.salario += valor + comissao;
    }
}
