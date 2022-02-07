import java.util.Scanner;

public class CoPrime {

    public static void main(String[] args){

        System.out.println("Give 2 numbers as input:");
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(isCoPrime(a,b)? "Is CoPrime":"Not a CoPrime");
    }

    /*
    private static boolean isCoPrime(int a, int b) {
        //time complexity is O(min(a,b)). This is a brute force Algo
        if(a<b){
            return isCoPrime(b,a);
        }

        if(a==b || a%b==0){
            return false;
        }
        if(b==1){
            return true;
        }

        for(int i=2;i<b;i++){

            if(a%i==0 && b%i==0){
                return false;
            }
        }
        return true;
    }
 */
    //------------------------------------------------------------------
/*  this is not a correct logic. It will fail in some cases[try (91,26)].
    private static boolean isCoPrime(int a, int b) {
        //time complexity is O(Sqrt(max(a,b))
        if(a<b){
            return isCoPrime(b,a);
        }

        if(a==b || a%b==0){
            return false;
        }
        if(b==1){
            return true;
        }

        for(int i=2;i<=Math.sqrt(a);i++){

            if(a%i==0 && b%i==0){
                return false;
            }
        }
        return true;
    }
*/
  //----------------------------------------------------
    /*
    private static boolean isCoPrime(int a, int b) {
        //time complexity is O(sqrt(min(a,b)))
        if(a<b){
            return isCoPrime(b,a);
        }

        if(b==1){
            return true;
        }

        if(a==b || a%b==0){
            return false;
        }

        for(int i=2;i<=Math.sqrt(b);i++){

            if(b%i==0){
                int factorTwo=b/i;
                if(a%i==0 || a%factorTwo==0){
                    return false;
                }
            }
        }
        return true;
    }
     */

    // Most efficient Algo
    private static boolean isCoPrime(int a, int b) {
        //time complexity is O(Logn)

        if(a==1){
            return true;
        }
        if(b==0){
            return false;
        }

        return isCoPrime(b,a%b);

    }


}
