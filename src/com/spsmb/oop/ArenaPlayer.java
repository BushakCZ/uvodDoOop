package com.spsmb.oop;

public class ArenaPlayer {
    private String name;
    private double hp;
    private double dmg;

    public ArenaPlayer(String name, double hp, double dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return "ArenaPlayer{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                '}';
    }
}
