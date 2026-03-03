package htl.swp1.klasse2.OPP.onlineShop;

public class Kunde {
    private String vorname;
    private String nachname;
    private String anschrift;

    public Kunde(){}

    public Kunde(String vorname,String nachname, String anschrift){
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }

    public void kundenProfilAnzeigen(){
        System.out.println(anschrift + vorname + nachname);
    }

}
