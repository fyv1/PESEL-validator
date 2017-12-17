package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj PESEL");

        PeselValidator pv = new PeselValidator(sc.next());

        if(pv.isCorrect(pv.getPesel())) System.out.println("PESEL poprawny");

    }


}
