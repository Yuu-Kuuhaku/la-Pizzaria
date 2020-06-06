package la.pizzaria;

public class Adicional extends Ingrediente{ 
    private int id;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public Adicional(int id, String nome, double valor) {
        super(nome);
        this.id = id;
        this.valor = valor;
    }
    
}
