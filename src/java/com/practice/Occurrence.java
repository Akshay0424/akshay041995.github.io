package com.practice;
import java.util.*;

public class Occurrence {

        public int charCount(String str,char char1)
        {
            int result = str.length() - str.replaceAll(String.valueOf(char1), "").length();
            return result;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            Character char2=sc.next().charAt(0);
            Occurrence obj=new Occurrence();
            int result=obj.charCount(s,char2);
            System.out.print(result);
        }

}
