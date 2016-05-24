/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.cardgame.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gcaraciolo
 */
@Entity
@Table(name = "decks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Decks.findAll", query = "SELECT d FROM Decks d"),
    @NamedQuery(name = "Decks.findById", query = "SELECT d FROM Decks d WHERE d.id = :id")})
public class Decks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @OneToMany(mappedBy = "deckId")
    private Collection<DecksCards> decksCardsCollection;
    @OneToMany(mappedBy = "deckId")
    private Collection<Chars> charsCollection;

    public Decks() {
    }

    public Decks(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<DecksCards> getDecksCardsCollection() {
        return decksCardsCollection;
    }

    public void setDecksCardsCollection(Collection<DecksCards> decksCardsCollection) {
        this.decksCardsCollection = decksCardsCollection;
    }

    @XmlTransient
    public Collection<Chars> getCharsCollection() {
        return charsCollection;
    }

    public void setCharsCollection(Collection<Chars> charsCollection) {
        this.charsCollection = charsCollection;
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
        if (!(object instanceof Decks)) {
            return false;
        }
        Decks other = (Decks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unicap.cardgame.model.Decks[ id=" + id + " ]";
    }
    
}
