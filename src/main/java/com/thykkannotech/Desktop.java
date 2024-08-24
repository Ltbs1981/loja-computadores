package com.thykkannotech;
import java.util.Scanner;


public class Desktop extends Computador {
    private int placasVideo;
    private String marcaPlacaVideo;

    public int getPlacasVideo() {
        return placasVideo;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public Desktop() {
        super("", 0.0, 0, null, null, null);
        this.placasVideo = 0;
        this.marcaPlacaVideo = "";
    }

    public Desktop(String marca, double preco, int quantidade, Memoria memoria, HD hd, Fonte fonte, int placasVideo, String marcaPlacaVideo) {
        super(marca, preco, quantidade, memoria, hd, fonte);
        this.placasVideo = placasVideo;
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Placas de Vídeo: " + placasVideo);
        System.out.println("Marca da Placa de Vídeo: " + marcaPlacaVideo);
    }

    // Métodos para definir e obter valores específicos
    public void entrada() {
        super.entrada(); // Chamando a entrada da classe Computador
        // Adicionar aqui a entrada de dados específicos para Desktop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de placas de vídeo: ");
        this.placasVideo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite a marca da placa de vídeo: ");
        this.marcaPlacaVideo = scanner.nextLine();
    }
}
