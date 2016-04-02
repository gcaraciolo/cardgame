package br.unicap.cardgame.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Player {
        
    private String username;
    
    public Player(String username) {
        this.username = username;
    }

   public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "username=" + username + '}';
    }    
    
}
