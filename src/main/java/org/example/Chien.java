package org.example;

public class Chien extends AnimalBase {
    public Chien(String name, int age) {
        super(name, age);
    }

    @Override
    public void manger(){
        System.out.println("Mange : croquettes pour chiens");
    }
    @Override
    public void emettreSon(){
        System.out.println("Émet un son : Wouf !");
    }
}
