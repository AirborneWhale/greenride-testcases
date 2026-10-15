package org.alo.greenride;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TarifTest {

    @Test
    public void testTarif1d() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(1);
        assertEquals(10, Preis);
    }

    @Test
    public void testTarif2d() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(2);
        assertEquals(20, Preis);
    }

    @Test
    public void testTarif3d() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(3);
        assertEquals(27, Preis);
    }

    @Test
    public void testTarif5d() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(5);
        assertEquals(45, Preis);
    }

    @Test
    public void testTarif7d() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneMietpreis(7);
        assertEquals(63, Preis);
    }

    @Test
    public void testTarif0d() {
        Tarif tarif = new Tarif();
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(0));
    }

    @Test
    public void testTarifmin5d() {
        Tarif tarif = new Tarif();
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(-5));
    }

    @Test
    public void testTarif8d() {
        Tarif tarif = new Tarif();
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(8));
    }

    @Test
    public void testTarif100d() {
        Tarif tarif = new Tarif();
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(100));
    }
}
