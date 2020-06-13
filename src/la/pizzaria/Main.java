package la.pizzaria;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
//        ArrayList<Ingrediente> ing4queijos = new ArrayList<>();
//        ing4queijos.add(new Ingrediente("Mussarela"));
//        ing4queijos.add( new Ingrediente("Provolone"));
//        ing4queijos.add(new Ingrediente("Queijo prato"));
//        ing4queijos.add(new Ingrediente("Parmesão"));
//        ing4queijos.add(new Ingrediente("Catupiry"));
//        ing4queijos.add( new Ingrediente("Tomate"));
//        ing4queijos.add( new Ingrediente("Azeitona"));
//        
//        
//        ArrayList<Ingrediente> ingBacon = new ArrayList<>();
//        ingBacon.add(new Ingrediente("Mussarela"));
//        ingBacon.add( new Ingrediente("Bacon"));
//        ingBacon.add(new Ingrediente("Catupiry"));
//        ingBacon.add(new Ingrediente("Tomate"));
//        ingBacon.add(new Ingrediente("Azeitona"));
//        
//        
//        ArrayList<Ingrediente> ingPortuguesa = new ArrayList<>();
//        ingPortuguesa.add(new Ingrediente("Mussarela"));
//        ingPortuguesa.add( new Ingrediente("Presunto"));
//        ingPortuguesa.add(new Ingrediente("Milho"));
//        ingPortuguesa.add(new Ingrediente("Palmito"));
//        ingPortuguesa.add(new Ingrediente("Cebola"));
//        ingPortuguesa.add( new Ingrediente("Ovo"));
//        ingPortuguesa.add( new Ingrediente("Catupiry"));
//        ingPortuguesa.add( new Ingrediente("Tomate"));
//        ingPortuguesa.add( new Ingrediente("Azeitona"));
//        
//                   
//        ArrayList<Ingrediente> ingPalmitoCatup = new ArrayList<>();
//        ingPalmitoCatup.add(new Ingrediente("Mussarela"));
//        ingPalmitoCatup.add( new Ingrediente("Palmito"));
//        ingPalmitoCatup.add(new Ingrediente("Catupiry"));
//        ingPalmitoCatup.add(new Ingrediente("Tomate"));
//        ingPalmitoCatup.add(new Ingrediente("Azeitona"));
//        
//        ArrayList<Ingrediente> ingRomeuejulieta = new ArrayList<>();
//        ingRomeuejulieta.add(new Ingrediente("Mussarela"));
//        ingRomeuejulieta.add(new Ingrediente("Goiabada"));
//
//        ArrayList<Ingrediente> ingPrestigio = new ArrayList<>();
//        ingPrestigio.add(new Ingrediente("Mussarela"));
//        ingPrestigio.add(new Ingrediente("Chocolate ao leite"));
//        ingPrestigio.add(new Ingrediente("Coco ralado"));
//        ingPrestigio.add(new Ingrediente("Leite Condensado"));
//        
//        ArrayList<Ingrediente> ingConfete = new ArrayList<>();
//        ingConfete.add(new Ingrediente("Mussarela"));
//        ingConfete.add(new Ingrediente("Chocolate ao leite"));
//        ingConfete.add(new Ingrediente("Confete"));
//
//        ArrayList<Ingrediente> ingBanana = new ArrayList<>();
//        ingBanana.add(new Ingrediente("Mussarela"));
//        ingBanana.add(new Ingrediente("Banana"));
//        ingBanana.add(new Ingrediente("Creme de Leite"));
//        ingBanana.add(new Ingrediente("Leite Condensado"));
//        ingBanana.add(new Ingrediente("Canela"));
//
//        ArrayList<Ingrediente> ingStrogonoff = new ArrayList<>();
//        ingStrogonoff.add(new Ingrediente("Mussarela"));
//        ingStrogonoff.add(new Ingrediente("Frango"));
//        ingStrogonoff.add(new Ingrediente("Molho especial"));
//        ingStrogonoff.add(new Ingrediente("Batata palha"));
//        ingStrogonoff.add(new Ingrediente("Tomate"));
//        ingStrogonoff.add(new Ingrediente("Azeitona"));
//        
//    ArrayList<Ingrediente> ingtomateseco = new ArrayList<>();
//        ingtomateseco.add(new Ingrediente("Mussarela"));
//        ingtomateseco.add(new Ingrediente("Parmesão"));
//        ingtomateseco.add(new Ingrediente("Catupiry"));
//        ingtomateseco.add(new Ingrediente("Tomate seco"));
//        ingtomateseco.add(new Ingrediente("Azeitona"));
//
//    ArrayList<Ingrediente> ingHotdog = new ArrayList<>();
//        ingHotdog.add(new Ingrediente("Mussarela"));
//        ingHotdog.add(new Ingrediente("Molho de Salsicha"));
//        ingHotdog.add(new Ingrediente("Batata palha"));
//        ingHotdog.add(new Ingrediente("Tomate"));
//        ingHotdog.add(new Ingrediente("Azeitona"));
//
//    ArrayList<Ingrediente> ingAtum = new ArrayList<>();
//        ingAtum.add(new Ingrediente("Mussarela"));
//        ingAtum.add(new Ingrediente("Atum"));
//        ingAtum.add(new Ingrediente("Cebola"));
//        ingAtum.add(new Ingrediente("Tomate"));
//        ingAtum.add(new Ingrediente("Azeitona"));
//        
//        ArrayList<Ingrediente> ingCalabresa = new ArrayList<>();
//        ingCalabresa.add(new Ingrediente("Mussarela"));
//        ingCalabresa.add(new Ingrediente("Calabresa"));
//        ingCalabresa.add(new Ingrediente("Cebola"));
//        ingCalabresa.add(new Ingrediente("Catupiry"));
//        ingCalabresa.add(new Ingrediente("Tomate"));
//        ingCalabresa.add(new Ingrediente("Azeitona"));
//        
//ArrayList<Ingrediente> ingMilho = new ArrayList<>();
//        ingMilho.add(new Ingrediente("Mussarela"));
//        ingMilho.add(new Ingrediente("Milho Verde"));
//        ingMilho.add(new Ingrediente("Catupiry"));
//        ingMilho.add(new Ingrediente("Tomate"));
//        ingMilho.add(new Ingrediente("Azeitona"));
//        
//ArrayList<Ingrediente> ingMarguerita = new ArrayList<>();
//    ingMarguerita.add(new Ingrediente("Mussarela"));
//        ingMarguerita.add(new Ingrediente("Parmesão"));
//        ingMarguerita.add(new Ingrediente("Catupiry"));
//        ingMarguerita.add(new Ingrediente("Tomate"));
//        ingMarguerita.add(new Ingrediente("Azeitona"));
//    ingMarguerita.add(new Ingrediente("Manjericão"));
//    
//ArrayList<Ingrediente> ingAmericana = new ArrayList<>();
//    ingAmericana.add(new Ingrediente("Mussarela"));
//    ingAmericana.add(new Ingrediente("Presunto"));
//    ingAmericana.add(new Ingrediente("Catupiry"));
//    ingAmericana.add(new Ingrediente("Tomate"));
//    ingAmericana.add(new Ingrediente("Azeitona"));
//    
//ArrayList<Ingrediente> ingChilena = new ArrayList<>();
//    ingChilena.add(new Ingrediente("Mussarela"));
//    ingChilena.add(new Ingrediente("Frango"));
//    ingChilena.add(new Ingrediente("Milho"));
//    ingChilena.add(new Ingrediente("Bacon"));
//    ingChilena.add(new Ingrediente("Catupiry"));
//    ingChilena.add(new Ingrediente("Tomate"));
//    ingChilena.add(new Ingrediente("Azeitona"));
//    
//ArrayList<Ingrediente> ingChampignon = new ArrayList<>();
//    ingChampignon.add(new Ingrediente("Mussarela"));
//    ingChampignon.add(new Ingrediente("Champignon"));
//    ingChampignon.add(new Ingrediente("Catupiry"));
//    ingChampignon.add(new Ingrediente("Tomate"));
//    ingChampignon.add(new Ingrediente("Azeitona"));
//    
//    ArrayList<Ingrediente> ingfrangocatupiry = new ArrayList<>();
//        ingfrangocatupiry.add(new Ingrediente("Mussarela"));
//        ingfrangocatupiry.add(new Ingrediente("Frango"));
//        ingfrangocatupiry.add(new Ingrediente("Milho"));
//        ingfrangocatupiry.add(new Ingrediente("Catupiry"));
//        ingfrangocatupiry.add(new Ingrediente("Tomate"));
//        ingfrangocatupiry.add(new Ingrediente("Azeitona"));
//
//
//ArrayList<Ingrediente> ingbatata = new ArrayList<>();
//        ingbatata.add(new Ingrediente("Mussarela"));
//        ingbatata.add(new Ingrediente("Purê de Batata"));
//        ingbatata.add(new Ingrediente("Presunto"));
//        ingbatata.add(new Ingrediente("Bacon"));
//        ingbatata.add(new Ingrediente("Catupiry"));
//        ingbatata.add(new Ingrediente("Tomate"));
//        ingbatata.add(new Ingrediente("Azeitona"));
//
//ArrayList<Ingrediente> ingbaiana = new ArrayList<>();
//        ingbaiana.add(new Ingrediente("Mussarela"));
//        ingbaiana.add(new Ingrediente("Calabresa"));
//        ingbaiana.add(new Ingrediente("Pimenta Calabresa"));
//        ingbaiana.add(new Ingrediente("Ovo"));
//        ingbaiana.add(new Ingrediente("Cebola"));
//        ingbaiana.add(new Ingrediente("Catupiry"));
//        ingbaiana.add(new Ingrediente("Tomate"));
//        ingbaiana.add(new Ingrediente("Azeitona"));
//
//ArrayList<Ingrediente> inglombo = new ArrayList<>();
//        inglombo.add(new Ingrediente("Mussarela"));
//        inglombo.add(new Ingrediente("Lombo"));
//        inglombo.add(new Ingrediente("Cebola"));
//        inglombo.add(new Ingrediente("Catupiry"));
//        inglombo.add(new Ingrediente("Tomate"));
//        inglombo.add(new Ingrediente("Azeitona"));
//        
//        ArrayList<Ingrediente> ingMussarela = new ArrayList<>();
//        ingMussarela.add(new Ingrediente("Mussarela"));
//        ingMussarela.add(new Ingrediente("Catupiry"));
//        ingMussarela.add(new Ingrediente("Tomate"));
//        ingMussarela.add(new Ingrediente("Azeitona"));

        Database database = new Database();
        database = (Database)Serialization.read(".\\pizzaria_database.dat");
        
//      ArrayList<Pedido> pedidos = database.getPedidos();
        ArrayList<Pizza> cardapio = database.getListaPizza();
        ArrayList<Adicional> aditivos = database.getAditivos();
        ArrayList< Tamanho> tamanhos = database.getTamanhos();
        
        
        
//        
//        
//        cardapio.add(new Pizza( cardapio.size(), "Calabresa" , 21.0 , ingCalabresa));
//        cardapio.add(new Pizza( cardapio.size(), "Milho" , 21.0 , ingMilho));
//        cardapio.add(new Pizza(cardapio.size(), "Marguerita" , 21.0 , ingMarguerita));
//        cardapio.add(new Pizza(cardapio.size(), "Americana" , 21.0 , ingAmericana));
//        cardapio.add(new Pizza(cardapio.size(), "Mussarela" , 21.0 , ingMussarela));
//        cardapio.add(new Pizza(cardapio.size(), "Bacon" , 21.0 , ingBacon));
//        cardapio.add(new Pizza(cardapio.size(), "Frango c/ Catupiry" , 21.0 , ingfrangocatupiry));
//        cardapio.add(new Pizza(cardapio.size(), "Batata" , 21.0 , ingbatata));
//        cardapio.add(new Pizza(cardapio.size(), "Baiana" , 21.0 , ingbaiana));
//        cardapio.add(new Pizza( cardapio.size(), "Quatro queijos" , 20.0, ing4queijos ));
//        cardapio.add(new Pizza(cardapio.size(), "Portuguesa" , 21.0 , ingPortuguesa));
//        cardapio.add(new Pizza(cardapio.size(), "Palmito c/ Catupiry" , 21.0 , ingPalmitoCatup));
//        cardapio.add(new Pizza(cardapio.size(), "Champignon" , 21.0 , ingChampignon));
//        cardapio.add(new Pizza(cardapio.size(), "Lombo" , 21.0 , inglombo));
//        cardapio.add(new Pizza(cardapio.size(), "Chilena" , 21.0 , ingChilena));
//        cardapio.add(new Pizza(cardapio.size(), "Atum" , 21.0 , ingAtum));
//        cardapio.add(new Pizza(cardapio.size(), "HotDog" , 21.0 , ingHotdog));
//        cardapio.add(new Pizza(cardapio.size(), "Tomate Seco" , 21.0 , ingtomateseco));
//        cardapio.add(new Pizza( cardapio.size(), "Strogonoff De Frango" , 20.0, ingStrogonoff ));
//        cardapio.add(new Pizza(cardapio.size(), "Romeu e Julieta" , 21.0 , ingRomeuejulieta));
//        cardapio.add(new Pizza(cardapio.size(), "Prestígio" , 21.0 , ingPrestigio));
//        cardapio.add(new Pizza(cardapio.size(), "Confete" , 21.0 , ingConfete));
//        cardapio.add(new Pizza(cardapio.size(), "Banana" , 21.0 , ingBanana));
//        
//        tamanhos.add(new Tamanho(tamanhos.size(), "Pequena", 1 ));
//        tamanhos.add(new Tamanho(tamanhos.size(), "Média", 1.4 ));
//        tamanhos.add(new Tamanho(tamanhos.size(), "Grande", 1.8 ));
//        
//        aditivos.add(new Adicional(aditivos.size(), "Azeitona", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Bacon", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Banana", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Batata Palha", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Calabresa", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Canela", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Catupiri", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Cebola", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Champignon", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Chocolate ao Leite", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Confete", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Ervilha", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Frango", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Goiabada", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Granulado", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Leite Condensado", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Lombo", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Manjericão", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Milho Verde", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Mussarela", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Oregano", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Ovo", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Palmito", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Parmesao", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Pimenta Calabresa", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Presunto", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Purê de Batata", 2.0));
//        aditivos.add(new Adicional(aditivos.size(), "Tomate", 2.0));
//        
//      Salvando Ingredientes das Pizzas
//        Serialization.write(ing4queijos, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingBacon, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingPortuguesa, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingPalmitoCatup, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingRomeuejulieta, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingPrestigio, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingConfete, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingBanana, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingStrogonoff, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingtomateseco, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingHotdog, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingAtum, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingCalabresa, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingMilho, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingMarguerita, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingAmericana, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingChilena, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingChampignon, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingfrangocatupiry, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingbatata, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingbaiana, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(inglombo, "d:\\pizzaria_ingredientes.dat");
//        Serialization.write(ingMussarela, "d:\\pizzaria_ingredientes.dat");
               
//      Declaração da Leitura
//        ArrayList<Ingrediente> ings4queijos = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsBacon = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsPortuguesa = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsPalmitoCatup = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsRomeuejulieta = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsPrestigio = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsConfete = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        ArrayList<Ingrediente> ingsBanana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsingStrogonoff = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingstomateseco = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsHotdog = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsAtum = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsCalabresa = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsMilho = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsMarguerita = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsAmericana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsChilena = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsChampignon = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsbatata = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");        
//        ArrayList<Ingrediente> ingsbaiana = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat"); 
//        ArrayList<Ingrediente> ingsMussarela = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat"); 
//        ArrayList<Ingrediente> ingslombo = (ArrayList<Ingrediente>)Serialization.read("d:\\pizzaria_ingredientes.dat");
//        
       
        
   Scanner input = new Scanner(System.in);
               
        
        int navegacao = 0 ; 
        int quantSabores = 0;
        int escolherPizza = 0;
        int escolherAdicional = 0;
        ArrayList<Pizza> PizzasPedido = new ArrayList<>();
        ArrayList<Adicional> aditivosPedido = new ArrayList<>();
        
        int escolherTamanho = 0;
        
        
        
    
        
        do{
            System.out.println("=================  La Pizzeria  ==================");
            System.out.println("Deseja visualizar o cardápio?");
            System.out.println(" 1 - para SIM");
            System.out.println(" 0 - Caso deseje finalizar a aplicação");
            System.out.println("==================================================");
            navegacao = input.nextInt();
            
            
            
            if( navegacao == 1 ){
                
                do {
                    System.out.println("===============  Quantidade de sabores  ================");
                    System.out.println(" Quantos sabores deseja na sua pizza");
                    System.out.println(" 1 - Pizza de um sabor");
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

                            if(escolherTamanho >= 0 && escolherTamanho < tamanhos.size()){
                            // codigo continua aqui 

                                for(int q = 0 ; q < quantSabores; q++  ){
                                    do {
                                        System.out.println("===================  CARDÁPIO  ===================");
                                        for (int c = 0; c < cardapio.size(); c++) {
                                            Pizza pizza = cardapio.get(c);
                                            ArrayList<Ingrediente> ingredientes = pizza.getIngredientes();
                                            System.out.println( "Digite: "+pizza.getId()+" para escolher comprar a pizza " + pizza.getNome());
                                            for(int i = 0; i < ingredientes.size(); i++){
                                                Ingrediente ingrediente = ingredientes.get(i);
                                                System.out.print( ingrediente.getNome() + ", ");
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
                                        }
                                        
                                        escolherPizza = input.nextInt();


                                        if(escolherPizza >= 0 && escolherPizza < cardapio.size()){
                                            System.out.println("Sua escolha foi "+ cardapio.get(escolherPizza).getNome());
                                            System.out.println("");
                                            System.out.println(" Digite: 1 - Confirmar escolha");
                                            System.out.println(" Digite: 2 - Cancelar escolha");
                                            int addPizza = input.nextInt();
                                            if( addPizza == 1 ){
                                            
                                                PizzasPedido.add(cardapio.get(escolherPizza));
                                                escolherPizza = cardapio.size();
                                            }
                    

                                        } 


                                    } while( escolherPizza != cardapio.size() ) ;

                                }
                                
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
                                        
                                        System.out.println(  );
                                        System.out.println("Escolha uma opção de adcional ");
                                        escolherAdicional = input.nextInt();


                                        if(escolherAdicional >= 0 && escolherAdicional < aditivos.size()){
                                            System.out.println("Sua escolha foi "+ aditivos.get(escolherAdicional).getNome());
                                            System.out.println("");
                                            System.out.println(" Digite: 1 - Confirmar escolha");
                                            System.out.println(" Digite: 2 - Cancelar escolha");
                                            int addAdicional = input.nextInt();
                                            if( addAdicional == 1 ){
                                            
                                                aditivosPedido.add(aditivos.get(escolherAdicional));
                                                
                                            }
                    
                                        }
                                        
                                    
                                } while (escolherAdicional != aditivos.size());
                            
                            
                                
                            }

                        } while (escolherTamanho != tamanhos.size());
                        
                        
                    }
           
                } while(quantSabores != 0 );
            
                
            }
        
        } while( navegacao != 0);
        
        database.setListaPizza(cardapio);
        database.setTamanhos(tamanhos);
        database.setAditivos(aditivos);
        
        Serialization.write(database, ".\\pizzaria_database.dat");
       
        
    }
    


    
}
 



