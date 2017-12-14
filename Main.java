package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Podaj PESEL");
        String pesel = sc.next();

        if(String.valueOf(pesel).length() != 11) {
            NotElevenDigits e = new NotElevenDigits("PESEL musi zawierac 11 liczb");
            throw e;
        }
        if(!containsDigits(pesel)){
            CharsFounded e = new CharsFounded("Podano litere zamiast cyfry");
            throw e;
        }
    }
    catch(NotElevenDigits e) {
        e.printStackTrace();
    }
    catch(CharsFounded e) {
        e.printStackTrace();
    }

    }

    public static boolean containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for(int i=0; i<peselAr.length;i++)
            if((int)peselAr[i] < 48 || (int)peselAr[i] > 57) return false;
        return true;
    }
}
