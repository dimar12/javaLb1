package com.company;

public class Pistol extends Gunshot{
    public  Pistol(String name, int price, double caliber, int ammunition){
        super(name, price, caliber, ammunition);
    }
    public String description() {
        return "Пистолет, модель: " + getName() + ", цена: " + getPrice() + ", калибр: " + getCaliber() +  ", боезапас: " + getAmmunition();
    }
}
