package br.com.caiorodrigues.controleocorrencias.model.enums;

public enum StatusOcorrenciaEnum {
	ABERTA("Aberta"),
	EM_ANDAMENTO("Em andamento"),
	CONCLUIDA("Concluída"),
	AGUARDANDO_USUARIO("Aguardando usuário"),
	AGUARDANDO_SUPORTE("Aguardando suporte"),
	FINALIZADA("Finalizada"),
	CANCELADA("Cancelada"),
	REABERTA("Reaberta");
	
	StatusOcorrenciaEnum(String descricao){
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao(){
		return descricao;
	}
}
