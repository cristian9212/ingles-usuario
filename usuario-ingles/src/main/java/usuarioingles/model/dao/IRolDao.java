package usuarioingles.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import usuarioingles.model.entity.Rol;

@Repository
public interface IRolDao extends CrudRepository<Rol, Integer> {
	
	@Query("SELECT R FROM Rol R WHERE R.nombreRol = :nombreRol")
	public Rol buscarNombreRol (@Param("nombreRol") String nombreRol);

	
}
