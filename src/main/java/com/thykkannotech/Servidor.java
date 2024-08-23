package com.thykkannotech;

public class Servidor extends Computador {
    private int numeroHDs;
    private String tipoGabinete;
    private String marcaGabinete;

    public Servidor(String marca, double preco, int quantidade, Memoria memoria, HD hd, Fonte fonte, int numeroHDs, String tipoGabinete, String marcaGabinete) {
        super(marca, preco, quantidade, memoria, hd, fonte);
        this.numeroHDs = numeroHDs;
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de HDs: " + numeroHDs);
        System.out.println("Tipo de Gabinete: " + tipoGabinete);
        System.out.println("Marca do Gabinete: " + marcaGabinete);
    }

    // Outros métodos conforme a necessidade
}
