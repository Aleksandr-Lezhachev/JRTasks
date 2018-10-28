package com.javarush.task.task14.task1417;

/**
 * Created by Lezhachev on 26.09.2018.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
