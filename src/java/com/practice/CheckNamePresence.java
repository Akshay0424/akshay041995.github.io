package com.practice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNamePresence {

    public static void main(String args[])
    {
        CheckNamePresence obj = new CheckNamePresence();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        Boolean flag = obj.nameCheck(str);
        System.out.println("Is Harry here? "+ flag);

    }

    public Boolean nameCheck(String str) {
        Pattern pattern = Pattern.compile(".*Harry");
        Matcher m = pattern.matcher(str);
        if(m.find()){
            return true;
        }
        else
            return false;
    }
}
