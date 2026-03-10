package htl.swp1.klasse2.OPP.onlineShop;

public class Anschrift {
    private String PLZ;
    private String ort;
    private String strasse;
    private String hausnummer;

    public Anschrift(){}

    public Anschrift(String PLZ, String ort, String strasse, String hausnummer) {
        this.PLZ = PLZ + " ";
        this.ort = ort + " ";
        this.strasse = strasse + " ";
        this.hausnummer = hausnummer + " ";
    }

    public String getAdresse(){
        return PLZ + ort + strasse + hausnummer;
    }

    public void setAdresse(String PLZ, String ort, String strasse, String hausnummer) {
        this.PLZ = PLZ + " ";
        this.ort = ort + " ";
        this.strasse = strasse + " ";
        this.hausnummer = hausnummer + " ";
    }

}
