package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj PESEL");
        String pesel = sc.next();

        if(String.valueOf(pesel).length() != 11) {
            throw new Exception("PESEL musi zawierac 11 liczb");
        }
        if(!containsDigits(pesel)){
            throw new Exception("Podano litere zamiast cyfry");
        }

    }

    public static boolean containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for(int i=0; i<peselAr.length;i++)
            if((int)peselAr[i] < 48 || (int)peselAr[i] > 57) return false;
        return true;
    }
}
