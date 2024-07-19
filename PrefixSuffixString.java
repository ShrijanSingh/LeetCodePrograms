package LeetCode;
import java.util.Scanner;
public class PrefixSuffixString {
    public static void main(String[] args) {
        String words[]={"abab","ab"};
        int pair=0;
        for (int i=0;i<words.length;i++)
        {
            for (int j=i+1;j<words.length;j++)
            {
               if ( isPrefixAndSuffix(words[i],words[j]))
               pair++;

    }
}
System.out.println("Number of pair"+pair);
    }
    public static boolean isPrefixAndSuffix(String s1, String s2)
   {
    if(s1.length()>s2.length()){
        return false;
}
if (s2.indexOf(s1)==0 && s2.indexOf(s1,s2.length()-s1.length())==s2.length()-s1.length())
return true;
else 
return false;
}
}
