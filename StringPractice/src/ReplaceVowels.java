public class ReplaceVowels {

    public static void main(String[] args){

        String str ="Hello, my name is Nitin";
        System.out.println("Output is "+vowel2Index(str));
    }

    public static String vowel2Index(String s) {
        //code me

        if(s.length()==0 ||s.isEmpty()){
            return s;
        }
        String str = new String();
        for(int i=0;i<s.length();i++){

            if(Character.toLowerCase(s.charAt(i))== 'o' ||
                    Character.toLowerCase(s.charAt(i))== 'i'||
                    Character.toLowerCase(s.charAt(i))== 'e' ||
                    Character.toLowerCase(s.charAt(i))== 'a' ||
                    Character.toLowerCase(s.charAt(i))=='u'){

                str=str+(i+1);
            }else{
                str=str+s.charAt(i);
            }
        }
        return str;
    }
}
