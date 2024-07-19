package LeetCode;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseWordinString {
    public static void main(String[] args) {
    String word="a good  example ";
    String res="";
    String w[] = word.trim().split("\\s+");
     for (int i=0;i<w.length;i++){
//   String rev= reverseWord(w[i]);
  res=w[i]+" "+res;
}
System.out.println("result="+res);
    }
}
//public static String reverseWord(String s)
// {
//     int i=0,j=s.length()-1;
//    char ch[]= s.toCharArray();
//     while(i<j)
//     {
//         char temp=ch[i];
//         ch[i]=ch[j];
//         ch[j]=temp;
//         i++;
//         j--;
//     }
//     return String.valueOf(ch);
// }

        
