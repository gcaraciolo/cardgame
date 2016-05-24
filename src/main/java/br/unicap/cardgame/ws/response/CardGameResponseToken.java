package br.unicap.cardgame.ws.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class CardGameResponseToken {
    
    private boolean status;
    private String token;

    public CardGameResponseToken(boolean status, String token) {
        this.status = status;
        this.token = token;
    }
    
    @XmlElement
    public boolean isStatus() {
        return status;
    }
    
    @XmlElement
    public String getToken() {
        return token;
    }

}
