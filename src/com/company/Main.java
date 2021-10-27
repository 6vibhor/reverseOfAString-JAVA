package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        reverse(str);
    }
    public static void reverse(String str) {
        String string = "";
        for(int i = str.length() - 1; i > -1; i--) {
            string += str.charAt(i);
        }
        System.out.println(string);
    }
}
