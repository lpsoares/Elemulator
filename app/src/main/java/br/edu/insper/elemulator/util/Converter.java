package br.edu.insper.elemulator.util;

public class Converter {

    public int booleanToInt(boolean[] a) {
        String s = "";

        for (int i = a.length-1; i>=0; i--) {
            if (a[i] == false) s+='0';
            else if (a[i] == true) s+='1';
        }

        int decimal = Integer.parseInt(s, 2);

        return decimal;
    }

    public boolean[] intToBoolean(int decimal) {
        boolean[] a = new boolean[16];
        String s = Integer.toBinaryString(decimal);

        for (int j = 0; j<s.length();j++) {
            if (s.charAt(j)=='0') a[s.length()-1-j] = false;
            else if (s.charAt(j)=='1') a[s.length()-1-j] = true;
        }

        return a;
    }

    public String booleanToString(boolean[] a) {
        String s = "";

        for (int i = a.length-1; i>=0; i--) {
            if (a[i] == false) s+='0';
            else if (a[i] == true) s+='1';
        }

        return s;
    }

    public boolean[] stringToBoolean (String s) {
        boolean[] a = new boolean[16];

        for (int j = 0; j<s.length();j++) {
            if (s.charAt(j)=='0') a[s.length()-1-j] = false;
            else if (s.charAt(j)=='1') a[s.length()-1-j] = true;
        }

        return a;
    }

}
