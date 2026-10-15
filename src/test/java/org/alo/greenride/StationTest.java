package org.alo.greenride;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    private Station erzeugeStation() {
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-001", "City 3", 12.00)
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-002", "City 3", 12.00)
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-014", "Lastenrad", 24.00)
        );

        return station;
    }

    @Test
    void VorhandenesFahrradWirdGefunden() {
        Station station = erzeugeStation();

        Optional<Fahrrad> treffer =
                station.findeFahrrad("GR-014");

        assertTrue(treffer.isPresent());
        assertEquals("GR-014", treffer.get().getKennung());
    }

    @Test
    void NichtVorhandenesFahrradLiefertLeeresOptional() {
        Station station = erzeugeStation();

        Optional<Fahrrad> treffer =
                station.findeFahrrad("GR-041");

        assertTrue(treffer.isEmpty());
    }

    @Test
    void KleinschreibungWirdNichtGefunden() {
        Station station = erzeugeStation();

        Optional<Fahrrad> treffer =
                station.findeFahrrad("gr-014");

        assertTrue(treffer.isEmpty());
    }

    @Test
    void LeerstelleWirdNichtGefunden() {
        Station station = erzeugeStation();

        Optional<Fahrrad> treffer =
                station.findeFahrrad(" GR-014");

        assertTrue(treffer.isEmpty());
    }

    @Test
    void LeereKennungWirdAbgelehnt() {
        Station station = erzeugeStation();

        assertThrows(
                IllegalArgumentException.class,
                () -> station.findeFahrrad("")
        );
    }

    @Test
    void NullAlsKennungWirdAbgelehnt() {
        Station station = erzeugeStation();

        assertThrows(
                IllegalArgumentException.class,
                () -> station.findeFahrrad(null)
        );
    }
}