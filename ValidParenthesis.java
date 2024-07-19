package LeetCode;
import java.util.*;
public class ValidParenthesis
{
    public static void main(String[] args) {
        String s = "{([{}])}";
    int par=0;
    int square=0;
    int culr=0;
    for (int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
        par++;
        else if(s.charAt(i)==')' && s.charAt(i-1)=='(')
        par--;
        else if (s.charAt(i)=='['  )
        square++;
        else if (s.charAt(i)==']' && s.charAt(i-1)=='[')
        square--;
        else if (s.charAt(i)=='{')
        culr++;
        else if (s.charAt(i)=='}' && s.charAt(i-1)=='{')
        culr--;
    }
    if(par==0&&square==0&&culr==0)
    System.out.println("true");
    else
    System.out.println("false");
}
}