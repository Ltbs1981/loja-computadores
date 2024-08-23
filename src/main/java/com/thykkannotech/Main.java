package com.thykkannotech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar e manipular objetos Desktop
        Memoria memoriaDesktop = new Memoria("DDR4", "Corsair", 16);
        HD hdDesktop = new HD("SSD", "Samsung", 512);
        Fonte fonteDesktop = new Fonte("ATX", "Corsair", 750);
        Desktop desktop = new Desktop("Dell", 3500.0, 10, memoriaDesktop, hdDesktop, fonteDesktop, 2, "NVIDIA");

        // Criar e manipular objetos Notebook
        Memoria memoriaNotebook = new Memoria("DDR4", "Kingston", 8);
        HD hdNotebook = new HD("SSD", "Kingston", 256);
        Fonte fonteNotebook = new Fonte("Slim", "HP", 65);
        Notebook notebook = new Notebook("Acer", 2500.0, 5, memoriaNotebook, hdNotebook, fonteNotebook, "LED", "LG", 1080);

        // Criar e manipular objetos Servidor
        Memoria memoriaServidor = new Memoria("DDR4 ECC", "Crucial", 64);
        HD hdServidor = new HD("SAS", "Seagate", 2048);
        Fonte fonteServidor = new Fonte("Redundante", "EVGA", 1200);
        Servidor servidor = new Servidor("IBM", 10000.0, 2, memoriaServidor, hdServidor, fonteServidor, 4, "Rack", "Cisco");

        // Imprimir os objetos
        desktop.imprimir();
        notebook.imprimir();
        servidor.imprimir();

        scanner.close();
    }
}
