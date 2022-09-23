package com.spsmb.oop;

public class Player {

    private String championName;
    private String name;
    private String className;
    private String rank;
    private int accountLvl;
    private int championLvl;
    private double masteryPoints;

    public Player(String championName, String name, String className, String rank, int accountLvl, int championLvl, double masteryPoints) {
        this.championName = championName;
        this.name = name;
        this.className = className;
        this.rank = rank;
        this.accountLvl = accountLvl;
        this.championLvl = championLvl;
        this.masteryPoints = masteryPoints;
    }

    @Override
    public String toString() {
        return "Player{" +
                "championName='" + championName + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", rank='" + rank + '\'' +
                ", accountLvl=" + accountLvl +
                ", championLvl=" + championLvl +
                ", masteryPoints=" + masteryPoints +
                '}';
    }

    public void startGame(){
        System.out.println("Starting game...");
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAccountLvl() {
        return accountLvl;
    }

    public void setAccountLvl(int accountLvl) {
        this.accountLvl = accountLvl;
    }

    public int getChampionLvl() {
        return championLvl;
    }

    public void setChampionLvl(int championLvl) {
        this.championLvl = championLvl;
    }

    public double getMasteryPoints() {
        return masteryPoints;
    }

    public void setMasteryPoints(double masteryPoints) {
        this.masteryPoints = masteryPoints;
    }
}
