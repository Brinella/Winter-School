package com.Emma.Multimodules;

import java.util.*;

/**
 * Created by Long on 17/02/2018.
 */
public class runAddition {

    public static void main(String[] args) {
        Addition addObject = new Addition();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number to add: ");
        int firstInteger = input.nextInt();
        addObject.setInt1(firstInteger);
        System.out.print("Please enter the second number to add: ");
        int secondInteger = input.nextInt();
        addObject.setInt2(secondInteger);
        System.out.println("The Answer is: " + addObject.addition());

    }

}
