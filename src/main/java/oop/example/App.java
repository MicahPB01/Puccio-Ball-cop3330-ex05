package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "What is the first number? ");
        String firstNumber = input.nextLine();

        System.out.print("What is the second number? ");
        String secondNumber = input.nextLine();

        //convert string to int
        int nOne = Integer.parseInt(firstNumber);
        int nTwo = Integer.parseInt(secondNumber);

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", nOne, nTwo, (nOne+nTwo), nOne, nTwo, (nOne-nTwo), nOne, nTwo, (nOne*nTwo), nOne,nTwo, (nOne/nTwo));



    }
}
