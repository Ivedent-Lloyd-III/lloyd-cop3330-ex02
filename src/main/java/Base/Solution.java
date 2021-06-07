package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 02
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String name = readName();
        String outputString = generateOutputString(name);
        printOutput(outputString);

    }

    private static String readName(){

        System.out.print("What is the input string? ");
        String name = in.nextLine();

        return name;
    }

    private static String generateOutputString(String name) {

        return ""+name+ " has "+name.length()+" characters.";
    }

    private static void printOutput(String outputString){

        System.out.println(outputString);

    }

}
