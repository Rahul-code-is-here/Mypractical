package Mypractice1;

import java.util.Scanner;

public class Ghadiyo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num: ");
        int num=sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(num + "x" + i + "=" + num*i);
        }
    }
}
