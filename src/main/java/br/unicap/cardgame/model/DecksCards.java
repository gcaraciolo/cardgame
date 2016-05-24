/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.cardgame.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gcaraciolo
 */
@Entity
@Table(name = "decks_cards")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecksCards.findAll", query = "SELECT d FROM DecksCards d"),
    @NamedQuery(name = "DecksCards.findById", query = "SELECT d FROM DecksCards d WHERE d.id = :id")})
public class DecksCards implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    @ManyToOne
    private Cards cardId;
    @JoinColumn(name = "deck_id", referencedColumnName = "id")
    @ManyToOne
    private Decks deckId;

    public DecksCards() {
    }

    public DecksCards(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cards getCardId() {
        return cardId;
    }

    public void setCardId(Cards cardId) {
        this.cardId = cardId;
    }

    public Decks getDeckId() {
        return deckId;
    }

    public void setDeckId(Decks deckId) {
        this.deckId = deckId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecksCards)) {
            return false;
        }
        DecksCards other = (DecksCards) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unicap.cardgame.model.DecksCards[ id=" + id + " ]";
    }
    
}
