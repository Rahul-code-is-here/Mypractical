package Mypractice1;
//     *****
//    *****
//   *****
//  *****
// *****         SOLID RHOMBUS
public class Patterns13 {
    public static void main(String[] args){
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
