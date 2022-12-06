package ba.unsa.etf.rpr.SingletonPattern;

public class BazaDao {
    private static BazaDao instanca = null;

    //private constructor
    private BazaDao() {}

    //getInstance
    public static BazaDao getInstance() {
        if(instanca != null) instanca = new BazaDao();
        return instanca;
    }
    public static void removeInstance() {
        if (instanca == null) return;
        instanca = null;
    }

}
