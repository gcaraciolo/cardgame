package br.unicap.cardgame.jax.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GameStatusJAXBean {
    
    @XmlElement(name="username")
    public String username;
    
}
