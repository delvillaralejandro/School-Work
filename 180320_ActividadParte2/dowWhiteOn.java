
public class dowWhiteOn implements Command{

	Lights lites;
	
	public dowWhiteOn(Lights l) {
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
