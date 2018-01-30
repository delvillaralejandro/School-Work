public class People{
  public static void main(String args[]){
    Cocinero chef = new Cocinero();
    Estudiante student = new Estudiante();
    
    Cocinero chefno = new Cocinero(new HabilidadMotrizNULL());
    Estudiante estudihambre = new Estudiante(new HabilidadMotrizNULL());
    
    System.out.println("Estas personas puede moverse bien!");
    student.Movimiento();
    chef.Movimiento();
    
    System.out.println("\nEstas personas no tienen POWER!");
    chefno.Movimiento();
    estudihambre.Movimiento();
  }//end main
}
