package br.com.caiorodrigues.controleocorrencias.model;

import java.io.Serializable;

public class ItemOcorrenciaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long codigo;
	private String descricao;
	private OcorrenciaModel ocorrencia;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public OcorrenciaModel getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(OcorrenciaModel ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOcorrenciaModel other = (ItemOcorrenciaModel) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

}
