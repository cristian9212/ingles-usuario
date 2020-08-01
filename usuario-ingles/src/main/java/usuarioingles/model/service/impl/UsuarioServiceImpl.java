package usuarioingles.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import usuarioingles.model.dao.IUsuarioDao;
import usuarioingles.model.entity.Usuario;
import usuarioingles.model.service.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario finById(int usuario_id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(usuario_id).orElse(null);
	}

}
