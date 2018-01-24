class Persona implements Habilidad_Motriz{
  String nombre;
  int edad;
  boolean genero;
  
  /*int Caminar(){
    int posicion;
    
    posicion += 1;  
    return posicion;
  }*/
  
  String Hablar(){
    System.out.println("Estoy hablando!");
  }//End Hablar()
  
  void Respirar(){
    return 0;
  }//end Respirar()
  
  public void Habilidad_Motriz_Pies(){
    System.out.println("Puedo usar mis pies!");
    
    public void Caminar(){
      System.out.println("Puedo Caminar!"); 
    }//end Caminar()
    public void Brincar(){
      System.out.pritnln("Puedo brincar");
    }//end Brincar()
  }//End Habiliad_Motriz_Pies
  
  public void Habilidad_Motriz_Manos(){
     System.out.println("Puedo suar mis manos!");
  }//end Habilidad_Motriz_Manos()
  
  public void Habilidad_Motriz_NULL(){
      System.out.println("No soy Vegetal!");
  }//end Habilidad_Motriz_NULL
}//End Persona
