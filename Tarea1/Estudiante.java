public class Estudiante extends Persona{
  String carrera;
  int matricula;
  
    public void Habilidad_Pies(){
      System.out.println("Puedo usar mis pies!");

      public void Caminar(){
       System.out.println("Puedo Caminar como Estudiante!"); 
      }

      public void Brincar(){
        System.out.pritnln("Puedo brincar como Estudiante");
  
    }
    
    public void Habilidad_Manos(){
      System.out.println("Puedo usar mis manos!");
    }
      
    public void Habilidad_NULL(){
      System.out.println("No soy vegetal!");
    }
}

  
  public static void main(String args[]){
    Estudiante student = new Estudiante();
    
    student.Habilidad_Pies();
    student.Habilidad_Manos();
    student.Habilidad_NULL();
    
  }
