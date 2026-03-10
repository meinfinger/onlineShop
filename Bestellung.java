package htl.swp1.klasse2.OPP.onlineShop;

import java.util.ArrayList;

public class Bestellung {
    private int bestellnummer;
    private Kunden kunde;
    private ArrayList<Produkte> warenkorb;

    public Bestellung(int bestellnummer, Kunden kunde){
        this.bestellnummer = bestellnummer;
        this.kunde = kunde;
        this.warenkorb = new ArrayList<>();
    }

    public void addProdukt(Produkte p){
        warenkorb.add(p);
    }

    public void printRezipt(){
        double gsumme = 0;
        for(Produkte p : warenkorb){
            gsumme += p.getBruttoPreis();
        }
        System.out.println("Gesamtpreis: " + gsumme);
    }

}
