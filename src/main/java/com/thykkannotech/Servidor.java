package com.thykkannotech;

import java.util.Scanner;

public class Servidor extends Computador {
    private int numeroHDs;
    private String tipoGabinete;
    private String marcaGabinete;

    public Servidor() {
        super("", 0.0, 0, null, null, null);
        this.numeroHDs = 0;
        this.tipoGabinete = "";
        this.marcaGabinete = "";
    }

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

    // Métodos para definir e obter valores específicos
    public void entrada() {
        super.entrada(); // Chamando a entrada da classe Computador
        // Adicionar aqui a entrada de dados específicos para Servidor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de HDs: ");
        this.numeroHDs = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o tipo de gabinete: ");
        this.tipoGabinete = scanner.nextLine();
        System.out.print("Digite a marca do gabinete: ");
        this.marcaGabinete = scanner.nextLine();
    }
}
