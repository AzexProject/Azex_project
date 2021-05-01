package com.example.qualificationmarrigeproject.recycler;

public class CardModel {
    int card_image;
    String card_name;

    public CardModel(int card_image, String card_name) {
        this.card_image = card_image;
        this.card_name = card_name;
    }

    public int getCard_image() {
        return card_image;
    }

    public void setCard_image(int card_image) {
        this.card_image = card_image;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }
}
