import java.util.ArrayList;
import java.util.List;

public class JapaneseGame {

    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("");
        arr.add("ab");
        arr.add("");
        arr.add("bc");
        ArrayList<String> output = new ArrayList<>(theGame(arr));
        System.out.println(output.toString());

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("ab");
        arr1.add("bc");
        arr1.add("");

        output = new ArrayList<>(theGame(arr1));
        System.out.println(output.toString());
    }

    public static List<String> theGame(List<String> words)
    {
        //Your Code Goes Here!
        ArrayList<String> arr = new ArrayList<>();
        if(words.isEmpty() || words.get(0).length()==0|| words.size()==1){
            return arr;
        }
        int i=1;
        for(;i<words.size();i++){

            if(!words.get(i).equals("")){
            if(words.get(i-1).charAt(words.get(i-1).length()-1)==words.get(i).charAt(0)) {

                arr.add(words.get(i - 1));
            }else{
                arr.add(words.get(i-1));
                break;
            }
            }else{
                arr.add(words.get(i-1));
                break;
            }

        }
        if(i==words.size()){
            arr.add(words.get(words.size()-1));
        }
        return arr;
    }
}
