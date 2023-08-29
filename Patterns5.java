package Mypractice1;
// Q] *half pyramid
// *
// **
// ***
// ****

//logic= row no.= 1 means 1*
//       row no.= 2 means 2*
//       row no.3 means 3*
//       row no.4 means 4*
//  means i to 1 to 4 but j ne j= 1 to j=i sudhi lai javano

public class Patterns5 {
    public static void main(String[] args){
        int n=4;
        for (int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
