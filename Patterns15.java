package Mypractice1;
//    1
//   212
//  32123
// 4321234
//543212345
public class Patterns15 {
    public static void main(String[] args){
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // first part
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd part
            for(int j=2; j<=i; j++){ // j=1 mate pan alag patterns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
