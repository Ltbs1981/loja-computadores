package com.thykkannotech;

import java.util.Scanner;

public abstract class Computador {
    private String marca;
    private double preco;
    private int quantidade;
    private Memoria memoria;
    private HD hd;
    private Fonte fonte;

    public Computador(String marca, double preco, int quantidade, Memoria memoria, HD hd, Fonte fonte) {
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.memoria = memoria;
        this.hd = hd;
        this.fonte = fonte;
    }

    // Getters e Setters para todos os atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        memoria.imprimir();
        hd.imprimir();
        fonte.imprimir();
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do computador: ");
        this.marca = scanner.nextLine();

        System.out.print("Digite o preço do computador: ");
        this.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        this.quantidade = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha

        // Cadastrar Memória
        System.out.println("Cadastrar Memória:");
        System.out.print("Digite o tipo de memória: ");
        String tipoMemoria = scanner.nextLine();
        System.out.print("Digite a marca da memória: ");
        String marcaMemoria = scanner.nextLine();
        System.out.print("Digite a capacidade da memória (GB): ");
        int capacidadeMemoria = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.memoria = new Memoria(tipoMemoria, marcaMemoria, capacidadeMemoria);
        this.memoria.cadastrar(); // Método ajustado em Memoria

        // Cadastrar HD
        System.out.println("Cadastrar HD:");
        System.out.print("Digite o tipo de HD: ");
        String tipoHD = scanner.nextLine();
        System.out.print("Digite a marca do HD: ");
        String marcaHD = scanner.nextLine();
        System.out.print("Digite a capacidade do HD (GB): ");
        int capacidadeHD = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.hd = new HD(tipoHD, marcaHD, capacidadeHD);
        this.hd.cadastrar(); // Método ajustado em HD

        // Cadastrar Fonte
        System.out.println("Cadastrar Fonte:");
        System.out.print("Digite o tipo de fonte: ");
        String tipoFonte = scanner.nextLine();
        System.out.print("Digite a marca da fonte: ");
        String marcaFonte = scanner.nextLine();
        System.out.print("Digite a potência da fonte (W): ");
        int potenciaFonte = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.fonte = new Fonte(tipoFonte, marcaFonte, potenciaFonte);
        this.fonte.cadastrar(); // Método ajustado em Fonte
    }

    public void entrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do computador: ");
        this.marca = scanner.nextLine();

        System.out.print("Digite o preço do computador: ");
        this.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        this.quantidade = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha

        // Entrada de dados para Memória
        System.out.println("Entrada de dados para Memória:");
        System.out.print("Digite o tipo de memória: ");
        String tipoMemoria = scanner.nextLine();
        System.out.print("Digite a marca da memória: ");
        String marcaMemoria = scanner.nextLine();
        System.out.print("Digite a capacidade da memória (GB): ");
        int capacidadeMemoria = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.memoria = new Memoria(tipoMemoria, marcaMemoria, capacidadeMemoria);
        this.memoria.entrada(tipoMemoria, marcaMemoria, capacidadeMemoria);

        // Entrada de dados para HD
        System.out.println("Entrada de dados para HD:");
        System.out.print("Digite o tipo de HD: ");
        String tipoHD = scanner.nextLine();
        System.out.print("Digite a marca do HD: ");
        String marcaHD = scanner.nextLine();
        System.out.print("Digite a capacidade do HD (GB): ");
        int capacidadeHD = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.hd = new HD(tipoHD, marcaHD, capacidadeHD);
        this.hd.entrada(tipoHD, marcaHD, capacidadeHD);

        // Entrada de dados para Fonte
        System.out.println("Entrada de dados para Fonte:");
        System.out.print("Digite o tipo de fonte: ");
        String tipoFonte = scanner.nextLine();
        System.out.print("Digite a marca da fonte: ");
        String marcaFonte = scanner.nextLine();
        System.out.print("Digite a potência da fonte (W): ");
        int potenciaFonte = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        this.fonte = new Fonte(tipoFonte, marcaFonte, potenciaFonte);
        this.fonte.entrada(tipoFonte, marcaFonte, potenciaFonte);
    }
}
