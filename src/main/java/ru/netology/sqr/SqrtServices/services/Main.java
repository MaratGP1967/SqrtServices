package ru.netology.sqr.SqrtServices.services;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int down = 200;
        int up = 300;

        int nuNum = service.calculate(down, up);

        System.out.println(nuNum);
    }
}