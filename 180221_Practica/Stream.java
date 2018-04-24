import java.io.*;

public class Stream{
    public static void main(String args[]){
        
        try{

			InputStream inner = new LowerInputStream(new FileInputStream("Hello.txt"));
			int a;

			while((a = inner.read()) >= 0){
				System.out.print((char) a);
			}	

			System.out.println();

		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}