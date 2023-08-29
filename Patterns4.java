package Mypractice1;
// Q] print : *****
//            *   *
//            *   *
//            *****
//    (1,1) (2,1) (3,1) (4,1) (5,1)
//    (1,2)                   (5,2)
//    (1,3)                   (5,3)
//    (1,4) (2,4) (3,4) (4,4) (5,4)

//logic
// i and j nu box bani gayu
// i=1 etle i=1 mate * print so i=1 and j=1 to j=5
// means first line ma column ma *****
//pachi i=2 mate chalshe and j ni value change thashe
// i=2 means 2nd column ma j=1 and j=5 mte j * print thashe
// i=3 means 3rd column ma pan j=1,5 mate j * print thashe
//i=4 etle ke i=n mate j ni badhi value 1 to 5 badhe * aavshe
//else ma khali space print thashe and chellu System.out.println new line mate
public class Patterns4 {
    public static void main(String args[]){
        int n=4, m=5;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=m; j++) {

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}


