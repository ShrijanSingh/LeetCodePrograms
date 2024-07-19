package LeetCode;
import java.util.Scanner;
public class IsomorphicString {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char ch[]=s.toCharArray();
        String test="";
        for (int i=0;i<t.length();i++)
        {
        for (int j=0;j<s.length();j++)
        {
           if (ch[i]==ch[j])
           {
            
            if (!t.contains(test)){
           ch[j]=t.charAt(i);
           }
           test+=t.charAt(i)+"";
        }
}
        }
String string=String.valueOf(ch);
// ch=ch.toString(ch);
System.out.println(ch);
    if (string.equals(t))
    return true;
    else
    return false;
}
}
