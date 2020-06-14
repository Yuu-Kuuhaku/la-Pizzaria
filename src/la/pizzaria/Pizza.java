package la.pizzaria;

import java.util.ArrayList;
import java.io.Serializable;
public class Pizza implements Serializable{
    
    private int id;
    private String nome;
    private double valor;
    private ArrayList <Ingrediente> ingredientes;
    private int tamanho;
  
    
    public Pizza( int id, String nome, double valor, ArrayList<Ingrediente> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes( ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
}
