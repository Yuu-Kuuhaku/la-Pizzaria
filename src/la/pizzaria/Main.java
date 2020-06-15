package la.pizzaria;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
//        ArrayList<Ingrediente> ing4queijos = new ArrayList<>();
//        ing4queijos.add(new Ingrediente(0,"Mussarela"));
//        ing4queijos.add( new Ingrediente(0,"Provolone"));
//        ing4queijos.add(new Ingrediente(0,"Queijo prato"));
//        ing4queijos.add(new Ingrediente(0,"Parmesão"));
//        ing4queijos.add(new Ingrediente(0,"Catupiry"));
//        ing4queijos.add( new Ingrediente(0,"Tomate"));
//        ing4queijos.add( new Ingrediente(0,"Azeitona"));
//        
//        
//        ArrayList<Ingrediente> ingBacon = new ArrayList<>();
//        ingBacon.add(new Ingrediente(0,"Mussarela"));
//        ingBacon.add( new Ingrediente(0,"Bacon"));
//        ingBacon.add(new Ingrediente(0,"Catupiry"));
//        ingBacon.add(new Ingrediente(0,"Tomate"));
//        ingBacon.add(new Ingrediente(0,"Azeitona"));
//        
//        
//        ArrayList<Ingrediente> ingPortuguesa = new ArrayList<>();
//        ingPortuguesa.add(new Ingrediente(0,"Mussarela"));
//        ingPortuguesa.add( new Ingrediente(0,"Presunto"));
//        ingPortuguesa.add(new Ingrediente(0,"Milho"));
//        ingPortuguesa.add(new Ingrediente(0,"Palmito"));
//        ingPortuguesa.add(new Ingrediente(0,"Cebola"));
//        ingPortuguesa.add( new Ingrediente(0,"Ovo"));
//        ingPortuguesa.add( new Ingrediente(0,"Catupiry"));
//        ingPortuguesa.add( new Ingrediente(0,"Tomate"));
//        ingPortuguesa.add( new Ingrediente(0,"Azeitona"));
//        
//                   
//        ArrayList<Ingrediente> ingPalmitoCatup = new ArrayList<>();
//        ingPalmitoCatup.add(new Ingrediente(0,"Mussarela"));
//        ingPalmitoCatup.add( new Ingrediente(0,"Palmito"));
//        ingPalmitoCatup.add(new Ingrediente(0,"Catupiry"));
//        ingPalmitoCatup.add(new Ingrediente(0,"Tomate"));
//        ingPalmitoCatup.add(new Ingrediente(0,"Azeitona"));
//        
//        ArrayList<Ingrediente> ingRomeuejulieta = new ArrayList<>();
//        ingRomeuejulieta.add(new Ingrediente(0,"Mussarela"));
//        ingRomeuejulieta.add(new Ingrediente(0,"Goiabada"));
//
//        ArrayList<Ingrediente> ingPrestigio = new ArrayList<>();
//        ingPrestigio.add(new Ingrediente(0,"Mussarela"));
//        ingPrestigio.add(new Ingrediente(0,"Chocolate ao leite"));
//        ingPrestigio.add(new Ingrediente(0,"Coco ralado"));
//        ingPrestigio.add(new Ingrediente(0,"Leite Condensado"));
//        
//        ArrayList<Ingrediente> ingConfete = new ArrayList<>();
//        ingConfete.add(new Ingrediente(0,"Mussarela"));
//        ingConfete.add(new Ingrediente(0,"Chocolate ao leite"));
//        ingConfete.add(new Ingrediente(0,"Confete"));
//
//        ArrayList<Ingrediente> ingBanana = new ArrayList<>();
//        ingBanana.add(new Ingrediente(0,"Mussarela"));
//        ingBanana.add(new Ingrediente(0,"Banana"));
//        ingBanana.add(new Ingrediente(0,"Creme de Leite"));
//        ingBanana.add(new Ingrediente(0,"Leite Condensado"));
//        ingBanana.add(new Ingrediente(0,"Canela"));
//
//        ArrayList<Ingrediente> ingStrogonoff = new ArrayList<>();
//        ingStrogonoff.add(new Ingrediente(0,"Mussarela"));
//        ingStrogonoff.add(new Ingrediente(0,"Frango"));
//        ingStrogonoff.add(new Ingrediente(0,"Molho especial"));
//        ingStrogonoff.add(new Ingrediente(0,"Batata palha"));
//        ingStrogonoff.add(new Ingrediente(0,"Tomate"));
//        ingStrogonoff.add(new Ingrediente(0,"Azeitona"));
//        
//    ArrayList<Ingrediente> ingtomateseco = new ArrayList<>();
//        ingtomateseco.add(new Ingrediente(0,"Mussarela"));
//        ingtomateseco.add(new Ingrediente(0,"Parmesão"));
//        ingtomateseco.add(new Ingrediente(0,"Catupiry"));
//        ingtomateseco.add(new Ingrediente(0,"Tomate seco"));
//        ingtomateseco.add(new Ingrediente(0,"Azeitona"));
//
//    ArrayList<Ingrediente> ingHotdog = new ArrayList<>();
//        ingHotdog.add(new Ingrediente(0,"Mussarela"));
//        ingHotdog.add(new Ingrediente(0,"Molho de Salsicha"));
//        ingHotdog.add(new Ingrediente(0,"Batata palha"));
//        ingHotdog.add(new Ingrediente(0,"Tomate"));
//        ingHotdog.add(new Ingrediente(0,"Azeitona"));
//
//    ArrayList<Ingrediente> ingAtum = new ArrayList<>();
//        ingAtum.add(new Ingrediente(0,"Mussarela"));
//        ingAtum.add(new Ingrediente(0,"Atum"));
//        ingAtum.add(new Ingrediente(0,"Cebola"));
//        ingAtum.add(new Ingrediente(0,"Tomate"));
//        ingAtum.add(new Ingrediente(0,"Azeitona"));
//        
//        ArrayList<Ingrediente> ingCalabresa = new ArrayList<>();
//        ingCalabresa.add(new Ingrediente(0,"Mussarela"));
//        ingCalabresa.add(new Ingrediente(0,"Calabresa"));
//        ingCalabresa.add(new Ingrediente(0,"Cebola"));
//        ingCalabresa.add(new Ingrediente(0,"Catupiry"));
//        ingCalabresa.add(new Ingrediente(0,"Tomate"));
//        ingCalabresa.add(new Ingrediente(0,"Azeitona"));
//        
//ArrayList<Ingrediente> ingMilho = new ArrayList<>();
//        ingMilho.add(new Ingrediente(0,"Mussarela"));
//        ingMilho.add(new Ingrediente(0,"Milho Verde"));
//        ingMilho.add(new Ingrediente(0,"Catupiry"));
//        ingMilho.add(new Ingrediente(0,"Tomate"));
//        ingMilho.add(new Ingrediente(0,"Azeitona"));
//        
//ArrayList<Ingrediente> ingMarguerita = new ArrayList<>();
//    ingMarguerita.add(new Ingrediente(0,"Mussarela"));
//        ingMarguerita.add(new Ingrediente(0,"Parmesão"));
//        ingMarguerita.add(new Ingrediente(0,"Catupiry"));
//        ingMarguerita.add(new Ingrediente(0,"Tomate"));
//        ingMarguerita.add(new Ingrediente(0,"Azeitona"));
//    ingMarguerita.add(new Ingrediente(0,"Manjericão"));
//    
//ArrayList<Ingrediente> ingAmericana = new ArrayList<>();
//    ingAmericana.add(new Ingrediente(0,"Mussarela"));
//    ingAmericana.add(new Ingrediente(0,"Presunto"));
//    ingAmericana.add(new Ingrediente(0,"Catupiry"));
//    ingAmericana.add(new Ingrediente(0,"Tomate"));
//    ingAmericana.add(new Ingrediente(0,"Azeitona"));
//    
//ArrayList<Ingrediente> ingChilena = new ArrayList<>();
//    ingChilena.add(new Ingrediente(0,"Mussarela"));
//    ingChilena.add(new Ingrediente(0,"Frango"));
//    ingChilena.add(new Ingrediente(0,"Milho"));
//    ingChilena.add(new Ingrediente(0,"Bacon"));
//    ingChilena.add(new Ingrediente(0,"Catupiry"));
//    ingChilena.add(new Ingrediente(0,"Tomate"));
//    ingChilena.add(new Ingrediente(0,"Azeitona"));
//    
//ArrayList<Ingrediente> ingChampignon = new ArrayList<>();
//    ingChampignon.add(new Ingrediente(0,"Mussarela"));
//    ingChampignon.add(new Ingrediente(0,"Champignon"));
//    ingChampignon.add(new Ingrediente(0,"Catupiry"));
//    ingChampignon.add(new Ingrediente(0,"Tomate"));
//    ingChampignon.add(new Ingrediente(0,"Azeitona"));
//    
//    ArrayList<Ingrediente> ingfrangocatupiry = new ArrayList<>();
//        ingfrangocatupiry.add(new Ingrediente(0,"Mussarela"));
//        ingfrangocatupiry.add(new Ingrediente(0,"Frango"));
//        ingfrangocatupiry.add(new Ingrediente(0,"Milho"));
//        ingfrangocatupiry.add(new Ingrediente(0,"Catupiry"));
//        ingfrangocatupiry.add(new Ingrediente(0,"Tomate"));
//        ingfrangocatupiry.add(new Ingrediente(0,"Azeitona"));
//
//
//ArrayList<Ingrediente> ingbatata = new ArrayList<>();
//        ingbatata.add(new Ingrediente(0,"Mussarela"));
//        ingbatata.add(new Ingrediente(0,"Purê de Batata"));
//        ingbatata.add(new Ingrediente(0,"Presunto"));
//        ingbatata.add(new Ingrediente(0,"Bacon"));
//        ingbatata.add(new Ingrediente(0,"Catupiry"));
//        ingbatata.add(new Ingrediente(0,"Tomate"));
//        ingbatata.add(new Ingrediente(0,"Azeitona"));
//
//ArrayList<Ingrediente> ingbaiana = new ArrayList<>();
//        ingbaiana.add(new Ingrediente(0,"Mussarela"));
//        ingbaiana.add(new Ingrediente(0,"Calabresa"));
//        ingbaiana.add(new Ingrediente(0,"Pimenta Calabresa"));
//        ingbaiana.add(new Ingrediente(0,"Ovo"));
//        ingbaiana.add(new Ingrediente(0,"Cebola"));
//        ingbaiana.add(new Ingrediente(0,"Catupiry"));
//        ingbaiana.add(new Ingrediente(0,"Tomate"));
//        ingbaiana.add(new Ingrediente(0,"Azeitona"));
//
//ArrayList<Ingrediente> inglombo = new ArrayList<>();
//        inglombo.add(new Ingrediente(0,"Mussarela"));
//        inglombo.add(new Ingrediente(0,"Lombo"));
//        inglombo.add(new Ingrediente(0,"Cebola"));
//        inglombo.add(new Ingrediente(0,"Catupiry"));
//        inglombo.add(new Ingrediente(0,"Tomate"));
//        inglombo.add(new Ingrediente(0,"Azeitona"));
//        
//        ArrayList<Ingrediente> ingMussarela = new ArrayList<>();
//        ingMussarela.add(new Ingrediente(0,"Mussarela"));
//        ingMussarela.add(new Ingrediente(0,"Catupiry"));
//        ingMussarela.add(new Ingrediente(0,"Tomate"));
//        ingMussarela.add(new Ingrediente(0,"Azeitona"));

        Database database = new Database();
           database = (Database)Serialization.read(".\\pizzaria_database.dat");;;
//        
//        ArrayList<Pizza> cardapio = new ArrayList<Pizza>();
//        ArrayList<Adicional> aditivos = new ArrayList<Adicional>();
//        ArrayList< Tamanho> tamanhos = new ArrayList<Tamanho>();
//        ArrayList< Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
//        ArrayList<Administrador> administradores = new ArrayList<Administrador>();
//        ArrayList<Borda> bordas = new ArrayList<Borda>();
//        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//        Cliente cliente = null;
//        
        ArrayList<Pizza> cardapio = database.getListaPizza();
        ArrayList<Adicional> aditivos = database.getAditivos();
        ArrayList< Tamanho> tamanhos = database.getTamanhos();
        ArrayList< Ingrediente> listaIngredientes = database.getIngredientes();
        ArrayList<Administrador> administradores = database.getAdministrador();
        ArrayList<Borda> bordas = database.getBordas();
        ArrayList<Cliente> clientes = database.getClientes();
        Cliente cliente = null;
        Pedido pedidoAtual  = null;
//        
        
//        ArrayList< Ingrediente> listaIngredientes = database.getIngredientes();
//        ArrayList<Administrador> administradores = database.getAdministrador();
//        ArrayList<Borda> bordas = database.getBordas();
        
//        bordas.add(new Borda (bordas.size(), "Catupiry", 2.50));
//        bordas.add(new Borda (bordas.size(), "Cheddar", 2.50));
//        bordas.add(new Borda (bordas.size(), "Goiabada", 2.50));
//        bordas.add(new Borda (bordas.size(), "Chocolate", 2.50));
//        bordas.add(new Borda (bordas.size(), "Requeijão", 2.50));
//        bordas.add(new Borda (bordas.size(), "Provolone", 2.50));
//
//        
//            
//            cardapio.add(new Pizza( cardapio.size(), "Calabresa" , 21.0 , ingCalabresa));
//            cardapio.add(new Pizza( cardapio.size(), "Milho" , 21.0 , ingMilho));
//            cardapio.add(new Pizza(cardapio.size(), "Marguerita" , 21.0 , ingMarguerita));
//            cardapio.add(new Pizza(cardapio.size(), "Americana" , 21.0 , ingAmericana));
//            cardapio.add(new Pizza(cardapio.size(), "Mussarela" , 21.0 , ingMussarela));
//            cardapio.add(new Pizza(cardapio.size(), "Bacon" , 21.0 , ingBacon));
//            cardapio.add(new Pizza(cardapio.size(), "Frango c/ Catupiry" , 21.0 , ingfrangocatupiry));
//            cardapio.add(new Pizza(cardapio.size(), "Batata" , 21.0 , ingbatata));
//            cardapio.add(new Pizza(cardapio.size(), "Baiana" , 21.0 , ingbaiana));
//            cardapio.add(new Pizza( cardapio.size(), "Quatro queijos" , 20.0, ing4queijos ));
//            cardapio.add(new Pizza(cardapio.size(), "Portuguesa" , 21.0 , ingPortuguesa));
//            cardapio.add(new Pizza(cardapio.size(), "Palmito c/ Catupiry" , 21.0 , ingPalmitoCatup));
//            cardapio.add(new Pizza(cardapio.size(), "Champignon" , 21.0 , ingChampignon));
//            cardapio.add(new Pizza(cardapio.size(), "Lombo" , 21.0 , inglombo));
//            cardapio.add(new Pizza(cardapio.size(), "Chilena" , 21.0 , ingChilena));
//            cardapio.add(new Pizza(cardapio.size(), "Atum" , 21.0 , ingAtum));
//            cardapio.add(new Pizza(cardapio.size(), "HotDog" , 21.0 , ingHotdog));
//            cardapio.add(new Pizza(cardapio.size(), "Tomate Seco" , 21.0 , ingtomateseco));
//            cardapio.add(new Pizza( cardapio.size(), "Strogonoff De Frango" , 20.0, ingStrogonoff ));
//            cardapio.add(new Pizza(cardapio.size(), "Romeu e Julieta" , 21.0 , ingRomeuejulieta));
//            cardapio.add(new Pizza(cardapio.size(), "Prestígio" , 21.0 , ingPrestigio));
//            cardapio.add(new Pizza(cardapio.size(), "Confete" , 21.0 , ingConfete));
//            cardapio.add(new Pizza(cardapio.size(), "Banana" , 21.0 , ingBanana));
//            
//            tamanhos.add(new Tamanho(tamanhos.size(), "Pequena", 1 ));
//            tamanhos.add(new Tamanho(tamanhos.size(), "Média", 1.4 ));
//            tamanhos.add(new Tamanho(tamanhos.size(), "Grande", 1.8 ));
//            
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Azeitona"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Bacon"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Banana"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(),new Ingrediente(0, "Batata Palha"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Calabresa"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(),new Ingrediente(0, "Canela"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Catupiri"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Cebola"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Champignon"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Chocolate ao Leite"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Confete"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Ervilha"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Frango"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Goiabada"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Granulado"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Leite Condensado"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Lombo"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Manjericão"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Milho Verde"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Mussarela"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Oregano"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Ovo"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Palmito"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Parmesao"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Pimenta Calabresa"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Presunto"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Purê de Batata"), 2.0));
//            aditivos.add(new Adicional(aditivos.size(), new Ingrediente(0,"Tomate"), 2.0));
////        
////      Salvando Ingredientes das Pizzas
////        Serialization.write(ing4queijos, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingBacon, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingPortuguesa, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingPalmitoCatup, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingRomeuejulieta, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingPrestigio, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingConfete, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingBanana, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingStrogonoff, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingtomateseco, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingHotdog, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingAtum, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingCalabresa, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingMilho, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingMarguerita, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingAmericana, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingChilena, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingChampignon, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingfrangocatupiry, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingbatata, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingbaiana, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(inglombo, "d:\\pizzaria_ingredientes.dat");
////        Serialization.write(ingMussarela, "d:\\pizzaria_ingredientes.dat");
//               
////      Declaração da Leitura
////        ArrayList<Ingrediente> ings4queijos = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsBacon = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsPortuguesa = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsPalmitoCatup = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsRomeuejulieta = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsPrestigio = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsConfete = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        ArrayList<Ingrediente> ingsBanana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsingStrogonoff = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingstomateseco = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsHotdog = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsAtum = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsCalabresa = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsMilho = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsMarguerita = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsAmericana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsChilena = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsChampignon = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsbatata = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
////        ArrayList<Ingrediente> ingsbaiana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat"); 
////        ArrayList<Ingrediente> ingsMussarela = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat"); 
////        ArrayList<Ingrediente> ingslombo = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
////        
       
        
   Scanner input = new Scanner(System.in);
//               
//        administradores.add(new Administrador("yuu", "mirainikki"));
//        clientes.add(new Cliente("R: antonioPatricio", "9 88169656", "Eustaquio", "ola"));
        int navegacao = 0 ; 
        int quantSabores = 0;
        int escolherPizza = 0;
        int escolherAdicional = 0;
        int painelAdm = 0;
        int painelPizza = 0;
        int painelIng = 0;
        int painelBord = 0;
        int painelCliente = 0;
        int painelAditiv = 0;
        int painelTam = 0;
        String login = "";
        String senha = "";
        Double valorAtual = 0.0;
        double valor=0;
        ArrayList<Pizza> PizzasPedido = new ArrayList<>();
        ArrayList<Adicional> aditivosPedido = new ArrayList<>();
        Borda bordaAtual = null;
        
        int escolherTamanho = 0;
        
        
        
    
        
        do{
            System.out.println("=================  La Pizzeria  ==================");
            System.out.println("Bem vindos");
            System.out.println(" 1 - Deseja entrar como Administrador");
            System.out.println(" 2 - Deseja entrar como Cliente");
            System.out.println(" 3 - Deseja se cadastrar");
            System.out.println(" 0 - Caso deseje finalizar a aplicação");
            System.out.println("==================================================");
            navegacao = input.nextInt();
            
            if( navegacao == 1 ){
                boolean logar = false;
                String senhaAdm = "";
                System.out.println("Digite seu nome e senha ");
                System.out.print("nome: ");
                login = input.next();
                System.out.println("");
                for(int c = 0; c < administradores.size(); c++){
                    Administrador adm = administradores.get(c);
                    if(adm.getNome().equalsIgnoreCase(login)){
                        logar = true;
                        senhaAdm = adm.getSenha();
                    }
                }
                if(logar){
                    System.out.print("senha: ");
                    senha = input.next();
                    System.out.println("");
                    System.out.println("senhaadm"+senhaAdm);
                    System.out.println(senha);
                    if(senha.equals(senhaAdm)){
                        
                        

                    do{
                        System.out.println("==============  Painel Administrativo  ===============");
                        System.out.println(" 1 - Pizzas");
                        System.out.println(" 2 - Ingredientes ");
                        System.out.println(" 3 - Bordas");
                        System.out.println(" 4 - Aditivos");
                        System.out.println(" 5 - Tamanhos");
                        System.out.println(" 0 - Caso deseje sair do painel Administrativo");
                        System.out.println("==================================================");
                        painelAdm = input.nextInt();
                        if( painelAdm == 1){
                            System.out.println("==============  Pizzas  ===============");
                            System.out.println(" 1 - Adicionar pizza");
                            System.out.println(" 2 - Excluir pizza");
                            System.out.println(" 3 - Visualizar pizzas");
                            System.out.println(" 0 - Caso deseje sair do painel de pizzas");
                            System.out.println("==================================================");
                            painelPizza = input.nextInt();
                            if( painelPizza == 1){
                                String nome = "";
                                double valordaPizza = 0.0;
                                int fimIng = 0;
                                ArrayList<Ingrediente> ingrNovPizza = new ArrayList<>();
                                System.out.println("==============  Adicionar pizza  ===============");
                                System.out.println(" Digite o nome da pizza ");
                                nome = input.next();
                                System.out.println(" Digite o Valor da pizza ");
                                valordaPizza = input.nextDouble();
                                do{
                                    System.out.println("===========  Adicionar ingrediente da pizza  ============");
                                    System.out.println(" 1 - adicionar um novo ingrediente ");
                                    System.out.println(" 0 - Caso não deseje adicionar mais ingredientes");
                                    System.out.println("==================================================");
                                    fimIng = input.nextInt();
                                    if(fimIng == 1){
                                        int add = 0;
                                        for( int n = 0; n < listaIngredientes.size(); n++){
                                            Ingrediente ing = listaIngredientes.get(n);
                                            System.out.println( "Digite: "+ing.getId()+" para adicionar o ingrediente " + ing.getNome() + " nesta pizza.");
                                            System.out.println(" ");
                                            System.out.println("                    ~~                    ");
                                        }
                                        System.out.println("");
                                        System.out.println("==================================================");
                                        add = input.nextInt();
                                        if(add >= 0 && add < listaIngredientes.size()){
                                            ingrNovPizza.add(listaIngredientes.get(add));
                                        }
                                        
                                    } 
                                } while(fimIng != 0 );
                                
                                if(!nome.equalsIgnoreCase("") && valordaPizza > 0.0 && ingrNovPizza.size() > 0){
                                    cardapio.add(new Pizza( cardapio.size(), nome , valordaPizza , ingrNovPizza));
                                }
                            } else if(painelPizza == 2){
                                int remove = 0;
                                String confirm = "";
                                System.out.println("===========  Remover pizza  ============");
                                System.out.println("");
                                System.out.println(" Digite o id da pizza que deseja excluir");
                                System.out.println("==================================================");
                                remove = input.nextInt();
                                
                                if(remove >= 0 && remove < cardapio.size()){
                                    Pizza pizza = cardapio.get(remove);
                                    System.out.println(" Deseja excluir a pizza "+ pizza.getNome());
                                    System.out.println(" Digite SIM para confirmar a exclusão");
                                    System.out.println(" Caso nao deseje excluir digite qualquer outra coisa");
                                    System.out.println(" ==================================================");
                                    if(confirm.equals(" SIM")){
                                       cardapio.remove(remove);
                                       System.out.println(" A pizza "+ pizza.getNome()+ " foi excluida com sucesso");
                                    } else {
                                        System.out.println(" Falha ao excluir, lembre-se de digitar 'SIM' em caixa alta. ");
                                    }
                                } else{
                                    System.out.println(" Você precisa escolher uma opção valida.");
                                    System.out.println(" Caso tenha duvidads de qual excluir use a opção de visualizar Pizzas para facilitar");
                                }

                            } else if(painelPizza == 3) {
                                for (int i = 0; i < cardapio.size(); i++) {
                                    Pizza pizza = cardapio.get(i);
                                    System.out.println( " "+pizza.getId()+" --- " + pizza.getNome());
                                    System.out.println(" ");
                                    System.out.println("                 ~~                 ");
                                }
            
                            }
                        } else if( painelAdm == 2){
                            System.out.println("==============  Ingredientes  ===============");
                            System.out.println(" 1 - Adicionar ingredientes");
                            System.out.println(" 2 - Excluir ingredientes");
                            System.out.println(" 3 - Visualizar ingredientes");
                            System.out.println(" 0 - Caso deseje sair do painel de ingredientes");
                            System.out.println("==================================================");
                            painelIng = input.nextInt();
                            if( painelIng == 1){
                                String nome = "";
                                int fimIng = 0;                               
                                System.out.println("==============  Adicionar ingrediente  ===============");
                                System.out.println(" Digite o nome da ingrediente ");
                                nome = input.next();
                                
                                if(!nome.equalsIgnoreCase("") ){
                                    listaIngredientes.add(new Ingrediente( listaIngredientes.size(), nome));
                                }
                            } else if(painelIng == 2){
                                int remove = 0;
                                String confirm = "";
                                System.out.println("===========  Remover Ingredientes  ============");
                                System.out.println("");
                                System.out.println(" Digite o id do ingrediente que deseja excluir");
                                System.out.println("==================================================");
                                remove = input.nextInt();
                                
                                if(remove >= 0 && remove < listaIngredientes.size()){
                                    Ingrediente ingrediente = listaIngredientes.get(remove);
                                    System.out.println(" Deseja excluir o ingrediente "+ ingrediente.getNome());
                                    System.out.println(" Digite SIM para confirmar a exclusão");
                                    System.out.println(" Caso não deseje excluir digite qualquer outra coisa");
                                    System.out.println(" ==================================================");
                                    if(confirm.equals(" SIM")){
                                       listaIngredientes.remove(remove);
                                       System.out.println(" O ingrediente "+ ingrediente.getNome()+ " foi excluida com sucesso");
                                    } else {
                                        System.out.println(" Falha ao excluir, lembre-se de digitar 'SIM' em caixa alta. ");
                                    }
                                } else{
                                    System.out.println(" Você precisa escolher uma opção valida.");
                                    System.out.println(" Caso tenha duvidas de qual excluir use a opção de visualizar ingredientes para facilitar");
                                }

                            } else if(painelIng == 3) {
                                for (int i = 0; i < listaIngredientes.size(); i++) {
                                    Ingrediente ingrediente = listaIngredientes.get(i);
                                    System.out.println( " "+ingrediente.getId()+" --- " + ingrediente.getNome());
                                    System.out.println(" ");
                                    System.out.println("                 ~~                 ");
                                }
            
                            }
                            
                        } else if( painelAdm == 3){
                            System.out.println("==============  Bordas  ===============");
                            System.out.println(" 1 - Adicionar borda");
                            System.out.println(" 2 - Excluir borda");
                            System.out.println(" 3 - Visualizar bordas");
                            System.out.println(" 0 - Caso deseje sair do painel de bordas");
                            System.out.println("==================================================");
                            painelBord = input.nextInt();
                            if( painelBord == 1){
                                String nome = "";
                                int fimIng = 0;   
                                double valordaBorda = 0.0;
                                System.out.println("==============  Adicionar borda  ===============");
                                System.out.println(" Digite o nome da borda ");
                                nome = input.next();
                                System.out.println(" Digite o Valor da borda ");
                                valordaBorda = input.nextDouble();
                                if(!nome.equalsIgnoreCase("") && valordaBorda > 0.0){
                                    bordas.add(new Borda(bordas.size(), nome, valordaBorda));
                                }
                            } else if(painelBord == 2){
                                int remove = 0;
                                String confirm = "";
                                System.out.println("===========  Remover borda  ============");
                                System.out.println("");
                                System.out.println(" Digite o id da borda que deseja excluir");
                                System.out.println("==================================================");
                                remove = input.nextInt();
                                
                                if(remove >= 0 && remove < bordas.size()){
                                    Borda borda = bordas.get(remove);
                                    System.out.println(" Deseja excluir a borda "+ borda.getNome());
                                    System.out.println(" Digite SIM para confirmar a exclusão");
                                    System.out.println(" Caso não deseje excluir digite qualquer outra coisa");
                                    System.out.println(" ==================================================");
                                    if(confirm.equals(" SIM")){
                                       bordas.remove(remove);
                                       System.out.println(" A borda "+ borda.getNome()+ " foi excluida com sucesso");
                                    } else {
                                        System.out.println(" Falha ao excluir, lembre-se de digitar 'SIM' em caixa alta. ");
                                    }
                                } else{
                                    System.out.println(" Você precisa escolher uma opção valida.");
                                    System.out.println(" Caso tenha duvidas de qual excluir use a opção de visualizar bordas para facilitar");
                                }

                            } else if(painelBord == 3) {
                                for (int i = 0; i < bordas.size(); i++) {
                                    Borda borda = bordas.get(i);
                                    System.out.println( " "+borda.getId()+" --- " + borda.getNome());
                                    System.out.println(" ");
                                    System.out.println("                 ~~                 ");
                                }
            
                            }
                            
                        } 
                        
                         else if( painelAdm == 4){
                            System.out.println("==============  Aditivos  ===============");
                            System.out.println(" 1 - Adicionar aditivo");
                            System.out.println(" 2 - Excluir aditivo");
                            System.out.println(" 3 - Visualizar aditivos");
                            System.out.println(" 0 - Caso deseje sair do painel de bordas");
                            System.out.println("==================================================");
                            painelAditiv = input.nextInt();
                            if( painelAditiv == 1){
                                String nome = "";
                                int ing = 0;   
                                double valordoAdicional = 0.0;
                                System.out.println("==============  Adicionar aditivo  ===============");
                                System.out.println(" ");
                                System.out.println(" Digite o id do ingrediente que deseja transformar em Aditivo ");
                                ing = input.nextInt();
                                System.out.println(" Digite o Valor do Aditivo ");
                                valordoAdicional = input.nextDouble();
                                if(ing >= 0 && ing < listaIngredientes.size() && valordoAdicional > 0.0){
                                    aditivos.add( new Adicional(aditivos.size(), listaIngredientes.get(ing), valordoAdicional));
                                }
                            } else if(painelAditiv == 2){
                                int remove = 0;
                                String confirm = "";
                                System.out.println("===========  Remover Aditivo  ============");
                                System.out.println("");
                                System.out.println(" Digite o id do Aditivo que deseja excluir");
                                System.out.println("==================================================");
                                remove = input.nextInt();
                                
                                if(remove >= 0 && remove < aditivos.size()){
                                    Adicional adicional = aditivos.get(remove);
                                    System.out.println(" Deseja excluir o aditivo "+ adicional.getNome());
                                    System.out.println(" Digite SIM para confirmar a exclusão");
                                    System.out.println(" Caso não deseje excluir digite qualquer outra coisa");
                                    System.out.println(" ==================================================");
                                    if(confirm.equals(" SIM")){
                                       aditivos.remove(remove);
                                       System.out.println(" O aditivo "+ adicional.getNome()+ " foi excluida com sucesso");
                                    } else {
                                        System.out.println(" Falha ao excluir, lembre-se de digitar 'SIM' em caixa alta. ");
                                    }
                                } else{
                                    System.out.println(" Você precisa escolher uma opção valida.");
                                    System.out.println(" Caso tenha duvidas de qual excluir use a opção de visualizar bordas para facilitar");
                                }

                            } else if(painelAditiv == 3) {
                                for (int i = 0; i < aditivos.size(); i++) {
                                    Adicional adicional = aditivos.get(i);
                                    System.out.println( " "+adicional.getId()+" --- " + adicional.getNome());
                                    System.out.println(" ");
                                    System.out.println("                 ~~                 ");
                                }
            
                            }
                            
                        } 
                         else if( painelAdm == 5){
                            System.out.println("==============  Tamanhos  ===============");
                            System.out.println(" 1 - Adicionar Tamanho");
                            System.out.println(" 2 - Excluir tamanho");
                            System.out.println(" 3 - Visualizar tamanhos");
                            System.out.println(" 0 - Caso deseje sair do painel de tamanhos");
                            System.out.println("==================================================");
                            painelAditiv = input.nextInt();
                            if( painelTam == 1){
                                String nome = "";
                                double mult = 0.0;
                                System.out.println("==============  Adicionar tamanho  ===============");
                                System.out.println("");
                                System.out.println(" Digite o nome do tamanho");
                                nome = input.next();
                                System.out.println("");
                                System.out.println(" Digite o multiplicador");
                                System.out.println(" ex: 1, para 100% do preço, 1.5 para 150% do preço e etc");
                                mult = input.nextDouble();
                                if(!nome.equalsIgnoreCase("") && mult > 0.0){
                                    tamanhos.add(new Tamanho(tamanhos.size(), nome, mult));
                                }
                            } else if(painelAditiv == 2){
                                int remove = 0;
                                String confirm = "";
                                System.out.println("===========  Remover Tamanho  ============");
                                System.out.println("");
                                System.out.println(" Digite o id do Tamanho que deseja excluir");
                                System.out.println("==================================================");
                                remove = input.nextInt();
                                
                                if(remove >= 0 && remove < tamanhos.size()){
                                    Tamanho tamanho = tamanhos.get(remove);
                                    System.out.println(" Deseja excluir o tamanho "+ tamanho.getNomeTamanho());
                                    System.out.println(" Digite SIM para confirmar a exclusão");
                                    System.out.println(" Caso não deseje excluir digite qualquer outra coisa");
                                    System.out.println(" ==================================================");
                                    if(confirm.equals(" SIM")){
                                       tamanhos.remove(remove);
                                       System.out.println(" O aditivo "+ tamanho.getNomeTamanho()+ " foi excluida com sucesso");
                                    } else {
                                        System.out.println(" Falha ao excluir, lembre-se de digitar 'SIM' em caixa alta. ");
                                    }
                                } else{
                                    System.out.println(" Você precisa escolher uma opção valida.");
                                    System.out.println(" Caso tenha duvidas de qual excluir use a opção de visualizar tamanho para facilitar");
                                }

                            } else if(painelTam == 3) {
                                for (int i = 0; i < tamanhos.size(); i++) {
                                    Tamanho tamanho = tamanhos.get(i);
                                    System.out.println( " "+tamanho.getId()+" --- " + tamanho.getNomeTamanho());
                                    System.out.println(" ");
                                    System.out.println("                 ~~                 ");
                                }
            
                            }
                            
                        }
                        
                        
                        
                        
                        
                    } while(painelAdm != 0);
                        
                    } else {
                        System.out.println("senha incorreta.");
                    }
                } else {
                    System.out.println("Administrador não encontrado");
                }
            
                
                
            }
            
            if( navegacao == 2 ){
                
                boolean logar = false;
                String senhaCliente = "";
                System.out.println("Digite seu nome e senha ");
                System.out.print("nome: ");
                login = input.next();
                System.out.println("");
                for(int c = 0; c < clientes.size(); c++){
                    cliente = clientes.get(c);
                    System.out.println(cliente.getNome());
                    if(cliente.getNome().equalsIgnoreCase(login)){
                        logar = true;
                        senhaCliente = cliente.getSenha();
                    }
                }
                if(logar){
                    System.out.print("senha: ");
                    senha = input.next();
                    System.out.println("");
                    if(senha.equals(senhaCliente)){
                      

                        do{
                            System.out.println("=================  La Pizzeria  ==================");
                            System.out.println("Bem vindo");
                            System.out.println(" 1 - Deseja Fazer um novo pedido");
                            System.out.println(" 2 - Deseja ver pedidos anteriores");
                            System.out.println(" 0 - Caso deseje voltar ao menu Principal");
                            System.out.println("==================================================");
                            painelCliente = input.nextInt();
                            
                            if( painelCliente == 1){
                                
                                

                            do {
                                System.out.println("===============  QUANTIDADE DE SABORES  ================");
                                System.out.println(" Quantos sabores deseja na sua pizza");
                                System.out.println(" 1 - Pizza com apenas um sabor");
                                System.out.println(" 2 - Pizza de dois sabores");
                                System.out.println(" 0 - Caso deseje voltar");
                                System.out.println("==================================================");
                                quantSabores = input.nextInt();

                                if( quantSabores == 1 || quantSabores == 2 ){

                                    do {
                                        System.out.println("===================  TAMANHOS  ===================");
                                        for (int i = 0; i < tamanhos.size(); i++) {
                                            Tamanho tamanho = tamanhos.get(i);
                                            System.out.println( "Digite: "+tamanho.getId()+" para escolher o tamanho " + tamanho.getNomeTamanho());
                                            System.out.println(" ");
                                            System.out.println("                    ~~                    ");

                                        }

                                        System.out.println( "Digite: "+ tamanhos.size() + "  - Caso deseje voltar ");
                                        System.out.println(" ");
                                        System.out.println("==================================================");

                                        System.out.println(" ");
                                        System.out.println("Escolha uma opção ");
                                        escolherTamanho = input.nextInt();
                                        if (escolherTamanho == 1) {
                                            valor = 21*1.4;
                                        } else if (escolherTamanho == 2){
                                            valor = 21*1.8;
                                        } else{
                                            valor = 21;
                                        }

                                        if(escolherTamanho >= 0 && escolherTamanho < tamanhos.size()){

                                            for(int q = 0 ; q < quantSabores; q++ ){
                                                do {
                                                    System.out.println("===================  CARDÁPIO  ===================");
                                                    for (int c = 0; c < cardapio.size(); c++) {
                                                        Pizza pizza = cardapio.get(c);
                                                        ArrayList<Ingrediente> ingredientes = pizza.getIngredientes();
                                                        System.out.println( "Digite: "+ pizza.getId() +" para escolher comprar a pizza " + pizza.getNome());
                                                        for(int i = 0; i < ingredientes.size(); i++){
                                                            Ingrediente ingrediente = ingredientes.get(i);
                                                            System.out.print(ingrediente.getNome() + ", ");
                                                        }


                                                        System.out.println(" ");
                                                        System.out.println("                    ~~                    ");
                                                    }

                                                    System.out.println( cardapio.size() + "  - Caso deseje sair do cardápio");

                                                    System.out.println(" ");
                                                    System.out.println("==================================================");

                                                    System.out.println(" ");
                                                    if(quantSabores == 1 ){
                                                        System.out.println("Escolha uma opção para sua Pizza ");
                                                    } else if(quantSabores == 2){
                                                        System.out.println( "Escolha uma opção para a "+ (q+1) + "ª metade da sua Pizza." );
                                                      valor= (valor+valor)/2;  
                                                    }

                                                    escolherPizza = input.nextInt();



                                                    if(escolherPizza >= 0 && escolherPizza < cardapio.size()){
                                                        Pizza pizza;
                                                        System.out.println("Sua escolha foi "+ cardapio.get(escolherPizza).getNome());
                                                        System.out.println("");
                                                        System.out.println(" Digite: 1 - Confirmar escolha");
                                                        System.out.println(" Digite: 2 - Cancelar escolha");

                                                        int addPizza = input.nextInt();
                                                        if( addPizza == 1 ){
                                                            System.out.println("valor atual: "+valor);
                                                            pizza = cardapio.get(escolherPizza);
                                                            pizza.setValor(valor);
                                                            PizzasPedido.add(pizza);
                                                            escolherPizza = cardapio.size();
                                                        }

                                                    } 


                                                } while( escolherPizza != cardapio.size() ) ;
                                                    
                                            }
                                            if(PizzasPedido.size() == 0 ){
                                                break;
                                            }

                                            int adc;
                                            System.out.println("Deseja escolher adicionais?");
                                            System.out.println("Digite 0 - NÃO");
                                            System.out.println("Digite 1 - SIM");
                                            adc = input.nextInt();
                                            double valorAdc = 0;
                                            valorAtual = valor;
                                            if (adc == 1){


                                            do {

                                                System.out.println("==============  INGREDIENTES ADICIONAIS  ==============");
                                                    for (int a = 0; a < aditivos.size(); a++) {
                                                        Adicional adicional = aditivos.get(a);
                                                        System.out.printf("Digite: %d para escolher comprar o adicional de %s  custando apenas %.2f",adicional.getId(), adicional.getNome(),adicional.getValor() );

                                                        System.out.println(" ");
                                                        System.out.println("                    ~~                    ");
                                                        System.out.println(" ");
                                                    }

                                                    System.out.println( "Digite: "+aditivos.size() + "  - Caso deseje sair do cardapio de adicionais");
                                                    System.out.println(" ");
                                                    System.out.println("==================================================");

                                                    System.out.println(" ");
                                                    
                                                    System.out.println("Valor atual do pedido: " +valorAtual);    
                                                    
                                                    

                                                    System.out.println( "" );
                                                    System.out.println("Escolha uma opção de adicional ");
                                                    escolherAdicional = input.nextInt();


                                                    if(escolherAdicional >= 0 && escolherAdicional < aditivos.size()){
                                                        System.out.println("Sua escolha foi "+ aditivos.get(escolherAdicional).getNome());
                                                        System.out.println("");
                                                        System.out.println(" Digite: 1 - Confirmar escolha");
                                                        System.out.println(" Digite: 2 - Cancelar escolha");
                                                        int addAdicional = input.nextInt();
                                                        if( addAdicional == 1 ){
                                                            valorAdc = 0.0;
                                                            aditivosPedido.add(aditivos.get(escolherAdicional));
                                                            System.out.println("Os Adicionais escolhidos até foram: ");
                                                            for( int a = 0; a < aditivosPedido.size(); a++){
                                                                System.out.print(aditivosPedido.get(a).getNome());
                                                                if(a == aditivosPedido.size() - 1){
                                                                    System.out.print(".");
                                                                }else if(aditivosPedido.size() > 1){
                                                                    System.out.print(", ");
                                                                }
                                                                valorAdc = valorAdc + aditivosPedido.get(a).getValor();
                                                            }
                                                                

                                                            
                                                            valorAtual = valor + valorAdc;
                                                            

                                                        }
                                                        
                                                        

                                                    }
                                                    escolherTamanho = tamanhos.size();


                                            } while (escolherAdicional != aditivos.size());
                                            }else if (adc == 0){
                                                break;

                                            }


                                        }

                                    } while (escolherTamanho != tamanhos.size());
                                        if(PizzasPedido.size() == 0 ){
                                                break;
                                        }
                                     int bd;
                                            System.out.println("Deseja escolher uma Borda?");
                                            System.out.println("Digite 0 - NÃO");
                                            System.out.println("Digite 1 - SIM");
                                            bd = input.nextInt();
                                            if (bd == 1){
                                                int escolherBorda;
                                             do {

                                                System.out.println("==============  BORDAS  ==============");
                                                    for (int a = 0; a < bordas.size(); a++) {
                                                        Borda borda = bordas.get(a);
                                                        System.out.printf("Digite: %d para adicionar a borda %s  custando apenas %.2f", borda.getId(), borda.getNome(),borda.getValor() );

                                                        System.out.println(" ");
                                                        System.out.println("                    ~~                    ");
                                                        System.out.println(" ");
                                                    }

                                                    System.out.println( "Digite: "+bordas.size() + "  - Caso deseje sair do cardapio de bordas");
                                                    System.out.println(" ");
                                                    System.out.println("==================================================");

                                                    System.out.println(" ");

                                                    System.out.println(  );
                                                    System.out.println("Escolha uma opção de Borda ");

                                                    escolherBorda = input.nextInt();


                                                    if(escolherBorda >= 0 && escolherBorda < bordas.size()){
                                                        System.out.println("Sua escolha foi "+ bordas.get(escolherBorda).getNome());
                                                        System.out.println("");
                                                        System.out.println(" Digite: 1 - Confirmar escolha");
                                                        System.out.println(" Digite: 2 - Cancelar escolha");
                                                        int addBorda = input.nextInt();
                                                        if( addBorda == 1 ){
                                                            bordaAtual = bordas.get(escolherBorda);
                                                            double valorBd=0;                                   
                                                            valorBd =  bordas.get(escolherBorda).getValor();
                                                            valorAtual += valorBd;
                                                            System.out.println("Valor atual do pedido: " +valorAtual);
                                                            escolherBorda = bordas.size();
                                                           
                                                        }

                                                    }
                                                    if(escolherBorda == bordas.size()){
                                                        quantSabores = 0;
                                                    }

                                    } while (escolherBorda != bordas.size());
                                }else if (bd==0){
                                    break;
                                }
                                            
                                
                                            
                            }
                                

                            } while(quantSabores != 0 );
                            
                            ArrayList<Pedido> meusPedidos = cliente.getPedidosCliente();
                                                                
                            if( PizzasPedido.size() != 0 && bordas != null && aditivosPedido.size() != 0 ){                              
                                pedidoAtual = new Pedido( meusPedidos.size(), PizzasPedido.size(), PizzasPedido, aditivosPedido, valorAtual, bordaAtual);
                                meusPedidos.add(pedidoAtual);
                                cliente.setPedidosCliente(meusPedidos);
                            } else if( PizzasPedido.size() != 0 && bordas != null && aditivosPedido.size() == 0){
                                pedidoAtual = new Pedido(meusPedidos.size(), PizzasPedido.size(), PizzasPedido, valorAtual, bordaAtual);
                                meusPedidos.add(pedidoAtual);
                                cliente.setPedidosCliente(meusPedidos);
                            } else if(PizzasPedido.size() != 0 && bordas == null && aditivosPedido.size() != 0){
                                pedidoAtual = new Pedido(meusPedidos.size(), PizzasPedido.size(), PizzasPedido, aditivosPedido, valorAtual);
                                meusPedidos.add(pedidoAtual);
                                cliente.setPedidosCliente(meusPedidos);
                            } else if (PizzasPedido.size() != 0 && bordas == null && aditivosPedido.size() == 0){
                                pedidoAtual = new Pedido( meusPedidos.size(), PizzasPedido.size(), PizzasPedido, valorAtual);
                                meusPedidos.add(pedidoAtual);
                                cliente.setPedidosCliente(meusPedidos);
                            }





                            } else if( painelCliente == 2){
                                
                                ArrayList<Pedido> meusPedidos =  cliente.getPedidosCliente();
                                ArrayList<Pizza> minhaPizza = null;
                                ArrayList<Adicional> meusAditivos = null;
                                Borda borda = null;
                                Double valorTotal = null;

                                System.out.println("=================  Meus pedidos  ==================");
                                System.out.println(" Lista de pedidos");
                                System.out.println("");
                                for (int i = 0; i < meusPedidos.size(); i++) {
                                    Pedido pedido = meusPedidos.get(i);
                                    minhaPizza = pedido.getPizzas();
                                    meusAditivos = pedido.getAditivos();
                                    valorTotal = pedido.getValorTotal();
                                    System.out.println( " pedido: "+pedido.getId());
                                    System.out.println("");
                                    System.out.print(" Pizza de :");
                                    
                                    for (int j = 0; j < minhaPizza.size(); j++) {
                                        Pizza pizza = minhaPizza.get(j);
                                        System.out.print(pizza.getNome());
                                        if(minhaPizza.size() > 1){
                                            System.out.print(" e ");
                                        } else if(j == minhaPizza.size() - 1) {
                                            System.out.println(".");
                                        }
                                    }
                                    if(meusAditivos.size() > 0){
                                        System.out.println("");
                                    System.out.print(" Com adicional de: ");
                                    
                                    for (int j = 0; j < meusAditivos.size(); j++) {
                                        Adicional adicional = meusAditivos.get(j);
                                        System.out.print(adicional.getNome());
                                        if(meusAditivos.size() > 1){
                                            System.out.print(" e ");
                                        } else if(j == meusAditivos.size() - 1) {
                                            System.out.println(".");
                                        }
                                    }
                                    }
                                    if(borda != null){
                                        System.out.println("");
                                        System.out.print(" Com borda de : ");
                                        System.out.println( borda.getNome());
                                        System.out.println("");
                                   
                                        
                                    }
                                    
                                    System.out.println(" No valor de: ");
                                    System.out.printf(" R$: %.2f", valorTotal);
                                    System.out.println("");
                                }
                            }
                            
                            
                        } while( painelCliente != 0);
                        
                    } else {
                        System.out.println("senha incorreta.");
                    }
                } else {
                    System.out.println("Administrador não encontrado");
                }
                
                
            } else if( navegacao == 3){
                String vazio = "";
                String nome = "";
                String endereco = "";
                String telefone = "";
                String senhaCadastro = "";
                System.out.println("============= Cadastre-se ==============");
                System.out.println("");
                System.out.println("Digite seu nome");
                System.out.println("Obs: esse será seu usuário em nosso app");
                System.out.print("Obs: lembre-se de não usar espaço e caracteres especiais \n");
                System.out.print("Nome:");
                
                nome = input.next();
                System.out.println("");
                System.out.println("Digite sua senha");
                System.out.println("Obs: lembre-se de não usar espaço e caracteres especiais");
                System.out.print(nome);
                System.out.print("Senha: ");
                senhaCadastro = input.next();
                System.out.println("");
                System.out.println("Digite seu endereço");
                System.out.println("Obs: Lembre-se de informar rua, nº e bairro.");
                System.out.print("Endereço: ");
                vazio = input.nextLine();
                endereco = input.nextLine();
                System.out.println("");
                System.out.println("Digite seu número de telefone");
                System.out.println("Obs: Lembre-se de colocar o ddd e somente números ");
                System.out.print("Telefone: ");
                telefone = input.nextLine();
                
                if(!nome.equals("") && !senhaCadastro.equals("") && !endereco.equals("") && !telefone.equals("")){
                    clientes.add(new Cliente(endereco, telefone, nome , senhaCadastro ));
                } else {
                    System.out.println("Não foi possivel completar o cadastro, tente novamente.");
                }
                
             
                
            }
            
        
        } while( navegacao != 0);
        
        database.setListaPizza(cardapio);
        database.setTamanhos(tamanhos);
        database.setAditivos(aditivos);
        database.setIngredientes(listaIngredientes);
        database.setAdministrador(administradores);
        database.setClientes(clientes);
        database.setBordas(bordas);
        Serialization.write(database, ".\\pizzaria_database.dat");
               
        
       
        
    }
    


    
}
 


 



