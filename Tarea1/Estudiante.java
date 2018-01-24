public class Estudiante extends Persona{
  String carrera;
  int matricula;
  
    public void Habilidad_Motriz_Pies(){
      System.out.println("Puedo usar mis pies!");

      public void Caminar(){
       System.out.println("Puedo Caminar como Estudiante!"); 
      }//end Caminar

      public void Brincar(){
        System.out.pritnln("Puedo brincar como Estudiante");
      }//end Brincar
  
    }//end Habilidad_Motriz_Pies
    
    public void Habilidad_Motriz_Manos(){
      System.out.println("Puedo usar mis manos!");
    }//end Habilidad_Motriz_Manos
      
    public void Habilidad_Motriz_NULL(){
      System.out.println("No soy vegetal!");
    }//end Habilidad_Motriz_NULL
}

  
  public static void main(String args[]){
    Estudiante student = new Estudiante();
    
    student.Habilidad_Pies();
    student.Habilidad_Manos();
    student.Habilidad_NULL();
    
  }
