package com.thykkannotech;

public class Fonte {
    private String tipo;
    private String marca;
    private int potencia;

    public Fonte(String tipo, String marca, int potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void imprimir() {
        System.out.println("Tipo de Fonte: " + tipo);
        System.out.println("Marca da Fonte: " + marca);
        System.out.println("Potência da Fonte: " + potencia + " W");
    }


    public void cadastrar() {
        // Lógica de cadastro da Fonte
        System.out.println("Fonte cadastrada com sucesso.");
    }


    public void entrada(String tipo, String marca, int potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
        System.out.println("Dados da fonte inseridos com sucesso.");
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
