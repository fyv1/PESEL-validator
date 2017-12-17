package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj PESEL");

        try {
         String pesel = sc.next();
         Length(pesel);
         containsDigits(pesel);
        } catch (IllegalArgumentException ex)
        {
            throw new IllegalArgumentException(ex);
        }
    }

    public static void containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for(int i=0; i<peselAr.length;i++)
            if((int)peselAr[i] < 48 || (int)peselAr[i] > 57)
                throw new IllegalArgumentException("Podano litere zamiast cyfry");

    }

    public static void Length(String pesel) {
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalArgumentException("PESEL musi zawierac 11 liczb");
        }
    }
}
