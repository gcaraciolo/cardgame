package br.unicap.cardgame.ws.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlayGameJAXBean {
       
    @XmlElement(name="answer_id")
    public int answerID;
}
