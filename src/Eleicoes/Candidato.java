package Eleicoes;

import java.time.LocalDate;

public class Candidato extends Pessoa{
	private String situacao;
	private String nomeUrna;
	private int votosTotal;
	private int numero;
	private String destVoto;
	Partido partido;

	public Candidato(String nome, String genero, LocalDate nascimento, 
			String situacao, String nomeUrna, int vT, int numero, String destVoto, Partido partido) {
		
		super(nome, genero, nascimento);
		this.destVoto = destVoto;
		this.nomeUrna = nomeUrna;
		this.numero = numero;
		this.situacao = situacao;
		this.votosTotal = vT;
		this.partido = partido;
	}
	
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public boolean ehEleito () {
		if (this.situacao.equals("Eleito"))
			return true;
		else return false;
	}
	
	public boolean ehValido () {
		if (this.destVoto.equals("Válido"))
			return true;
		else 
			return false;
	}
	
	public String getNomeUrna() {
		return nomeUrna;
	}

	public void setNomeUrna(String nomeUrna) {
		this.nomeUrna = nomeUrna;
	}

	public int getVotosTotal() {
		return this.votosTotal;
	}
	
	public int comparaNome(Candidato c2) {
		return this.getNome().compareTo(c2.getNome());
	}

	public void setVotosTotal(int votosTotal) {
		this.votosTotal = votosTotal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDestVoto() {
		return destVoto;
	}
	
	public void setDestVoto(String destVoto) {
		this.destVoto = destVoto;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + this.getNomeUrna() + " (" + this.partido.getSigla().toUpperCase() + ", " + this.votosTotal + " votos)";
	}
	
	public String shortToString() {
		String voto = "voto";

		if (this.votosTotal > 1)
			voto = "votos";

		return this.nomeUrna + " (" + this.numero + ", " + this.votosTotal + " " + voto + ")";
	}
}
