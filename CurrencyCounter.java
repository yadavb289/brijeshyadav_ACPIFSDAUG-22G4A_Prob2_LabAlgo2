package com.lab2.currencycounter;
import java.util.*;

public class CurrencyCounter {

    public static void main(String[] args)  {

        MergeSorting mergeSorting = new MergeSorting();
        CashCounter cashCounter=new CashCounter();

        System.out.println("Enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] currencyNotes = new int[size];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            currencyNotes[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();

        mergeSorting.divide(currencyNotes, 0, size - 1);
        cashCounter.countCurrency(amount,currencyNotes,size);

    }
}

