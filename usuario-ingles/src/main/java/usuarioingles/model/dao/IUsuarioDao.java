package usuarioingles.model.dao;

import org.springframework.data.repository.CrudRepository;

import usuarioingles.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {

}
