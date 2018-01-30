public class Cocinero extends Persona{
  String especialidad;
  String puesto;
  
  public Cocinero(){
    Mover(new HabilidadMotrizPoderoso());
  }//end Cocinero
  
  
  public Cocinero(HabilidadMotriz h){
    Mover(h);
  }//end Cocinero(HabilidadMotriz h)
  
  public void Movimiento(){
    System.out.println("Soy Cocinero!");
    hm.Mover();
  }
  
}//end Cocinero class

