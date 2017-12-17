package com.company;

public class PeselValidator {
    private String Pesel;

    PeselValidator(String Pesel) {
        this.Pesel = Pesel;
    }

    public String getPesel() {
        return Pesel;
    }
    public boolean isCorrect(String Pesel) {

        try {
            containsDigits(Pesel);
            Length(Pesel);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    private void containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for(int i=0; i<peselAr.length;i++)
            if((int)peselAr[i] < 48 || (int)peselAr[i] > 57)
                throw new IllegalArgumentException("Podano litere zamiast cyfry");

    }

    private void Length(String pesel) {
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalArgumentException("PESEL musi zawierac 11 liczb");
        }
    }
}
