package usuarioingles.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import co.com.deluxebc.model.entity.Usuario;

/**
 * The persistent class for the rol database table.
 * 
*/
@Entity
@NamedQuery(name="Rol.findAll",query="SELECT r FROM Rol r")
public class Rol implements Serializable {
  private static final long SerialVersionUID= 1L;
  
  @Id
  @Column(name="rol_id")
  private int rolId;
  
 
  private String nombre_rol;

  private String profesor;
  
  private String Estudiante;
  
  private String administrador;
  
//bi-directional many-to-one association to Rol
  @OneToMany(mappedBy="rol")
  private List<Usuario> usuarios;
  
  public Rol() {
	    
  }

public int getRolId() {
	return rolId;
}

public void setRolId(int rolId) {
	this.rolId = rolId;
}

public String getNombre_rol() {
	return nombre_rol;
}

public void setNombre_rol(String nombre_rol) {
	this.nombre_rol = nombre_rol;
}

public String getProfesor() {
	return profesor;
}

public void setProfesor(String profesor) {
	this.profesor = profesor;
}

public String getEstudiante() {
	return Estudiante;
}

public void setEstudiante(String estudiante) {
	Estudiante = estudiante;
}

public String getAdministrador() {
	return administrador;
}

public void setAdministrador(String administrador) {
	this.administrador = administrador;
}

public List<Usuario> getUsuarios() {
	return usuarios;
}

public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
}
  
}
