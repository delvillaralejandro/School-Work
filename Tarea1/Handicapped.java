public class Handicapped extends Persona{
  public void Habilidad_Pies(){
    System.out.println("No Puedo usar mis pies!");

    public void Caminar(){
     System.out.println("No Puedo Caminar!"); 
    }//end Caminar

    public void Brincar(){
      System.out.pritnln("No Puedo brincar");
    }//end Brincar
  
  }//end Habilidad_Motriz_Pies
    
  public void Habilidad_Motriz_Manos(){
    System.out.println("Puedo suar mis manos!");
  }//Habilidad_Motriz_Manos
      
  public void Habilidad_Motriz_NULL(){
    System.out.println("No soy vegetal!");
  }//end Habilidad_Motriz_NULL
}//end Handicapped

public static void main(String args[]){
    Handicapped handi = new Handicapped();
    
    handi.Habilidad_Motriz_Pies();
    handi.Habilidad_Motriz_Manos();
    handi.Habilidad_Motriz_NULL();
}//end main
