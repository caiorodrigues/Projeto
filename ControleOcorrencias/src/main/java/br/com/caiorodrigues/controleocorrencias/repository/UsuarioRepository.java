package br.com.caiorodrigues.controleocorrencias.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.caiorodrigues.controleocorrencias.model.UsuarioModel;
import br.com.caiorodrigues.controleocorrencias.repository.filter.UsuarioFilter;

public class UsuarioRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public List<UsuarioModel> filtrados(UsuarioFilter filtro){
		
		//Objeto fixo temporariamente
		UsuarioModel usuario = new UsuarioModel();
		usuario.setCodigo(1L);
		usuario.setNome("Usuário");
		usuario.setSenha("123");
		
		List<UsuarioModel> list = new ArrayList<UsuarioModel>();
		list.add(usuario);
		
		return list;
	}

}
