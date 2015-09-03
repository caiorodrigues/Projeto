package br.com.caiorodrigues.controleocorrencias.repository.filter;

import java.io.Serializable;

public class UsuarioFilter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigoDe;
	private Long codigoAte;
	private String nomeUsuario;

	public Long getCodigoDe() {
		return codigoDe;
	}

	public void setCodigoDe(Long codigoDe) {
		this.codigoDe = codigoDe;
	}

	public Long getCodigoAte() {
		return codigoAte;
	}

	public void setCodigoAte(Long codigoAte) {
		this.codigoAte = codigoAte;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

}
