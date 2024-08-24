package com.thykkannotech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Desktop desktop;
    private Notebook notebook;
    private Servidor servidor;

    @BeforeEach
    public void setUp() {
        // Inicializar os objetos
        desktop = new Desktop();
        notebook = new Notebook();
        servidor = new Servidor();
    }

    @Test
    public void testCriacaoDesktop() {
        String input = "HP\n3000.0\n10\nDDR3\nKingston\n8\nHDD\nWestern Digital\n1024\nNon-Modular\nEVGA\n700\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Desktop desktop = new Desktop();
        desktop.entrada();

        assertEquals("HP", desktop.getMarca());
        assertEquals(3000.0, desktop.getPreco(), 0.001);
        assertEquals(10, desktop.getQuantidade());
        // Outras asserções para os componentes, se necessário
    }

    @Test
    public void testCriacaoNotebook() {
        String input = "Dell\n2500.0\n5\nDDR4\nCorsair\n16\nSSD\nSamsung\n512\nModular\nCoolerMaster\n600\nLED\nSamsung\n1920\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Notebook notebook = new Notebook();
        notebook.entrada();

        assertEquals("LED", notebook.getTipoMonitor());
        assertEquals("Samsung", notebook.getMarcaMonitor());
        assertEquals(1920, notebook.getResolucaoMonitor());
    }

    @Test
    public void testCriacaoServidor() {
        String input = "IBM\n15000.0\n2\nDDR4\nHyperX\n64\nSAS\nSeagate\n2048\nRedundant\nCorsair\n1200\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Servidor servidor = new Servidor();
        servidor.entrada();

        assertEquals("IBM", servidor.getMarca());
        assertEquals(15000.0, servidor.getPreco(), 0.001);
        assertEquals(2, servidor.getQuantidade());
        // Outras asserções para os componentes, se necessário
    }

    @Test
    public void testImprimirDesktop() {
        desktop = new Desktop("Dell", 3500.00, 2, new Memoria("DDR4", "Kingston", 16),
                new HD("SSD", "Samsung", 512), new Fonte("Modular", "Corsair", 750), 2, "NVIDIA");

        assertDoesNotThrow(() -> desktop.imprimir());
    }

    @Test
    public void testImprimirNotebook() {
        notebook = new Notebook("Asus", 2800.00, 5, new Memoria("DDR4", "Corsair", 8),
                new HD("SSD", "Kingston", 256), new Fonte("Compacta", "EVGA", 500), "LED", "Samsung", 1080);

        assertDoesNotThrow(() -> notebook.imprimir());
    }

    @Test
    public void testImprimirServidor() {
        servidor = new Servidor("HP", 7500.00, 3, new Memoria("DDR4", "Crucial", 64),
                new HD("NVMe", "Western Digital", 1024), new Fonte("Redundant", "Seasonic", 1200), 4, "Mid Tower", "Corsair");

        assertDoesNotThrow(() -> servidor.imprimir());
    }
}
