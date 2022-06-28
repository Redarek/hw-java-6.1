package ru.netology.sqr;

public class SQRService {
    public int calculateNumberOfSqrt(int min, int max) {
        int count = 0;
        for (int i = 0; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                count++;
            }
        }
        return count;
    }
}
