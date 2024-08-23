package com.thykkannotech;

public class Memoria {
    private String tipo;
    private String marca;
    private int capacidade;

    public Memoria(String tipo, String marca, int capacidade) {
        this.tipo = tipo;
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public void imprimir() {
        System.out.println("Tipo de Memória: " + tipo);
        System.out.println("Marca da Memória: " + marca);
        System.out.println("Capacidade da Memória: " + capacidade + " GB");
    }

    // Método hipotético de cadastrar, que você pode ajustar conforme necessário
    public void cadastrar() {
        // Lógica de cadastro da memória
        System.out.println("Memória cadastrada com sucesso.");
    }

    // Método hipotético de entrada de dados
    public void entrada(String tipo, String marca, int capacidade) {
        this.tipo = tipo;
        this.marca = marca;
        this.capacidade = capacidade;
        System.out.println("Dados da memória inseridos com sucesso.");
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
