package Mypractice1;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0; i<11; i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
