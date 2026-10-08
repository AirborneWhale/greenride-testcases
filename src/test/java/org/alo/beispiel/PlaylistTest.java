package org.alo.beispiel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlaylistTest {

    @Test
    void vorhandenerSongWirdGefundenFehler() {
        // Arrange - Vorbereiten
        Playlist playlist = new Playlist();
        playlist.songHinzufuegen(
                new Song("Intr", "The xx", 128)
        );

        boolean vorhanden = playlist.findeSong("Intro").isPresent();

        assertTrue(vorhanden);
    }

    @Test
    void vorhandenerSongWirdGefunden() {
        // Arrange - Vorbereiten
        Playlist playlist = new Playlist();
        playlist.songHinzufuegen(
                new Song("Intro", "The xx", 128)
        );

        boolean vorhanden = playlist.findeSong("Intro").isPresent();

        assertTrue(vorhanden);
    }

    @Test
    void nichtVorhandenerSongWirdNichtGefunden() {
        Playlist playlist = new Playlist();
        playlist.songHinzufuegen(
                new Song("Intro", "The xx", 128)
        );

        boolean vorhanden = playlist.findeSong("Gibt es nicht").isPresent();

        assertFalse(vorhanden);
    }
}