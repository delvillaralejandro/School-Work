
public class doGarageLights implements Command{

	GarageDoor garage;
	
	public doGarageLights(GarageDoor g) {
		this.garage = g;
	}
	
	@Override
	public void execute() {
		garage.turnLights();
	}

	@Override
	public void undo() {
		garage.turnOffLights();
	}
	

}
