package br.com.caiorodrigues.controleocorrencias.model.enums;

public enum TipoOcorrenciaEnum {
	INSTALACAO("Instalação"),
	MANUTENCAO_SOFTWARE("Manutenção de software"),
	MANUTENCAO_HARDWARE("Manutenção de hardware"),
	MANUTENCAO_REDE("Manutenção de rede"),
	SUPORTE_SOFTWARE("Suporte a software"),
	SUPORTE_HARDWARE("Suporte a hardware"),
	SUPORTE_REDE("Suporte à rede"),
	SUPORTE_USUARIO("Suporte ao usuário");
	
	private String descricao;

	private TipoOcorrenciaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
