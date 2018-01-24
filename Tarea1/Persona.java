class Persona implements Habilidad_Motriz{
  String nombre;
  int edad;
  boolean genero;
  public Habilidad_Motriz Poder;
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }//end setNombre
  
  public void getNombre(){
    return this.nombre;
  }//end 
  
  public void getEdad(int edad){
    this.edad = edad;
  }//end setEdad
  
  public void setEdad(){
    return this.edad;
  }//end setEdad
  
  public void setGenero(boolean genero){
    this.genero = genero;
  }//end setGenero
  
  public void getGenero(){
    return this.genro;
  }
  
  public String Hablar(){
    System.out.println("Estoy hablando!");
  }//End Hablar()
  
  public void Respirar(){
    return 0;
  }//end Respirar()
}//End Persona
