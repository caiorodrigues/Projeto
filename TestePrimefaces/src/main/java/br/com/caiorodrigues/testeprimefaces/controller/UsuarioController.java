package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import util.jsf.FacesUtil;
import model.UsuarioModel;

@Named
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	UsuarioModel usuario;
	List<UsuarioModel> usuarioList;
	
	@PostConstruct
	public void init(){
		limpar();
	}
	
	public void inicializar() {
			
		if (FacesUtil.isNotPostback()) {
			usuarioList = new ArrayList<UsuarioModel>();
		}
	}
	

	public void carregarListaUsuarios(){
		usuarioList = new ArrayList<UsuarioModel>();
	}

	private void limpar() {
		usuario = new UsuarioModel();		
	}
	
	public void salvar(){
		
		usuarioList.add(getUsuario());
		usuario = new UsuarioModel();
		
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
	
}	
