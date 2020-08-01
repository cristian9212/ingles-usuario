package usuarioingles.model.service;

import java.util.List;

import usuarioingles.model.entity.Rol;

public interface IRolService {
	
	public List<Rol> findAll();
	
	public Rol findAll(int rol_id);

}
