/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex08;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int people = myApp.getPeople();
        int pizzas = myApp.getPizzas();
        int slices = myApp.getSlices();
        int totalSlices = myApp.getTotal(pizzas, slices);
        int leftovers = myApp.getLeftovers(totalSlices, people);
        int givePizza = myApp.getDividedPizza(leftovers, totalSlices, people);
        String outputString = myApp.generateOutputString(people, givePizza, leftovers);
        myApp.printOutput(outputString);
    }

    public int getPeople() {
        System.out.print("How many people? ");
        return in.nextInt();
    }

    public int getPizzas() {
        System.out.print("How many pizzas do you have? ");
        return in.nextInt();
    }

    public int getSlices() {
        System.out.print("How many slices per pizza? ");
        return in.nextInt();
    }

    public int getTotal(int pizzas, int slices) {
        return pizzas * slices;
    }

    public int getLeftovers(int totalSlices, int people) {
        return totalSlices%people;
    }

    public int getDividedPizza(int leftovers, int totalSlices, int people ) {
        return (totalSlices-leftovers)/people;
    }

    public String generateOutputString(int people, int givePizza, int leftovers) {
        return people+" people gets "+givePizza+" pieces of pizza.\nThere are "+leftovers+" leftover pieces.";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}