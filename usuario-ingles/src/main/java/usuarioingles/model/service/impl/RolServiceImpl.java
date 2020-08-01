package usuarioingles.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import usuarioingles.model.dao.IRolDao;
import usuarioingles.model.entity.Rol;
import usuarioingles.model.service.IRolService;

public class RolServiceImpl implements IRolService {
	
	@Autowired
	private IRolDao rolDao;
	

	@Override
	@Transactional (readOnly = true)
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findAll(int rol_id) {
		// TODO Auto-generated method stub
		return rolDao.findById(rol_id).orElse(null);
	}

}
