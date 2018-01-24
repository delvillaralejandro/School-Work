public static void main(String args[]){
  Cocinero chef = new Cocinero();
  Estudiante student = new Estudiante();
  
  Cocinero chefno = new Cocinero();
  chefno.Habilidad_Motriz_Poder = new Habilidad_Motriz_NULL();
  Estudiante estudihambre = new Estudiante();
  estudihambre.Habilidad_Motriz_Poder = new Habilidad_Motriz_NULL();
  
  System.out.println("Estas personas puede moverse bien!");
  student.Move();
  chef.Mover();
  
  System.out.println("Estas personas no tienen POWER!");
  chefno.Move();
  estudihambre.Move();
}//end main
