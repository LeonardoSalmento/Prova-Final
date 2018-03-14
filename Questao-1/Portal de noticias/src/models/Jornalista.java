package models;

import java.util.ArrayList;

public class Jornalista extends Pessoa{
	
	private ArrayList<Noticia> noticias;
	
	
	public void criarNoticias(String area, String informacoes){
		Noticia noticia = new Noticia(this,area,informacoes);
		noticia.setEstado("criada");
		noticias.add(noticia);
		EstadoNoticia.criarEstadoNoticia(this, noticia, noticia.getEstado(), "data", "hora");
		
	}
	
	public void editarNoticia(Noticia noticia){
		noticia.setInformacoes("informacao");
		noticia.setEstado("prontaRevisao");
		EstadoNoticia.criarEstadoNoticia(this, noticia, noticia.getEstado(), "data", "hora");
	}
}
