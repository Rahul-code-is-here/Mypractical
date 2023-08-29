package Mypractice1;

public class Fibbonaci {
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c;
        int n=10;

        System.out.println(a +" "+ b);

        for(int i=2; i<n; i++){
             c=a+b;
             a=b;
             b=c;
             System.out.println(" " + c);

        }
    }
}
