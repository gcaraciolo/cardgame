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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gcaraciolo
 */
@Entity
@Table(name = "answers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Answers.findAll", query = "SELECT a FROM Answers a"),
    @NamedQuery(name = "Answers.findById", query = "SELECT a FROM Answers a WHERE a.id = :id"),
    @NamedQuery(name = "Answers.findByText", query = "SELECT a FROM Answers a WHERE a.text = :text")})
public class Answers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "text")
    private String text;
    @OneToMany(mappedBy = "answer1Id")
    private Collection<Questions> questionsCollection;
    @OneToMany(mappedBy = "answer2Id")
    private Collection<Questions> questionsCollection1;
    @OneToMany(mappedBy = "answer3Id")
    private Collection<Questions> questionsCollection2;
    @OneToMany(mappedBy = "answer4Id")
    private Collection<Questions> questionsCollection3;
    @OneToMany(mappedBy = "correctAnswerId")
    private Collection<Questions> questionsCollection4;

    public Answers() {
    }

    public Answers(Integer id) {
        this.id = id;
    }

    public Answers(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @XmlTransient
    public Collection<Questions> getQuestionsCollection() {
        return questionsCollection;
    }

    public void setQuestionsCollection(Collection<Questions> questionsCollection) {
        this.questionsCollection = questionsCollection;
    }

    @XmlTransient
    public Collection<Questions> getQuestionsCollection1() {
        return questionsCollection1;
    }

    public void setQuestionsCollection1(Collection<Questions> questionsCollection1) {
        this.questionsCollection1 = questionsCollection1;
    }

    @XmlTransient
    public Collection<Questions> getQuestionsCollection2() {
        return questionsCollection2;
    }

    public void setQuestionsCollection2(Collection<Questions> questionsCollection2) {
        this.questionsCollection2 = questionsCollection2;
    }

    @XmlTransient
    public Collection<Questions> getQuestionsCollection3() {
        return questionsCollection3;
    }

    public void setQuestionsCollection3(Collection<Questions> questionsCollection3) {
        this.questionsCollection3 = questionsCollection3;
    }

    @XmlTransient
    public Collection<Questions> getQuestionsCollection4() {
        return questionsCollection4;
    }

    public void setQuestionsCollection4(Collection<Questions> questionsCollection4) {
        this.questionsCollection4 = questionsCollection4;
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
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unicap.cardgame.model.Answers[ id=" + id + " ]";
    }
    
}
