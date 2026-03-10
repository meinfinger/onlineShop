package htl.swp1.klasse2.OPP.onlineShop;

public class Kunde {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;

    public Kunde(){}

    public Kunde(String vorname,String nachname, Anschrift anschrift){
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }
    public Kunde(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void kundenProfilAnzeigen(){
        System.out.printf("%s%s\n%s\n",vorname, nachname, anschrift.getAdresse());
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }
}
