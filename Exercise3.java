package Mypractice1;

import java.util.Scanner;



public class Exercise3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        double a= sc.nextDouble();
        System.out.println("enter the value of b");
       double b= sc.nextDouble();
       System.out.println("the devider is:");
        double devider = a/b;
        System.out.println(devider);
    }
}
