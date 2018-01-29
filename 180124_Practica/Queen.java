public class Queen extends Character{
   public Queen(){
        setWeapon(new Bow());
    }//end King

    public Queen(WeaponBehavior w){
        setWeapon(w);
    }//end Queen(WeaponBehavior w)
    
    @Override
    public void Fight(){
        System.out.println("You are the elegant Queen!");
        weapon.useWeapon();
    }//end Fight
}//end Queen class