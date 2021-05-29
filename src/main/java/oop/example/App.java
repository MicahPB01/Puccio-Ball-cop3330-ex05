package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner getFirstNumber = new Scanner(System.in);
        Scanner getSecondNumber =  new Scanner(System.in);

        System.out.print( "What is the first number? ");
        String firstNumber = getFirstNumber.nextLine();

        System.out.print("What is the second number? ");
        String secondNumber = getSecondNumber.nextLine();

        //convert string to int
        int nOne = Integer.parseInt(firstNumber);
        int nTwo = Integer.parseInt(secondNumber);

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", nOne, nTwo, (nOne+nTwo), nOne, nTwo, (nOne-nTwo), nOne, nTwo, (nOne*nTwo), nOne,nTwo, (nOne/nTwo));



    }
}
