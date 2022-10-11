package com.lab2.currencycounter;

public class CashCounter {
    public void countCurrency(int amount,int[]currencyNotes, int size) {

        int[]noteCounter =new int[size];

        for (int i = size; i >0; i--) {
            if (amount >= currencyNotes[i-1]) {
                noteCounter[i-1] = amount /currencyNotes[i-1];
                amount = amount % currencyNotes[i-1];
            }
        }
        System.out.println("\nYour payment approach in order to give minimum number of notes will be ");
        for (int i = size; i >0; i--) {
            if (noteCounter[i-1] != 0) {
                System.out.println(currencyNotes[i-1] + " : "+ noteCounter[i-1]);
            }
        }
    }
}

