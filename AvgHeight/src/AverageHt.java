import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageHt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = Float.parseFloat(sc.next());
        }

        float avgHeight = averageHeight(n, a);
        System.out.println(avgHeight);
    }

    // TODO: Implement this method
    static float averageHeight(int n, float[] a){

        float sum=0;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(float studentHeight : a){
            sum=sum+studentHeight;
        }
        return Float.parseFloat(df.format(sum/n));
    }
}
