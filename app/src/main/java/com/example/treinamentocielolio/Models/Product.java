package com.example.treinamentocielolio.Models;

public class Product {
    String nome;
    String imageUrl;
    int price;
    public Product(String nome, String imageUrl, int price) {
        this.nome = nome;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
