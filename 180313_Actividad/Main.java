 public class Main{
     public static void main(String args[]){
        PizzaFact liru = new LiruSisa();
        Pizza pizza = liru.order("Pepperoni");
        Pizza pizzaml = liru.order("MeatLovers");
         
        PizzaFact papasote = new PapaJohns();
        Pizza pizzas  = papasote.order("Supreme");
        Pizza pizzach = papasote.order("Cheese");
        
        System.out.println("//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//");  
        System.out.println("Liru Sisa Pizzas - Hot n' Caliente");
        System.out.println("Your order is: " + pizza.getName() + pizzaml.getName());
        System.out.println("//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//"); 
        System.out.println("Papa John's - Pizza? Papa John's");
        System.out.println("Your order papi is: " + pizzas.getName() + pizzach.getName());
        System.out.println("//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//"); 
         
        try {
            liru.order("Pepperoni");
            liru.order("MeatLovers");
            papasote.order("Supreme");
            papasote.order("Cheese");
        } catch(NullPointerException e) {
            System.out.println("Pizza is not on the menu :(, go to Burger King");
        }
    }
 }