public abstract class Pizza{
    String name;
    
    public abstract void prep();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    
    public String getName(){
        return this.name;
    }
    
}