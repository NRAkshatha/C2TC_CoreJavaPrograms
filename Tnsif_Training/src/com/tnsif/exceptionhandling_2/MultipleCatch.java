package com.tnsif.exceptionhandling_2;

import java.util.Scanner;

public class MultipleCatch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(sc.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}