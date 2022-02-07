public class VariableLengthArg {

    public static void main(String[] args){
        testVariableStringArg("Mutton");
    }

    private static void testVariableStringArg(String...args) {

        System.out.println("Hello, I like "+String.join(", ",args)+"!");


    }
}
