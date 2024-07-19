package LeetCode;
import java.util.*;
public class ColumnToName {
    public static void main(String[] args) {
        String cName="ZY";
        int cNum=0;
        String val="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       int l=cName.length();
       int k=0;
        while(l>0)
        {
            cNum=cNum+((int)Math.pow(26, l-1))*(val.indexOf(cName.charAt(k))+1);
            l--;
            k++;
    }
    System.out.println(cNum);
}
}
