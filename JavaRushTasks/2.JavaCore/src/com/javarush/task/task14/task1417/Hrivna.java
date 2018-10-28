package com.javarush.task.task14.task1417;

/**
 * Created by Lezhachev on 26.09.2018.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
