package com.practice;
import java.util.*;

public class CharReplace {

    public String replaceChar(String str)
    {
        str=str.replaceAll("d","f");
        String str2=str.replaceAll("l","t");

        return str2;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        CharReplace obj=new CharReplace();
        String str2=obj.replaceChar(s);
        System.out.print(str2);
    }
}
