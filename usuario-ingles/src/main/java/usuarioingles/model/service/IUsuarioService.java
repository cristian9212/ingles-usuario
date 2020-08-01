package usuarioingles.model.service;

import java.util.List;

import usuarioingles.model.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario finById(int usuario_id);
	

}
