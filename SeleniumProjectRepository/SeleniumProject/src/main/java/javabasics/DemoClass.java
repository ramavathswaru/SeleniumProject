package javabasics;

public class DemoClass {
    public static void main(String[] args) {
        int n=10;
        String role="manager";
        int output=0;

        if(role.equals("manager"))

        {
            output=10*500;
        }
        else if (role.equals("clerk"))
        {
            output=10*350;
        } else if (role.equals("employee")) {
            output=10*250;

        }
        System.out.println(output);

    }
}
