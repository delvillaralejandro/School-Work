public class Demo{
    public static void main(String args[]){
        Knight knight = new Knight(new Knife());
        knight.Fight();
        
        King king = new King();
        king.Fight();
        
        Queen queen = new Queen();
        queen.Fight();
        
        Troll troll = new Troll(new Axe());
        troll.Fight();
    }//end main
}//end Demo