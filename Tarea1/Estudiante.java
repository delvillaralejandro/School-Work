public class Estudiante extends Persona{
  String carrera;
  int matricula;
  public Estudiante(){
    Mover(new HabilidadMotrizPoderoso());
  }//end Estudiante
  
  public Estudiante(HabilidadMotriz h){
    Mover(h);
  }//end Estudiante(Habilidad Motiz h)
  
  @Override
  public void Movimiento(){
    System.out.println("Soy un Estudiante!");
    hm.Mover();
  }//end Movimiento
  
}//end Estudiante class
