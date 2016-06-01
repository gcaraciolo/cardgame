package br.unicap.cardgame.jax.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ChangeCharJAXBean {

    @XmlElement(name="char_id")
    public int charId;
    
}

