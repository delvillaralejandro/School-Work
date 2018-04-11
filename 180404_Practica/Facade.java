public class Facade{
    Screen screen;
    Lights lites;
    DVD dvd;
    Amp amplifier;
    
    public Facade(){
        screen = new Screen();
        lites = new Lights();
        dvd = new DVD();
        amplifier = new Amp();
    }
    
    public void playMovie(){
        lites.onLight();
        amplifier.dvd = dvd;
        amplifier.onAmp();
        dvd.onDVD();
        dvd.ejectDVD();
        dvd.insertDVD();
        dvd.readDVD();
        dvd.playDVD();
        screen.onScreen();
        lites.dimLight();
    }
    
    public void stopMovie(){
        lites.onLight();
        amplifier.offAmp();
        dvd.ejectDVD();
        screen.offScreen();
        
    }
}