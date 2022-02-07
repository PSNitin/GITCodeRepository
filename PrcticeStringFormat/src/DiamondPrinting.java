import java.util.*;

class DiamondPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {

        String[] result = new String[ 2*n-1 ];
        StringBuilder spaceStr = new StringBuilder();
        StringBuilder starStr = new StringBuilder();

        for(int i=0;i<n;i++){

            int j=0;
            spaceStr.delete();
            starStr.delete();

            while(j<(n-1)-i){
                spaceStr.append(" ");
                j++;
            }

            for(int k=0;k<=i;k++){
                starStr.append(" *");
            }

            spaceStr.append(starStr.toString().trim());

            if(i==n-1){
                result[i]=spaceStr.toString();
            }else{
                result[i]=spaceStr.toString();
                result[2n-1-i]=spaceStr.toString();
            }

        }
        return result;
    }
}
