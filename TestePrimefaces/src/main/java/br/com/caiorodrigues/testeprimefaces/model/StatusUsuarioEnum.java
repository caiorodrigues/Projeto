package model;

public enum StatusUsuarioEnum {
	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	StatusUsuarioEnum(String descricao){
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao(){
		return descricao;
	}
}
