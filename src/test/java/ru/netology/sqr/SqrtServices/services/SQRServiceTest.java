package ru.netology.sqr.SqrtServices.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //        "3,200,300",  //попало несколько
    //        "1,100,120",   // попал один
    //        "90,100,9_801", //попали все
    //        "0,10,90",      // не попали для ниже 10
    //        "0,9_802,10_000" //не попали для выше 99
    //})
    @CsvFileSource(files = "src/test/resources/SqrtSource.csv")
    public void testDownUpRange(int expected, int down, int up) {
        SQRService service = new SQRService();
        // int down = 200;
        // int up = 300;
        // int expected = 3;

        int actual = service.calculate(down, up);

        Assertions.assertEquals(expected, actual);
    }
}
