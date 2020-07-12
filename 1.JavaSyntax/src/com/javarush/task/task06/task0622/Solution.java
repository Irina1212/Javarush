package com.javarush.task.task06.task0622;

//import sun.security.mscapi.CPublicKey;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        if (a>b){
            int i = a;
            a=b;
            b=i;
        }
        if (a>c){
            int i = a;
            a=c;
            c=i;
        }
        if (a>d){
            int i = a;
            a=d;
            d=i;
        }
        if (a>e){
            int i = a;
            a=e;
            e=i;
        }
        if (b>c){
            int i = b;
            b=c;
            c=i;
        }
        if (b>d){
            int i = b;
            b=d;
            d=i;
        }
        if (b>e){
            int i = b;
            b=e;
            e=i;
        }
        if (c>d){
            int i = c;
            c=d;
            d=i;
        }
        if (c>e){
            int i = c;
            c=e;
            e=i;
        }
        if (d>e){
            int i = d;
            d=e;
            e=i;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
