package htl.swp1.klasse2.OPP.onlineShop;

public class KundeMain {
    public static void main(String[] args) {

        Anschrift a1 = new Anschrift("6020", "Innsbruck", "Schlotthofweg", "18");



        Kunde k1 = new Kunde("Mario ", "Einfinger", a1);
//        Kunde k2 = new Kunde("Johann ", "Sailer", "Mag. Mag. Doktor. Doktor. Doktor. Doktor. (alle Titel im Goonstudium) ");
//        Kunde k2 = new Kunde("Johannes ", "Trainer", "Fraunenstraße (neben im ) ");
        k1.kundenProfilAnzeigen();


        Kunde k2 = new Kunde("Simon ","Schober ");

        k2.setAnschrift(a1);
        k2.kundenProfilAnzeigen();


        
    }
}
