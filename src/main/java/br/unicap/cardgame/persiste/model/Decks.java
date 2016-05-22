package br.unicap.cardgame.persiste.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "decks")
public class Decks implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int codcarta;
	private int coddeck;

	public int getCodcarta() {
		return codcarta;
	}

	public void setCodcarta(int codcarta) {
		this.codcarta = codcarta;
	}

	public int getCoddeck() {
		return coddeck;
	}

	public void setCoddeck(int coddeck) {
		this.coddeck = coddeck;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codcarta;
		result = prime * result + coddeck;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Decks other = (Decks) obj;
		if (codcarta != other.codcarta)
			return false;
		if (coddeck != other.coddeck)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Decks [codcarta=" + codcarta + ", coddeck=" + coddeck + "]";
	}

}
