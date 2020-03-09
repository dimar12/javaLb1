package com.company;

public class MachineGun extends Gunshot{
    private int rateOfFire;
    public  MachineGun(String name, int price, double caliber, int ammunition, int rateOfFire){
        super(name, price, caliber, ammunition);
        this.rateOfFire = rateOfFire;
    }

    public String description() {
        return "Автомат, модель: " + getName() + ", цена: " + getPrice() + ", калибр: " + getCaliber() +  ", боезапас: " + getAmmunition() + ", скотосртельность: " + rateOfFire + " выстрелов в минуту";
    }
}
