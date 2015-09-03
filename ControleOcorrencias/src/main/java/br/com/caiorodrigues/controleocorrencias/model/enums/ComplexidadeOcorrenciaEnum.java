package br.com.caiorodrigues.controleocorrencias.model.enums;

public enum ComplexidadeOcorrenciaEnum {
	FACIL("Fácil"),
	MODERADA("Moderada"),
	COMPLEXA("Complexa"),
	EXTRAMAMENTE_COMPLEXA("Extremamente complexa");
	
	ComplexidadeOcorrenciaEnum(String descricao){
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao(){
		return descricao;
	}
}
