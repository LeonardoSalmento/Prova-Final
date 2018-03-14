package models;

import java.util.ArrayList;

public class Noticia {
	
	private ArrayList<EstadoNoticia> estados;
	private Jornalista autor;
	private String area;
	private String informacoes;
	private String estado;
	private int contVisitas;
	private Boolean principal;
	private String cor;
	
	
	public Noticia(Jornalista autor, String area, String informacoes) {
		this.autor = autor;
		this.area = area;
		this.informacoes = informacoes;

	}
	
	
	

	public Jornalista getAutor() {
		return autor;
	}


	public void setAutor(Jornalista autor) {
		this.autor = autor;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getInformacoes() {
		return informacoes;
	}


	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getContVisitas() {
		return contVisitas;
	}


	public void setContVisitas(int contVisitas) {
		this.contVisitas = contVisitas;
	}
	
	public int retornarNumeroVisitas(){
		return this.getContVisitas();
	}

	public ArrayList<EstadoNoticia> getEstados() {
		return estados;
	}

	public Boolean getPrincipal() {
		return principal;
	}

	public String getCor() {
		return cor;
	}

	public void setEstados(ArrayList<EstadoNoticia> estados) {
		this.estados = estados;
	}

	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	
	

}
