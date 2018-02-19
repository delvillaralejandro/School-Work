import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Provider implements Observer, Display{
	List<Parcel> parcels = new ArrayList<Parcel>();
	
	public Provider(Shipper ship) {
		this.subscribe(ship);
	}
	
	public void subscribe(Shipper ship){
		ship.addObserver(this);
		System.out.printf("Provider subscribed to %s... \n", ship.getName());
	}

	public void addParcel(Parcel parcel){
		parcels.add(parcel);
		System.out.println("Parcel added...");
		this.display(parcel);
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof List){
			ArrayList<Parcel> ps = (ArrayList<Parcel>) arg;
			for(Parcel parcel : ps){
				if(parcels.contains(arg)){
					this.display(parcel);
				}
			}
		}
		
	}
	
	@Override
	public void display(Parcel parcel) {
		System.out.println("Parcel Report:");
		System.out.println("Reciever: "+ parcel.getReciever());
		System.out.println("Status: "+ parcel.getStatus());
		System.out.println("Shipper: "+parcel.getShipper());
		System.out.println();
		
	}
}
