package models;

public class Editor extends Pessoa{
	private String area;
	
	
	
	public String revisarNoticia(Noticia noticia){
		if (this.area.equals(noticia.getArea())){
			noticia.setEstado("aprovada");
			EstadoNoticia.criarEstadoNoticia(this, noticia, noticia.getEstado(), "data", "hora");
			return "noticia aprovada";
		}
		return "editor e noticia de areas diferentes.";
	}
	
	public String desativaNoticia(Noticia noticia){
		if (this.area.equals(noticia.getArea())){
			noticia.setEstado("desativada");
			noticia.setContVisitas(0);
			EstadoNoticia.criarEstadoNoticia(this, noticia, noticia.getEstado(), "data", "hora");
			return "noticia desativada";
		}
		return "editor e noticia de areas diferentes.";
	}
	
	
}
