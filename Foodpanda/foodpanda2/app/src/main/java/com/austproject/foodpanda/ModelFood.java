package com.austproject.foodpanda;

public class ModelFood {

    private int image;
    private String name, price;

    public ModelFood(int image, String name, String price) {
        this.image = image;
        this.name = name;

        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }



    public void setPrice(String price) {
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
