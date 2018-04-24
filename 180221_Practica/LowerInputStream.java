import java.io.*;

public class LowerInputStream extends FilterInputStream{
    protected LowerInputStream(InputStream inside){
        super(inside);
    }
    
    public int read() throws IOException{
        int x = inside.read();
        
        if(x == -1){return x;}
        
        else{return Character.toLowerCase(x);}
    }
    
}