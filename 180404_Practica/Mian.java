import java.util.concurrent.TimeUnit;

public class Mian{
    public static void main(String args[]){
        Facade facade = new Facade();
        
		facade.playMovie();
		System.out.println("Movie is in progress or something............");
		TimeUnit.SECONDS.sleep(60);
		
		facade.stopMovie();
		System.out.println("Movie has finished or stopped unexpectedly....................");
		
		
    }
}