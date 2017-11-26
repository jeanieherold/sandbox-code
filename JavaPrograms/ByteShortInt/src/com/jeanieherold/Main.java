package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte)(myMaxByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has awidth of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

        //Challenge
        byte bnum1 = 23;
        short snum2 = 153;
        int inum3 = 777;
        long lnum4 = 50000L + (long)(10 * ((int)(bnum1) + (int)(snum2) + inum3));
        System.out.println("long variable = " + lnum4);

        //Challenge answer - didnt need to cast everything for long math - arithmetic auto converts to int
        //long will accept integer values
        long longTotal = 50000L + 10L * (bnum1 + snum2 + inum3);
        System.out.println("longTotal = " + longTotal);

        //if doing short math
        short shortTotal = (short) (1000 + 10 * (bnum1 + snum2 + inum3));
        System.out.println("shortTotal = " + shortTotal);
    }
}
