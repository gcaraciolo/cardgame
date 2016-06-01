package br.unicap.cardgame.util;

import br.unicap.cardgame.model.Player;
import com.google.gson.Gson;
import io.jsonwebtoken.Jwts;
import static java.lang.Integer.decode;
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
        Gson gson = new Gson();
        token = token.substring("Bearer".length()).trim();
        String decodeJson = Jwts.parser()
                .setSigningKey(Utils.APP_CLIENT_SECRET)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        Player p = gson.fromJson(decodeJson, Player.class);
        return p.getUsername();
    }
    
    public static int getUserId(String token) {
        Gson gson = new Gson();
        token = token.substring("Bearer".length()).trim();
        String decodeJson = Jwts.parser()
                .setSigningKey(Utils.APP_CLIENT_SECRET)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        Player p = gson.fromJson(decodeJson, Player.class);
        return p.getId();
    }
}
