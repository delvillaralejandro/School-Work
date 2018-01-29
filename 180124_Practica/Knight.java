public class Knight extends Character{
    public Knight(){
		setWeapon(new Axe());
	}//end Knight

	public Knight(WeaponBehavior w){
		setWeapon(w);
	}//end WeaponBehavior(WeaponBehavior w)

	@Override
	public void Fight(){
		System.out.println("You are a noble Knight!");
		weapon.useWeapon();
	}//end Fight
	
}//end Knight class