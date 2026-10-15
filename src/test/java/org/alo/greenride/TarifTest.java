package org.alo.greenride;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testOp1notOp2() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneStartgebuehr(true, false);
        assertEquals(4, Preis);
    }

    @Test
    public void testOp2notOp1() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneStartgebuehr(false, true);
        assertEquals(3, Preis);
    }

    @Test
    public void testnotOp1notOp2() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneStartgebuehr(false, false);
        assertEquals(2, Preis);
    }

    @Test
    public void testOp1andOp2() {
        Tarif tarif = new Tarif();
        int Preis = tarif.berechneStartgebuehr(true, true);
        assertEquals(5, Preis);
    }
}
