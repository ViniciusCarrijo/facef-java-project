package br.edu.facef.model;

public class Cliente {
	private Long id;
	private String nome;
	private String cidade;
	private String estado;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", estado=" + estado + ", getId()="
				+ getId() + ", getNome()=" + getNome() + ", getCidade()=" + getCidade() + ", getEstado()=" + getEstado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}	
}
