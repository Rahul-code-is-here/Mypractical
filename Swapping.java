package Mypractice1;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of 'a' for swapping");
        int a=sc.nextInt();
        System.out.println("enter the value of 'b' for swapping");
        int b=sc.nextInt();

        System.out.println("before swapping"+ a   +   "and" +   b);
        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("after swapping "+ a +   "and" +   b);
    }
}
