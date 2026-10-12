import java.util.Scanner;

public class Produto {
    private String nome;
    private static int proximoCodigo = 1;
    private int codigo;
    private final double preco;

    Produto(String nome, double valorPreco) {
        this.nome = nome;
        this.codigo = getProximoCodigo();
        this.preco = valorPreco;
    }


    public int  getProximoCodigo() {
         return proximoCodigo++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String imprimirPreco() {
        return "R$" + getPreco();
    }
}
