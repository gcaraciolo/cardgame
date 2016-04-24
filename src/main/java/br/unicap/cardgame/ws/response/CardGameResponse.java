package br.unicap.cardgame.ws.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class CardGameResponse {
    
    private boolean status;
    private int code;
    private Object msg;

    public CardGameResponse(boolean status, int code, Object msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }
    
    @XmlElement
    public boolean isStatus() {
        return status;
    }
    
    @XmlElement
    public int getCode() {
        return code;
    }

    @XmlElement
    public Object getMsg() {
        return msg;
    }
}
