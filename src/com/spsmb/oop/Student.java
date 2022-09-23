package com.spsmb.oop;

public class Student {

    String name;
    int age;
    double height;
    private int iq;

    public Student(String name, int age, double height, int iq) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.iq = iq;
    }

    void intro() {
        System.out.println("Ahoj, ja jsem " + name + ", mam " + iq + " iq.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", iq=" + iq +
                '}';
    }

    double sum(double a, double b) {
        return a + b;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
