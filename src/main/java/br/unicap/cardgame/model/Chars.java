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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gcaraciolo
 */
@Entity
@Table(name = "chars")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chars.findAll", query = "SELECT c FROM Chars c"),
    @NamedQuery(name = "Chars.findById", query = "SELECT c FROM Chars c WHERE c.id = :id"),
    @NamedQuery(name = "Chars.findByName", query = "SELECT c FROM Chars c WHERE c.name = :name")    
})
public class Chars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "deck_id", referencedColumnName = "id")
    @ManyToOne
    private Decks deckId;
    @OneToMany(mappedBy = "charId")
    private Collection<Users> usersCollection;

    public Chars() {
    }

    public Chars(Integer id) {
        this.id = id;
    }

    public Chars(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Decks getDeckId() {
        return deckId;
    }

    public void setDeckId(Decks deckId) {
        this.deckId = deckId;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
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
        if (!(object instanceof Chars)) {
            return false;
        }
        Chars other = (Chars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unicap.cardgame.model.Chars[ id=" + id + " ]";
    }
    
}
