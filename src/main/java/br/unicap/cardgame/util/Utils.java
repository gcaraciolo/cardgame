package br.unicap.cardgame.util;

import java.util.Random;

public class Utils {
    
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        int number = min + random.nextInt((max - 1) - min);
        return number;
    }
    
}
