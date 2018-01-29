public class Troll extends Character{
   public Troll(){
        setWeapon(new Sword());
    }//end Troll

    public Troll(WeaponBehavior w){
        setWeapon(w);
    }//end Troll(WeaponBehavior w)
    
    @Override
    public void Fight(){
        System.out.println("You are the savage Troll!");
        weapon.useWeapon();
    }//end Fight
}//end Troll class