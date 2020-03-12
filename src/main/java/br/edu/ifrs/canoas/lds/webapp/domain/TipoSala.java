package br.edu.ifrs.canoas.lds.webapp.domain;

public enum TipoSala {
	
	AUDITORIO("Aditoriao"),SALA("Sala"),LABORATORIO("Laboratorio"),GINASIO("Ginásio");
	
	private String tipo;
	
	TipoSala(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
}
