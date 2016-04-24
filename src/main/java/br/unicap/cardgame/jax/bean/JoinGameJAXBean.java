package br.unicap.cardgame.jax.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JoinGameJAXBean {

    @XmlElement(name="username")
    public String username;
    
    @XmlElement(name="age")
    public int age;
        
}
