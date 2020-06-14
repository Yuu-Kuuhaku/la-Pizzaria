package la.pizzaria;

import java.io.Serializable;
import java.util.ArrayList;


public class Database implements Serializable {
    
    //Listas que serao salvas
//    private ArrayList<Pedido> Pedidos = new ArrayList<>(); 
    private ArrayList<Adicional> Aditivos = new ArrayList<>();
    private ArrayList<Borda> Bordas = new ArrayList<>();
    private ArrayList<Pizza> ListaPizza = new ArrayList<>();
    private ArrayList<Tamanho> tamanhos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Administrador> administrador = new ArrayList<>();

    public ArrayList<Administrador> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(ArrayList<Administrador> administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

//   public ArrayList<Pedido> getPedidos() {
//        return Pedidos;
//    }
//
//    public void setPedidos(ArrayList<Pedido> pedidos) {
//        this.Pedidos = pedidos;
//    } 
  
    
    public ArrayList<Adicional> getAditivos() {
        return Aditivos;
    }

    public void setAditivos(ArrayList<Adicional> aditivos) {
	Aditivos = aditivos;
    }

    public ArrayList<Borda> getBordas() {
	return Bordas;
    }

    public void setBordas(ArrayList<Borda> bordas) {
	Bordas = bordas;
    }

    public ArrayList<Pizza> getListaPizza() {
	return ListaPizza;
    }

    public void setListaPizza(ArrayList<Pizza> listaPizza) {
	this.ListaPizza = listaPizza;
    }

    public ArrayList<Tamanho> getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(ArrayList<Tamanho> tamanhos) {
        this.tamanhos = tamanhos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
