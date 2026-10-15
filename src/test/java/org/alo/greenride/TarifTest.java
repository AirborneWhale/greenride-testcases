package org.alo.greenride;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarifTest {


    //Test for tarif.berechneMietpreis
    @Test
    //Arrange
    public void testTarif1d() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneMietpreis(1);
        //Assert
        assertEquals(10, Preis);
    }

    @Test
    //Arrange
    public void testTarif2d() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneMietpreis(2);
        //Assert
        assertEquals(20, Preis);
    }

    @Test
    //Arrange
    public void testTarif3d() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneMietpreis(3);
        //Assert
        assertEquals(27, Preis);
    }

    @Test
    //Arrange
    public void testTarif5d() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneMietpreis(5);
        //Assert
        assertEquals(45, Preis);
    }

    @Test
    //Arrange
    public void testTarif7d() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneMietpreis(7);
        //Assert
        assertEquals(63, Preis);
    }

    @Test
    //Arrange
    public void testTarif0d() {
        Tarif tarif = new Tarif();
        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(0));
    }

    @Test
    //Arrange
    public void testTarifmin5d() {
        Tarif tarif = new Tarif();
        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(-5));
    }

    @Test
    //Arrange
    public void testTarif8d() {
        Tarif tarif = new Tarif();
        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(8));
    }

    @Test
    //Arrange
    public void testTarif100d() {
        Tarif tarif = new Tarif();
        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> tarif.berechneMietpreis(100));
    }

    //Test for tarif.berechneStartgebuehr
    @Test
    //Arrange
    public void testOp1notOp2() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneStartgebuehr(true, false);
        //Assert
        assertEquals(4, Preis);
    }

    @Test
    //Arrange
    public void testOp2notOp1() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneStartgebuehr(false, true);
        //Assert
        assertEquals(3, Preis);
    }

    @Test
    //Arrange
    public void testnotOp1notOp2() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneStartgebuehr(false, false);
        //Assert
        assertEquals(2, Preis);
    }

    @Test
    //Arrange
    public void testOp1andOp2() {
        Tarif tarif = new Tarif();
        //Act
        int Preis = tarif.berechneStartgebuehr(true, true);
        //Assert
        assertEquals(5, Preis);
    }
}
