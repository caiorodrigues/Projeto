package br.com.caiorodrigues.controleocorrencias.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.caiorodrigues.controleocorrencias.model.enums.ComplexidadeOcorrenciaEnum;
import br.com.caiorodrigues.controleocorrencias.model.enums.StatusOcorrenciaEnum;
import br.com.caiorodrigues.controleocorrencias.model.enums.TipoOcorrenciaEnum;

public class OcorrenciaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigo;
	private TipoOcorrenciaEnum tipoOcorrencia;
	private String descricao;
	private StatusOcorrenciaEnum statusOcorrencia;
	private UsuarioModel usuarioAbertura;
	private UsuarioModel usuarioAtendimento;
	private Date dataHoraInicio;
	private Date dataHoraConclusao;
	private ComplexidadeOcorrenciaEnum complexidadeOcorrencia;
	private List<ItemOcorrenciaModel> itens = new ArrayList<>();

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public TipoOcorrenciaEnum getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(TipoOcorrenciaEnum tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusOcorrenciaEnum getStatusOcorrencia() {
		return statusOcorrencia;
	}

	public void setStatusOcorrencia(StatusOcorrenciaEnum statusOcorrencia) {
		this.statusOcorrencia = statusOcorrencia;
	}

	public UsuarioModel getUsuarioAbertura() {
		return usuarioAbertura;
	}

	public void setUsuarioAbertura(UsuarioModel usuarioAbertura) {
		this.usuarioAbertura = usuarioAbertura;
	}

	public UsuarioModel getUsuarioAtendimento() {
		return usuarioAtendimento;
	}

	public void setUsuarioAtendimento(UsuarioModel usuarioAtendimento) {
		this.usuarioAtendimento = usuarioAtendimento;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraConclusao() {
		return dataHoraConclusao;
	}

	public void setDataHoraConclusao(Date dataHoraConclusao) {
		this.dataHoraConclusao = dataHoraConclusao;
	}

	public ComplexidadeOcorrenciaEnum getComplexidadeOcorrencia() {
		return complexidadeOcorrencia;
	}

	public void setComplexidadeOcorrencia(
			ComplexidadeOcorrenciaEnum complexidadeOcorrencia) {
		this.complexidadeOcorrencia = complexidadeOcorrencia;
	}

	public List<ItemOcorrenciaModel> getItens() {
		return itens;
	}

	public void setItens(List<ItemOcorrenciaModel> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		OcorrenciaModel other = (OcorrenciaModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
