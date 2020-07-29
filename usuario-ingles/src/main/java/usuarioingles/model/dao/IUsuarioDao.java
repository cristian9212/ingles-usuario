package usuarioingles.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import usuarioingles.model.entity.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{
	
	@Query("SELECT COUNT(DA) FROM Usuario DA WHERE DA.email= :email")
	public int countByEmail(@Param ("Email") String email);
	
	@Query("SELECT COUNT(DA) FROM Usuario DA WHERE DA.password = :password and DA.email = :email and Da.rol.nombreRol = :Rol")
	public int countByUsuario(@Param("password") String password, @Param("email") String email, @Param("rol") String rol);
	
	@Query ("SELECT COUNT(DA) FROM Usuario DA WHERE DA.email = :email")
	public Usuario findByEmail(@Param("email") String email);
	
	@Query ("SELECT COUNT(DA.usuarioId FROM Usuario DA WHERE DA.email = :email")
	public int obtenerUsuarioId(@Param("email") String email);
	
	@Query ("SELECT COUNT(DA) FROM Usuario DA WHERE DA.email = :email and DA.password = :pass")
	public int countByUsuarioPassword (@Param("email") String email,@Param("pass") String pass);
	
	@Query ("SELECT COUNT(DA) FROM Usuario DA WHERE DA.email = :email and DA.password = :pass")
	public Usuario obtenerUsuario (@Param("email") String email, @Param("pass")String pass);

	
}
