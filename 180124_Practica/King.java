public class King extends Character{
    public King(){
        setWeapon(new Sword());
    }//end King

    public King(WeaponBehavior w){
        setWeapon(w);
    }//end King(WeaponBehavior w)
    
    @Override
    public void Fight(){
        System.out.println("You are the mighty King!");
        weapon.useWeapon();
    }//end Fight
}//end King class