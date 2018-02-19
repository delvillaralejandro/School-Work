import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Shipper extends Observable{
	String Name;
	String Rec;
	int timeUpdate;
	List<Parcel> parcels = new ArrayList<Parcel>();
	List<Parcel> changed = new ArrayList<Parcel>();
	
	public Shipper(String name, int tupdate) {
		this.Name = name;
		//this.Rec = reciever;
		this.timeUpdate = tupdate;
	}
	
	public Parcel newParcel(String sts) {
		Parcel parcel = new Parcel(sts, this.Name, this.Rec);
		parcels.add(parcel);
		return parcel;
	}
	
	public void updateParcel(Parcel parcel, String sts) {
		Parcel found = null;
		for(Parcel i : parcels) {
			if(parcel == i) {
				found = parcel;
				parcel.setStatus(sts);
			}//end if
		}// end for
		
		if(found == null) {
			System.out.println("Parcel does not exist...");
		}//end if
		else {
			setChanged();
			changed.add(found);
		}//end else
		

		public String getName() {
			return this.Name;
		}
		
	}//end updateParcel
}
