
public class doOpen implements Command{
	GarageDoor gd;
	
	public doOpen(GarageDoor g) {
		this.gd = g;
	}
	
	@Override
	public void execute() {
		gd.Open();
		
	}

	@Override
	public void undo() {
		gd.Close();
	}

}
