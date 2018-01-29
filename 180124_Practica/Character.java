public abstract class Character{
    public WeaponBehavior weapon;
    
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }//end Character(WeaponBehavior w)
    
   public WeaponBehavior getWeapon(){
        return weapon;
    }//end WeaponBehavior getWeapon
    
    public void Fight(){
        
    }//end
}//end Character