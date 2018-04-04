
public class doOpenGD implements Command{

	GarageDoor garage;
	
	public doOpenGD(GarageDoor g) {
		this.garage = g;
	}
	
	@Override
	public void execute() {
		garage.openSideways();;
	}

	@Override
	public void undo() {
		garage.openVertical();
	}
	

}
