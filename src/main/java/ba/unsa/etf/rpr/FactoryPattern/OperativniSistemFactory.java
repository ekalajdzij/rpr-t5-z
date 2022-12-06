package ba.unsa.etf.rpr.FactoryPattern;

public class OperativniSistemFactory {

    public OperativniSistem getInstance(String tipObjekta) {
        if(tipObjekta.toLowerCase().equals("open source") || tipObjekta.toLowerCase().equals("open"))
            return new Android();
        else if (tipObjekta.toLowerCase().equals("closed source") || tipObjekta.toLowerCase().equals("closed"))
            return new IOS();
        return new Windows();
    }
}
