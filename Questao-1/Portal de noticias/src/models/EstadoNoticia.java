package models;

public class EstadoNoticia {
	private Noticia noticia;
	private Pessoa pessoa;
	private String estado;
	private String data;
	private String hora;
	
	public static void criarEstadoNoticia(Pessoa pessoa, Noticia noticia, String estado, String data, String hora){
		EstadoNoticia estadoNoticia = new EstadoNoticia();
		estadoNoticia.pessoa = pessoa;
		estadoNoticia.noticia = noticia;
		estadoNoticia.estado = estado;
		estadoNoticia.data = data;
		estadoNoticia.hora = hora;
		
		noticia.getEstados().add(estadoNoticia);
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getEstado() {
		return estado;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}
	
}
