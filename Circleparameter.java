package Mypractice1;

import java.util.Scanner;

public class Circleparameter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius: ");
        double rad=sc.nextDouble();
        double parameter= 2*3.14*rad;
        System.out.println(parameter);
    }
}
