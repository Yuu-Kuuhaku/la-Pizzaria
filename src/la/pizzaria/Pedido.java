package la.pizzaria;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private int quantSabores; //perguntar ao pessoal se sera implementado
    private ArrayList <Pizza> pizzas;
    private ArrayList <Adicional> aditivos;
    private Double ValorTotal;
    private Borda borda;

    public Pedido(int id, int quantSabores, ArrayList<Pizza> pizzas, ArrayList<Adicional> aditivos, Double ValorTotal, Borda borda) {
        this.id = id;
        this.quantSabores = quantSabores;
        this.pizzas = pizzas;
        this.aditivos = aditivos;
        this.ValorTotal = ValorTotal;
        this.borda = borda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantSabores() {
        return quantSabores;
    }

    public void setQuantSabores(int quantSabores) {
        this.quantSabores = quantSabores;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public ArrayList<Adicional> getAditivos() {
        return aditivos;
    }

    public void setAditivos(ArrayList<Adicional> aditivos) {
        this.aditivos = aditivos;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }
    
    

    
}
