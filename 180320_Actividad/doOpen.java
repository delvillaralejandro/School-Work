
public class doOpen implements Command{
	GarageDoor gd = new GarageDoor();
	
	@Override
	public void execute() {
		gd.Open();
		
	}

	@Override
	public void undo() {
		gd.Close();
	}

}
