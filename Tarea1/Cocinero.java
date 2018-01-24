public class Cocinero extends Persona{
  String especialidad;
  String puesto;
  
  public void Habilidad_Motriz_Pies(){
      System.out.println("Puedo usar mis pies!");

      public void Caminar(){
       System.out.println("Puedo Caminar como Cocinero!");
      }//end Caminar()
      public void Brincar(){
        System.out.pritnln("Puedo brincar como Cocinero!");
      }//end Brincar()
  }//end Habilidad_Motriz_Pies
    
  public void Habilidad_Motriz_Manos(){
    System.out.println("Puedo usar mis manos!");
  }//end Habilidad_Motriz_Manos
      
  public void Habilidad_Motriz_NULL(){
    System.out.println("No soy vegetal!");
  }//end Habilidad_Motriz_NULL
}//end Cocinero class

public static void main(String args[]){
  Cocinero chef  = new Cocinero();
  
  chef.Habilidad_Motriz_Pies();
  chef.Habilidad_Motriz_Manos();
  chef.Habilidad_Motriz_NULL();
}//end main
