public abstract class Persona{
  public HabilidadMotriz hm;
  
  String nombre;
  int edad;
  boolean genero;
  
  public void Mover(HabilidadMotriz h){
    this.hm = h;
  }//Mover
  
  public HabilidadMotriz getMovimiento(){
    return hm;
  }//end getMovimiento()
  
  public void Movimiento(){
    
  }//end mover
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }//end setNombre
  
  public void getNombre(){
    System.out.println(this.nombre);
  }//end 
  
  public void getEdad(int edad){
    this.edad = edad;
  }//end setEdad
  
  public int setEdad(){
    return this.edad;
  }//end setEdad
  
  public void setGenero(boolean genero){
    this.genero = genero;
  }//end setGenero
  
  public void getGenero(){
    System.out.println(this.genero);
  }//end getGenero
  
  /*public String Hablar(){
    System.out.println("Estoy hablando!");
  }//End Hablar()*/
  
  /*public String Respirar(){
    System.out.println("Estoy respirando!");
  }//end Respirar()*/
}//End Persona
