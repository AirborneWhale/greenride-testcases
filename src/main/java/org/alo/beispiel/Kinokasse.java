package org.alo.beispiel;

/**
 * Die Kasse eines kleinen Kinos.
 */
public class Kinokasse {

    /**
     * Berechnet den Eintritt nach dem Alter.
     * Kinder bis 13 Jahre zahlen 6 Euro, Jugendliche von 14 bis 17 Jahren
     * zahlen 8 Euro, Erwachsene ab 18 Jahren zahlen 11 Euro.
     *
     * @param alter das Alter in Jahren
     * @return der Eintritt in ganzen Euro
     * @throws IllegalArgumentException wenn alter negativ ist
     */
    public int berechneEintritt(int alter) {
        if (alter < 0) {                                           // (1)
            throw new IllegalArgumentException(                    // (2)
                    "Alter darf nicht negativ sein: " + alter);
        }
        if (alter <= 13) {
            return 6;
        }
        if (alter <= 17) {
            return 8;
        }
        return 11;
    }
}
