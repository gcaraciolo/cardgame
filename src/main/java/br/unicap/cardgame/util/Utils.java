package br.unicap.cardgame.util;

import java.util.Random;

public class Utils {
    
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt((max - min) + 1);
    }
    
}
