package org.example;

public abstract class AnimalBase implements Animal {
    protected String name;
    protected int age;

    public AnimalBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void detailsAnimal(){
        System.out.println(name + "," + age + "ans");
    }

}
