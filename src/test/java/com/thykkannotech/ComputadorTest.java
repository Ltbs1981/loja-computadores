package com.thykkannotech;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    @Test
    void testCadastrarDesktop() {
        Desktop desktop = new Desktop("Dell", 3500.00, 10, new Memoria("DDR4", "Kingston", 16), new HD("SSD", "Samsung", 500), new Fonte("ATX", "Corsair", 750));
        desktop.cadastrar();
        assertNotNull(desktop.getMarca());
        assertTrue(desktop.getPreco() > 0);
        assertTrue(desktop.getQuantidade() > 0);
        assertNotNull(desktop.getMemoria());
        assertNotNull(desktop.getHd());
        assertNotNull(desktop.getFonte());
    }

    @Test
    void testCadastrarNotebook() {
        Notebook notebook = new Notebook("HP", 4500.00, 5, new Memoria("DDR4", "Corsair", 8), new HD("SSD", "Kingston", 256), new Fonte("Adaptador", "HP", 90));
        notebook.cadastrar();
        assertNotNull(notebook.getMarca());
        assertTrue(notebook.getPreco() > 0);
        assertTrue(notebook.getQuantidade() > 0);
        assertNotNull(notebook.getMemoria());
        assertNotNull(notebook.getHd());
        assertNotNull(notebook.getFonte());
    }

    @Test
    void testCadastrarServidor() {
        Servidor servidor = new Servidor("IBM", 15000.00, 2, new Memoria("DDR4 ECC", "Crucial", 64), new HD("SSD", "Seagate", 2000), new Fonte("Redundante", "Seasonic", 1200));
        servidor.cadastrar();
        assertNotNull(servidor.getMarca());
        assertTrue(servidor.getPreco() > 0);
        assertTrue(servidor.getQuantidade() > 0);
        assertNotNull(servidor.getMemoria());
        assertNotNull(servidor.getHd());
        assertNotNull(servidor.getFonte());
    }
    @Test
    void testImprimirDesktop() {
        Desktop desktop = new Desktop("Dell", 3500.00, 10, new Memoria("DDR4", "Kingston", 16), new HD("SSD", "Samsung", 500), new Fonte("ATX", "Corsair", 750));
        // Testando o método imprimir()
        desktop.imprimir();


        assertEquals("Dell", desktop.getMarca());
        assertEquals(3500.00, desktop.getPreco());
        assertEquals(10, desktop.getQuantidade());
    }

    @Test
    void testImprimirNotebook() {
        Notebook notebook = new Notebook("HP", 4500.00, 5, new Memoria("DDR4", "Corsair", 8), new HD("SSD", "Kingston", 256), new Fonte("Adaptador", "HP", 90));
        // Testando o método imprimir()
        notebook.imprimir();


        assertEquals("HP", notebook.getMarca());
        assertEquals(4500.00, notebook.getPreco());
        assertEquals(5, notebook.getQuantidade());
    }

    @Test
    void testImprimirServidor() {
        Servidor servidor = new Servidor("IBM", 15000.00, 2, new Memoria("DDR4 ECC", "Crucial", 64), new HD("SSD", "Seagate", 2000), new Fonte("Redundante", "Seasonic", 1200));
        // Testando o método imprimir()
        servidor.imprimir();


        assertEquals("IBM", servidor.getMarca());
        assertEquals(15000.00, servidor.getPreco());
        assertEquals(2, servidor.getQuantidade());
    }
}
