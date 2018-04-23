
public class doWhiteL implements Command{

	Lights lites;
	
	public doWhiteL(Lights l) {
		this.lites = l;
	}
	
	@Override
	public void execute() {
		lites.whiteOn();
	}

	@Override
	public void undo() {
		lites.whiteOff();		
	}

}
