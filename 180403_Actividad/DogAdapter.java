
public class DogAdapter implements Dog{
	
	Cat mycat;
	
	public DogAdapter(Cat c) {
		this.mycat = c;
	}
	
	@Override
	public void bark() {
		mycat.purr();
		
	}

	@Override
	public void bite() {
		mycat.slash();
		
	}

}
