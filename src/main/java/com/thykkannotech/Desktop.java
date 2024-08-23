package com.thykkannotech;

public class Desktop extends Computador {
    private int placasVideo;
    private String marcaPlacaVideo;

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

    // Outros métodos conforme a necessidade
}
