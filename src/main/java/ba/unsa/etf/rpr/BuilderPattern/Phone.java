package ba.unsa.etf.rpr.BuilderPattern;

public class Phone {
    private String operativniSistem;
    private String procesor;
    private Double displaySize;
    private Integer baterija;
    private Integer megapiksel;

    //Konstruktor
    public Phone(String os, String pr, Double dis, Integer b, Integer MP) {
        this.operativniSistem = os;
        this.procesor = pr;
        this.displaySize = dis;
        this.baterija = b;
        this.megapiksel = MP;
    }

    //toString
    @Override
    public String toString() {
        return "Phone has next specifications: " + '\n' +
                "Operating system: " + operativniSistem + '\n' +
                "Processor: " + procesor + '\n' +
                "Display size: " + displaySize + '\n' +
                "Battery life: " + baterija + '\n' +
                "Camera megapixel: " + megapiksel;
    }

    public String getOperativniSistem() {
        return operativniSistem;
    }
    public String getProcesor() {return procesor;}
    public Double getDisplaySize() {return displaySize;}
    public Integer getBaterija() {return baterija;}
    public Integer getMegapiksel() {return megapiksel;}

    public void setOperativniSistem(String os) {
        this.operativniSistem = os;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    public void setMegapiksel(Integer megapiksel) {
        this.megapiksel = megapiksel;
    }

    public void setBaterija(Integer baterija) {
        this.baterija = baterija;
    }
}
