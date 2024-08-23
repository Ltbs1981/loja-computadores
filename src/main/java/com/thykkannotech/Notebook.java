package com.thykkannotech;

public class Notebook extends Computador {
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;

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

    // Outros métodos conforme a necessidade
}
