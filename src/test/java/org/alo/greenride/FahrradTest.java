package org.alo.greenride;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FahrradTest {

    @Test
    void NichtVorhandenesFahrradLiefertLeeresOptional() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-001", "City 3", 12.00)
        );

        // Act
        Optional<Fahrrad> ergebnis =
                station.findeFahrrad("GR-000");

        // Assert
        assertTrue(ergebnis.isEmpty());
    }

    @Test
    void VorhandenesFahrradWirdGefunden() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-001", "City 3", 12.00)
        );

        // Act
        Optional<Fahrrad> ergebnis =
                station.findeFahrrad("GR-001");

        // Assert
        assertTrue(ergebnis.isPresent());
        assertEquals("GR-001", ergebnis.get().getKennung());
    }


    @Test
    void KleinschreibungWirdNichtGefunden() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        station.fahrradAufnehmen(
                new Fahrrad("GR-015", "City 3", 12.00)
        );

        // Act
        Optional<Fahrrad> ergebnis =
                station.findeFahrrad("gr-015");

        // Assert
        assertTrue(ergebnis.isEmpty());
    }

    @Test
    void KennungMitLeerstelleWirdNichtGefunden() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );
        station.fahrradAufnehmen(
                new Fahrrad("GR-124", "City 3", 12.00)
        );
        // Act
        Optional<Fahrrad> ergebnis =
                station.findeFahrrad(" GR-124");
        //                  ^
        //          eine Leerstelle vor GR-124
        // Assert
        assertTrue(ergebnis.isEmpty());
    }

    @Test
    void UngueltigeKennungWirdNichtGefunden() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        // Act
        Optional<Fahrrad> ergebnis =
                station.findeFahrrad("GR-hcfz");

        // Assert
        assertTrue(ergebnis.isEmpty());
    }

    @Test
    void LeereKennungWirdAbgelehnt() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        // Act und Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> station.findeFahrrad("")
        );
    }

    @Test
    void NullAlsKennungWirdAbgelehnt() {
        // Arrange
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );

        // Act und Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> station.findeFahrrad(null)
        );
    }
}