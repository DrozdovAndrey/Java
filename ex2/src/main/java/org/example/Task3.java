package org.example;
/*
Напишите метод,
который принимает на вход строку (String) и
определяет является ли строка палиндромом
(возвращает boolean значение).
 */


public class Task3 {
    public static boolean polindrom(String str){
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        return (reverse.toString().equals(str));
    }
    public static void main(String[] args) {
        String str1 = "aabaa";
        String str2 = "aabaaa";
        System.out.println(polindrom(str1));
        System.out.println(polindrom(str2));
    }
}
