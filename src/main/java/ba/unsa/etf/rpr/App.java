package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.BuilderPattern.Phone;
import ba.unsa.etf.rpr.BuilderPattern.PhoneBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Phone mobitel = (new PhoneBuilder("Android")).setBaterija(5000).setMegapiksel(48).setProcesor("Snapdragon 865 5nm").setDisplaySize(33.3).build();
        System.out.println(mobitel);
    }
}
