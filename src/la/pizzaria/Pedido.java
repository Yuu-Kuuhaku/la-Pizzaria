package la.pizzaria;

import java.util.ArrayList;

public class Pedido {
    private int id;
//    private Cliente cliente;;
    private int quantSabores; //perguntar ao pessoal se sera implementado
    private Pizza pizza;
     private ArrayList <Pizza> ingredientes;
    private Adicional adicionais;
    private Borda borda;

    public Pedido(int id, Pizza pizza, Adicional adicionais, Borda borda) {
        this.id = id;
        this.pizza = pizza;
        this.adicionais = adicionais;
        this.borda = borda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Adicional getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(Adicional adicionais) {
        this.adicionais = adicionais;
    }

    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    public int getQuantSabores() {
        return quantSabores;
    }

    public void setQuantSabores(int quantSabores) {
        this.quantSabores = quantSabores;
    }
}
