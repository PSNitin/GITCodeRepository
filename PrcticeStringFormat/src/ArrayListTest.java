import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(Integer.valueOf(10));
        arr.add(Integer.valueOf(20));
        arr.add(Integer.valueOf(30));
        arr.add(Integer.valueOf(40));
        arr.add(Integer.valueOf(50));
        arr.add(Integer.valueOf(60));

        //printing arrayList
        System.out.println(arr);

        int[] arr1 = {70,80,90};

        //converting normal array to ArrayList
       // ArrayList<Integer> arr2= new ArrayList(Arrays.asList(arr1));
        //System.out.println(arr2);
        //ArrayList<Integer> arr3 = new ArrayList<>();
       // arr3=arr.subList(2,5);


    }
}
