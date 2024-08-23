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

        // Aqui vamos supor que temos métodos para cadastrar Memoria, HD e Fonte
        System.out.println("Cadastrar Memória:");
        this.memoria = new Memoria();
        this.memoria.cadastrar(); // Método hipotético em Memoria

        System.out.println("Cadastrar HD:");
        this.hd = new HD();
        this.hd.cadastrar(); // Método hipotético em HD

        System.out.println("Cadastrar Fonte:");
        this.fonte = new Fonte();
        this.fonte.cadastrar(); // Método hipotético em Fonte
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

        // Solicitar entrada de dados para Memoria, HD e Fonte
        System.out.println("Entrada de dados para Memória:");
        this.memoria = new Memoria();
        this.memoria.entrada(); // Método hipotético em Memoria

        System.out.println("Entrada de dados para HD:");
        this.hd = new HD();
        this.hd.entrada(); // Método hipotético em HD

        System.out.println("Entrada de dados para Fonte:");
        this.fonte = new Fonte();
        this.fonte.entrada(); // Método hipotético em Fonte
    }
}
package com.thykkannotech;

public class Computador {
}
