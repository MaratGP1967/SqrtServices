package ru.netology.sqr.SqrtServices.services;

public class SQRService {
    public int calculate(int lowerRange, int upperRange) {
        int numNum = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerRange & i * i <= upperRange) {
                numNum++;
            }
        }
        return numNum;
    }
}
