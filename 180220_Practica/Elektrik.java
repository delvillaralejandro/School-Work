
public class Elektrik {
	public static void main(String args[]) {
		Beverage cofee = new Coffee(Size.S);
		cofee = new Cream(cofee);
		cofee = new Sugar(cofee);
		cofee = new Cinamon(cofee);
		
		Beverage tea = new Tea(Size.M);
		tea = new Sugar(tea);
		
		Beverage water = new Water(Size.L);
		water = new Sugar(water);
		water = new Cream(water);
		
		System.out.println("Electrik Cafe & Lounge");
		System.out.println("//=//=//=//=//=//=//=//=//");
		
		System.out.println("Extras: " + cofee.getDescription());
		System.out.println("Price: " + cofee.Cost());
		
		System.out.println("Extras: " + tea.getDescription());
		System.out.println("Price: " + tea.Cost());
		
		System.out.println("Extras: " + water.getDescription());
		System.out.println("Price: " + water.Cost());
		
		
		
	}

}
