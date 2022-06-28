package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/minAndMaxOfSquare.csv")
    public void testCalculateNumberOfSqrt(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calculateNumberOfSqrt(min, max);

        Assertions.assertEquals(expected, actual);
    }
}

