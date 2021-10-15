package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string - ");
        String s = sc.nextLine();
        System.out.println("enter the index number-");
        int n= sc.nextInt();
        char c = s.charAt(n);
        System.out.println(c);
    }
}
