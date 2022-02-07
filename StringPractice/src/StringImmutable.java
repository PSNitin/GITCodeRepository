import java.util.Arrays;

public class StringImmutable {

    public static void main(String[] args){
        String str="ABC";

        System.out.println(str);

        str.concat("abc");

        System.out.println(str);

        System.out.println(str.concat("abc"));

        str=str+"#";

        System.out.println(str);

        String[][] strArr = {{"Hello","My","Name","Is"},{"How","Are","You"},{"What","You","Do"}};

        System.out.println(Arrays.deepToString(strArr));
        System.out.println(strArr.toString());
    }
}
