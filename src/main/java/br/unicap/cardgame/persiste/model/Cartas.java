package br.unicap.cardgame.persiste.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartas")
public class Cartas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private String pergunta;
	private String resp1;
	private String resp2;
	private String resp3;
	private String resp4;
	private String materia;
	private int ataque;
	private int defesa;
	private int vida;
	private int certa;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResp1() {
		return resp1;
	}
	public void setResp1(String resp1) {
		this.resp1 = resp1;
	}
	public String getResp2() {
		return resp2;
	}
	public void setResp2(String resp2) {
		this.resp2 = resp2;
	}
	public String getResp3() {
		return resp3;
	}
	public void setResp3(String resp3) {
		this.resp3 = resp3;
	}
	public String getResp4() {
		return resp4;
	}
	public void setResp4(String resp4) {
		this.resp4 = resp4;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getCerta() {
		return certa;
	}
	public void setCerta(int certa) {
		this.certa = certa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ataque;
		result = prime * result + certa;
		result = prime * result + cod;
		result = prime * result + defesa;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		result = prime * result + ((pergunta == null) ? 0 : pergunta.hashCode());
		result = prime * result + ((resp1 == null) ? 0 : resp1.hashCode());
		result = prime * result + ((resp2 == null) ? 0 : resp2.hashCode());
		result = prime * result + ((resp3 == null) ? 0 : resp3.hashCode());
		result = prime * result + ((resp4 == null) ? 0 : resp4.hashCode());
		result = prime * result + vida;
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
		Cartas other = (Cartas) obj;
		if (ataque != other.ataque)
			return false;
		if (certa != other.certa)
			return false;
		if (cod != other.cod)
			return false;
		if (defesa != other.defesa)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (pergunta == null) {
			if (other.pergunta != null)
				return false;
		} else if (!pergunta.equals(other.pergunta))
			return false;
		if (resp1 == null) {
			if (other.resp1 != null)
				return false;
		} else if (!resp1.equals(other.resp1))
			return false;
		if (resp2 == null) {
			if (other.resp2 != null)
				return false;
		} else if (!resp2.equals(other.resp2))
			return false;
		if (resp3 == null) {
			if (other.resp3 != null)
				return false;
		} else if (!resp3.equals(other.resp3))
			return false;
		if (resp4 == null) {
			if (other.resp4 != null)
				return false;
		} else if (!resp4.equals(other.resp4))
			return false;
		if (vida != other.vida)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cartas [cod=" + cod + ", pergunta=" + pergunta + ", resp1=" + resp1 + ", resp2=" + resp2 + ", resp3="
				+ resp3 + ", resp4=" + resp4 + ", materia=" + materia + ", ataque=" + ataque + ", defesa=" + defesa
				+ ", vida=" + vida + ", certa=" + certa + "]";
	}
	
	
}