public class PracticeStrFormat {

    public static void main(String[] args){

        String name=null;

        System.out.println(String.format("%b",name));

        name="Nitin";

        System.out.println(String.format("Hello master %s, how may I help you", name));

        System.out.println(String.format("%d",101));
        System.out.println(String.format("% d",101));
        System.out.println(String.format("|%10d|",101));
        System.out.println(String.format("|%-10d|",101));
        System.out.println(String.format("|%010d|",101));
    }
}
