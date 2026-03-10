package htl.swp1.klasse2.OPP.onlineShop;

public class Produkte {

    private String produktName;
    private double preis;
    private double mehrwertsteuer;

    public Produkte(String produktName,double preis, double mehrwertsteuer){
        this.mehrwertsteuer = mehrwertsteuer;
        this.preis = preis;
        this.produktName = produktName;
    }


    public double getBruttoPreis() {
        return preis * mehrwertsteuer;
    }

    public double getNettoPreis() {
        return preis;
    }

    public String getProduktName() {
        return produktName;
    }
}
