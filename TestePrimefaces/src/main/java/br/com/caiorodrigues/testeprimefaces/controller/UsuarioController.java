package br.com.caiorodrigues.testeprimefaces.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caiorodrigues.testeprimefaces.util.jsf.FacesUtil;
import br.com.caiorodrigues.testeprimefaces.model.UsuarioModel;

@Named
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	UsuarioModel usuario;
	
	List<UsuarioModel> usuarioList;
		
	@PostConstruct
	public void init(){
		System.out.println("PostConstruct Init:");
		
		if(usuarioList == null){
			usuarioList = new ArrayList<UsuarioModel>();			
		}
		
		limpar();
	}
	
	/*public void inicializar() {
		System.out.println("Inicializar: ");
		if (FacesUtil.isNotPostback()) {
			System.out.println("Inicializar isnotpostback:");
		}
	}*/

	private void limpar() {
		usuario = new UsuarioModel();		
	}
	
	public void salvar(){
		System.out.println(
				"Código: " + usuario.getCodigo() + 
				" \nNome: " + usuario.getNome() + 
				" \nE-mail: " + usuario.getEmail() + 
				" \nSenha: " + usuario.getSenha() + 
				" \nStatus: " + usuario.getStatus().getDescricao());
		
		usuarioList.add(usuario);
		
		limpar();
		
		FacesUtil.addInfoMessage("Usuário salvo com sucesso!");
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public List<UsuarioModel> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<UsuarioModel> usuarioList) {
		this.usuarioList = usuarioList;
	}
}	
