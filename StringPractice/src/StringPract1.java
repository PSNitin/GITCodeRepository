import java.util.Arrays;
import java.util.Locale;

public class StringPract1 {

    public static void main(String[] args){

        String str="This is my WorLd!";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("World"));

        String str1= "123456789";
        StringBuilder sb = new StringBuilder(str1);
        sb.replace(0,sb.length()-4,"#");
        System.out.println(sb.toString());

        String str2= new String();
        for(int i=0;i<10;i++){

            str2=str2+i;
        }
        System.out.println(str2);
        System.out.println(str2.replaceAll(".(?=.{4})","#"));

        String str3 = "ParthibettuShekarNitin";
        System.out.println("--------"+str3.length());
        char[] ch = str3.toCharArray();

        ch[3]= Character.toUpperCase(ch[3]);
        System.out.println(new String(ch));

        String str4 = "Nitin";

        System.out.println(str4.substring(0,str4.length()));

        //CHECK if we can append to the String variable
        String str5 = new String();

        for(int i=0;i<5;i++){

            str5+=i+"_";
        }
        System.out.println("Printing Str5 : "+ str5);

        //Character array to String
        char[] ch1 = new char[5];
        for(int i=65;i<70;i++){
            ch1[i-65]=(char)i;
        }
        System.out.println(String.valueOf(ch1));

        String str6="";
        System.out.println("Size is :"+ str6.length());

        String str7="Nitin";
        char[] temp=str7.toCharArray();
        Arrays.sort(temp);
        System.out.println(temp);
    }
}
