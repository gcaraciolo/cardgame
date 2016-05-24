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
@Table(name = "questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findById", query = "SELECT q FROM Questions q WHERE q.id = :id"),
    @NamedQuery(name = "Questions.findByText", query = "SELECT q FROM Questions q WHERE q.text = :text")    
})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "text")
    private String text;
    @OneToMany(mappedBy = "questionId")
    private Collection<Cards> cardsCollection;
    @JoinColumn(name = "answer1_id", referencedColumnName = "id")
    @ManyToOne
    private Answers answer1Id;
    @JoinColumn(name = "answer2_id", referencedColumnName = "id")
    @ManyToOne
    private Answers answer2Id;
    @JoinColumn(name = "answer3_id", referencedColumnName = "id")
    @ManyToOne
    private Answers answer3Id;
    @JoinColumn(name = "answer4_id", referencedColumnName = "id")
    @ManyToOne
    private Answers answer4Id;
    @JoinColumn(name = "correct_answer_id", referencedColumnName = "id")
    @ManyToOne
    private Answers correctAnswerId;
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    @ManyToOne
    private Subjects subjectId;

    public Questions() {
    }

    public Questions(Integer id) {
        this.id = id;
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
    public Collection<Cards> getCardsCollection() {
        return cardsCollection;
    }

    public void setCardsCollection(Collection<Cards> cardsCollection) {
        this.cardsCollection = cardsCollection;
    }

    public Answers getAnswer1Id() {
        return answer1Id;
    }

    public void setAnswer1Id(Answers answer1Id) {
        this.answer1Id = answer1Id;
    }

    public Answers getAnswer2Id() {
        return answer2Id;
    }

    public void setAnswer2Id(Answers answer2Id) {
        this.answer2Id = answer2Id;
    }

    public Answers getAnswer3Id() {
        return answer3Id;
    }

    public void setAnswer3Id(Answers answer3Id) {
        this.answer3Id = answer3Id;
    }

    public Answers getAnswer4Id() {
        return answer4Id;
    }

    public void setAnswer4Id(Answers answer4Id) {
        this.answer4Id = answer4Id;
    }

    public Answers getCorrectAnswerId() {
        return correctAnswerId;
    }

    public void setCorrectAnswerId(Answers correctAnswerId) {
        this.correctAnswerId = correctAnswerId;
    }

    public Subjects getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subjects subjectId) {
        this.subjectId = subjectId;
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
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unicap.cardgame.model.Questions[ id=" + id + " ]";
    }
    
}
