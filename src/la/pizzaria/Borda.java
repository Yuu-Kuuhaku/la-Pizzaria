package la.pizzaria;

public class Borda {
    private int id;
    private String nome;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Borda(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
}
