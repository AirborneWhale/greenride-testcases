package org.alo.beispiel;

public class KinoApp {

    public static void main(String[] args) {
        Kinokasse kasse = new Kinokasse();

        System.out.println("Alter 12: " + kasse.berechneEintritt(12) + " Euro");
        System.out.println("Alter 18: " + kasse.berechneEintritt(18) + " Euro");
        System.out.println("Alter -3: " + kasse.berechneEintritt(-3) + " Euro");   // (3)
        System.out.println("Kasse schliesst.");                                    // (4)
    }
}
