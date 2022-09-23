package com.spsmb.oop;

public class Animal {

    String name;
    String type;
    String gender;
    int age;
    String sound;

    public Animal(String name, String type, String gender, int age, String sound) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }

    void doSound() {
        System.out.println(name + ": " + sound);
    }

    void doSound(String customSound) {
        System.out.println(name + ": " + customSound);
    }


}
