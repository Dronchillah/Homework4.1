package ua.lvlup.Andrey;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        multiTableOutput1(1);
        multiTableOutput1(2);
        symbol("Pizza", 2);
        aToEChanger("ее");
        reverseSubstr("123456789",3, 6);
    }

    public static void multiTableOutput1(int taskNumber) {
        if (taskNumber == 1) {
            System.out.println("First task:");
        } else if (taskNumber == 2) {
            System.out.println("Second task");
        } else {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (taskNumber == 1) {
                    System.out.printf("%d x %d = %d     ", j, i, i * j);
                } else if (taskNumber == 2) {
                    System.out.printf("%d x %d = %d     ", i, j, i * j);
                }
            }
            System.out.println("");
        }


    }

   /* public static void aToEChanger(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                builder.append('a');
            }else{
                builder.append(str.charAt(i));
            }
        }
        System.out.println(builder);
    }*/

    public static void aToEChanger(String str){
        System.out.println(str.replaceAll("е", "а"));
    }

    public static void symbol(String word, int position){
        System.out.println("Third task");
        System.out.println(word.charAt(position - 1));
        System.out.println("Fourth task");
        StringBuilder builder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            builder.append(word.charAt(i));
        }
        System.out.println(builder);

    }

    public static void reverseSubstr(String string, int pos1, int pos2){
        StringBuilder builder = new StringBuilder(string.substring(pos1-1, pos2-1));
        builder.reverse();
        System.out.println(builder);
        String temp = string.substring(pos2 -1);
        builder.append(temp);
        builder.insert(0, string, 0,pos1 -1 );
        System.out.println(builder);
    }

}

