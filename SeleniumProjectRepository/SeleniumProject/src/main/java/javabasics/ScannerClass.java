package javabasics;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int output=0;
        String operator="+";
        if(operator.equals("+"))
        {
            output=a+b;

        }
        System.out.println(output);

    }
}
