package htl.swp1.klasse2.OPP.onlineShop;

public class KundeMain {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("Mario ", "Einfinger", "Mag. Mag. Doktor. Doktor. Doktor. Doktor. ");
        Kunde k2 = new Kunde("Johann ", "Sailer", "Mag. Mag. Doktor. Doktor. Doktor. Doktor. (alle Titel im Goonstudium) ");
        Kunde k2 = new Kunde("Johannes ", "Trainer", "Fraunenstraße (neben im ) ");
        k2.kundenProfilAnzeigen();
    }
}
