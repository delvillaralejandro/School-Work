
public class Parcel {
	String Status;
	String Shipper;
	String Reciever;
	

	public Parcel(String sts, String ship, String rec) {
		this.Status = sts;
		this.Shipper = ship;
		this.Reciever = rec;
		
	}
	
	public void setStatus(String sts) {
		this.Status = sts;
		
	}
	
	public String getStatus(){
		return Status;
	}

	public String getShipper(){
		return Shipper;
	}

	public String getReciever(){
		return Reciever;
	}
}
