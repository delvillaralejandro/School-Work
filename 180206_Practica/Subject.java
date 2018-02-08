
public interface Subject {
	public void addDisplay(DisplayObs disp);
	public void rmDisplay(DisplayObs disp);
	public void notDisplay();
	public void measurementChanged();
}//end subject
