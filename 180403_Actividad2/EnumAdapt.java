import java.util.*;

public class EnumAdapt implements Iterator {

    Enumeration enumer;

    public EnumAdapt(Enumeration e){
        enumer = e;
    }

    public Object next(){
    	return enumer.nextElement();
    }

    public boolean hasNext(){
        return enumer.hasMoreElements();
    }

    public void remove(){
    	System.out.println("Cannot remove!");
    }

}