import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args){

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);

        System.out.println(arrList.toString());
        //int[] arr =  arrList.toArray(); not working
        Integer[] arr = (Integer[]) arrList.toArray();

    }
}
