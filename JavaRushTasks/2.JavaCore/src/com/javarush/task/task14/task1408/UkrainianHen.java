package com.javarush.task.task14.task1408;

public class  UkrainianHen extends Hen implements Country{

    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}