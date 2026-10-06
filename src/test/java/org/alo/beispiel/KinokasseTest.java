package org.alo.beispiel;

import org.junit.jupiter.api.Test;                                    // (1)

import static org.junit.jupiter.api.Assertions.assertEquals;          // (2)
import static org.junit.jupiter.api.Assertions.assertThrows;

class KinokasseTest {

    @Test                                                             // (3)
    void kindMit13ZahltSechsEuro() {                                  // (4)
        // Arrange - Vorbereiten
        Kinokasse kasse = new Kinokasse();
        // Act - Ausfuehren
        int eintritt = kasse.berechneEintritt(13);
        // Assert - Pruefen
        assertEquals(6, eintritt);                                    // (5)
    }

    @Test
    void jugendlicherMit14ZahltAchtEuro() {
        Kinokasse kasse = new Kinokasse();
        int eintritt = kasse.berechneEintritt(14);
        assertEquals(8, eintritt);
    }

    @Test
    void erwachsenerMit18ZahltElfEuro() {
        Kinokasse kasse = new Kinokasse();
        int eintritt = kasse.berechneEintritt(18);
        assertEquals(11, eintritt);
    }

    @Test
    void negativesAlterWirdAbgelehnt() {
        Kinokasse kasse = new Kinokasse();
        assertThrows(IllegalArgumentException.class,                  // (6)
                () -> kasse.berechneEintritt(-1));                    // (7)
    }
}
