package br.com.caiorodrigues.controleocorrencias.controller;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caiorodrigues.controleocorrencias.model.OcorrenciaModel;
import br.com.caiorodrigues.controleocorrencias.model.enums.ComplexidadeOcorrenciaEnum;
import br.com.caiorodrigues.controleocorrencias.model.enums.StatusOcorrenciaEnum;
import br.com.caiorodrigues.controleocorrencias.model.enums.TipoOcorrenciaEnum;
import br.com.caiorodrigues.controleocorrencias.repository.UsuarioRepository;

@Named
@ViewScoped
public class CadastroOcorrenciaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioRepository usuarios;
	
	
	@Produces
	private OcorrenciaModel ocorrencia;
	
	public CadastroOcorrenciaController() {
		limpar();
	}
	
	private void limpar() {
		ocorrencia = new OcorrenciaModel();
	}

	
	
	public OcorrenciaModel getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(OcorrenciaModel ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public TipoOcorrenciaEnum[] getTipoOcorrenciaEnum(){
		return TipoOcorrenciaEnum.values();
	}
	
	public StatusOcorrenciaEnum[] getStatusOcorrenciaEnum(){
		return StatusOcorrenciaEnum.values();
	}
	
	public ComplexidadeOcorrenciaEnum[] getComplexidadeOcorrenciaEnum(){
		return ComplexidadeOcorrenciaEnum.values();
	}
}
