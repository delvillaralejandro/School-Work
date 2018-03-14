public class PapaJohns extends PizzaFact{
    public PapaJohns(){
        super.name = "Papa John's";
    }
    
    @Override
    public Pizza create(String name) throws NullPointerException{
        switch(name){
            case "Supreme":
                return new Supremep();
            case "Cheese":
                return new Cheesep();
            default:
                throw new NullPointerException();
        }
    }
    
}