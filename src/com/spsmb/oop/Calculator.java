package com.spsmb.oop;

public class Calculator {

    double scitani(double a, double b) {
        return Math.round(a + b);
    }

    double odcitani(double a, double b) {
        return Math.round(a - b);
    }
    double nasobeni(double a, double b) {
        return Math.round(a * b);
    }
    double deleni(double a, double b) {
        return Math.round(a / b);
    }
    double deleniZbytek(double a, double b) {
        return Math.round(a % b);
    }



}
