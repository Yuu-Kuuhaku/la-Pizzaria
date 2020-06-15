package la.pizzaria;

import java.io.Serializable;
import java.util.ArrayList;


public class Cliente extends Usuario implements Serializable {
    
    private String endereco;
    private String telefone;
    private ArrayList<Pedido> pedidosCliente;

    public Cliente(String endereco, String telefone,  String nome, String senha) {
        super(nome, senha);
        this.endereco = endereco;
        this.telefone = telefone;
        this.pedidosCliente = new ArrayList<Pedido>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Pedido> getPedidosCliente() {
        return pedidosCliente;
    }

    public void setPedidosCliente(ArrayList<Pedido> pedidosCliente) {
        this.pedidosCliente = pedidosCliente;
    }


   
}