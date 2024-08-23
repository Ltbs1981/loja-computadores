package com.thykkannotech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar 3 objetos de cada tipo: Desktop, Notebook, e Servidor

        Desktop[] desktops = new Desktop[3];
        Notebook[] notebooks = new Notebook[3];
        Servidor[] servidores = new Servidor[3];

        // Coletar dados para os objetos Desktop
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Desktop " + (i + 1));
            desktops[i] = new Desktop();
            desktops[i].entrada();
        }

        // Coletar dados para os objetos Notebook
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Notebook " + (i + 1));
            notebooks[i] = new Notebook();
            notebooks[i].entrada();
        }

        // Coletar dados para os objetos Servidor
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Servidor " + (i + 1));
            servidores[i] = new Servidor();
            servidores[i].entrada();
        }

        // Exibir os dados dos objetos criados
        System.out.println("\nDesktops cadastrados:");
        for (Desktop desktop : desktops) {
            desktop.imprimir();
            System.out.println();
        }

        System.out.println("Notebooks cadastrados:");
        for (Notebook notebook : notebooks) {
            notebook.imprimir();
            System.out.println();
        }

        System.out.println("Servidores cadastrados:");
        for (Servidor servidor : servidores) {
            servidor.imprimir();
            System.out.println();
        }

        scanner.close();
    }
}
