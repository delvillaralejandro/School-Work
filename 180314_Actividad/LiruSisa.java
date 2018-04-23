public class LiruSisa extends PizzaFact{
    public LiruSisa(){
        super.name = "Liru Sisa";
    }
    
    @Override
    public Pizza create(String name) throws NullPointerException{
        switch(name){
            case "Pepperoni":
                return new Pepperonil();
            case "MeatLovers":
                return new MeatLoversl();
            default:
                throw new NullPointerException();
        }
    }
    
}