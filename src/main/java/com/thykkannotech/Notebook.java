package com.thykkannotech;

import java.util.Scanner;

public class Notebook extends Computador {
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;

    public Notebook() {
        super("", 0.0, 0, null, null, null);
        this.tipoMonitor = "";
        this.marcaMonitor = "";
        this.resolucaoMonitor = 0;
    }

    public Notebook(String marca, double preco, int quantidade, Memoria memoria, HD hd, Fonte fonte, String tipoMonitor, String marcaMonitor, int resolucaoMonitor) {
        super(marca, preco, quantidade, memoria, hd, fonte);
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Monitor: " + tipoMonitor);
        System.out.println("Marca do Monitor: " + marcaMonitor);
        System.out.println("Resolução do Monitor: " + resolucaoMonitor + "p");
    }

    // Métodos para definir e obter valores específicos
    public void entrada() {
        super.entrada(); // Chamando a entrada da classe Computador
        // Adicionar aqui a entrada de dados específicos para Notebook
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de monitor: ");
        this.tipoMonitor = scanner.nextLine();
        System.out.print("Digite a marca do monitor: ");
        this.marcaMonitor = scanner.nextLine();
        System.out.print("Digite a resolução do monitor: ");
        this.resolucaoMonitor = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
    }
}
