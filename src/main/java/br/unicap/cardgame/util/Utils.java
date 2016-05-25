package br.unicap.cardgame.util;

import io.jsonwebtoken.Jwts;
import java.util.Random;

public class Utils {
    
    public final static String APP_CLIENT_SECRET = "dsa314asdarr";
    
    public static int getRandomNumber(int min, int max) {
        try {
            Random random = new Random();
            int number = min + random.nextInt((max - 1) - min);
            return number;
        } catch(Exception e) {            
        }
        return 0;
    }
    
    public static String getUsername(String token) {
        token = token.substring("Bearer".length()).trim();
        String decode = Jwts.parser()
                .setSigningKey(Utils.APP_CLIENT_SECRET)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        return decode;
                
    }
}
