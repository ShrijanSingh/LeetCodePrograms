package LeetCode;
import java.util.*;
public class UniqueEmailAddress{
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
      for (int i=0;i<emails.length;i++)
      {
        if (emails[i].contains('@'))
        {
            j