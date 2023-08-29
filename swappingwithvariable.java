package Mypractice1;

import java.util.Scanner;

public class swappingwithvariable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a for swapping with variable");
        int a= sc.nextInt();
        System.out.println("enter the value of b for swapping wit variable");
        int b= sc.nextInt();

        System.out.println("before swapping"+ a + "and" + b);

        int temp= a; // a= a+b;
        a=b;         // b=a-b;
        b=temp;      // a= a-b;

        System.out.println("after swapping "+ a + "and" + b);

    }
}
