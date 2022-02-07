import java.util.Scanner;

public class SecondLar {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = secMaxInArray(n, arr);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int secMaxInArray(int n, int[] arr) {

        int[] maxTwo = {0,0};
        for(int element : arr){

            if(element>maxTwo[0]){
                maxTwo[1]=maxTwo[0];
                maxTwo[0]=element;
            }else if(element > maxTwo[1] && element < maxTwo[0]){
                maxTwo[1]=element;
            }
        }
        return maxTwo[1];
    }


}
