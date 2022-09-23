package com.spsmb.oop;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //      STUDENTI

/*        Student myStudent = new Student("Stepan", 18, 193, 50);
        myStudent.intro();
        System.out.println(myStudent);
        System.out.println(myStudent.getIq());
        myStudent.setIq(70);
        System.out.println(myStudent.getIq());
        double resOne = myStudent.sum(10, 12);
        System.out.println(resOne);
        //
        System.out.println(" ");
        //
        Student anotherStudent = new Student("Simon", 18, 188, 150);
        anotherStudent.intro();
        System.out.println(anotherStudent);
        double resTwo = myStudent.sum(594, 157);
        System.out.println(resTwo);
        //
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        //
        Animal myAnimal = new Animal("Micka", "Cat", "Female", 5, "Meow");
        System.out.println(myAnimal);
        myAnimal.doSound();
        //
        System.out.println(" ");
        //
        Animal anotherAnimal = new Animal("Alik", "Dog", "Male", 12, "Haf");
        System.out.println(anotherAnimal);
        anotherAnimal.doSound("haffff");
        //
        System.out.println();
        System.out.println();
        System.out.println();
        //
        Player playerOne = new Player("Gragas", "Alex", "Mage", "Grandmaster 2 400lp", 249, 6, 59016);
        System.out.println(playerOne);
        playerOne.setClassName("Tank");
        System.out.println("Class changed to: " + playerOne.getClassName());
        playerOne.startGame();
        System.out.println();*/



        /*            KALKULAČKA
        Calculator calculator = new Calculator();

        System.out.println(calculator.scitani(5,10));
        System.out.println(calculator.odcitani(5,10));
        System.out.println(calculator.nasobeni(5,10));
        System.out.println(calculator.deleni(5,10));
        System.out.println(calculator.deleniZbytek(5,3));
*/

        //         ARÉNA
        run();
    }

    private static void run() {
        System.out.println("Vitejte v arene");
        String[] ArenaPlayerNames = userInput();
        ArenaPlayer ArenaPlayerOne = new ArenaPlayer(ArenaPlayerNames[0], 100, 15);
        ArenaPlayer ArenaPlayerTwo = new ArenaPlayer(ArenaPlayerNames[1], 50, 2);
        Arena arena = new Arena("Tillixuv kabinet");
        arena.fight(ArenaPlayerOne, ArenaPlayerTwo);
    }

    private static String[] userInput() {
        System.out.println("Zadejte jmeno prvniho hrace:");
        String ArenaPlayerOneName = sc.nextLine();
        System.out.println("Zadejte jmeno druheho hrace:");
        String ArenaPlayerTwoName = sc.nextLine();
        return new String[]{ArenaPlayerOneName, ArenaPlayerTwoName};
    }
}
