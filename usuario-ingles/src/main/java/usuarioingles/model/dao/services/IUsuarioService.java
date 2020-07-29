package usuarioingles.model.dao.services;


public interface IUsuarioService {
     
    public int validaExistenciaEmail(String email);
	
	public int validaExistenciaUsuario(String usuario,String password, String rol);
	
	public int Usuario save(Usuario usuario);
	
	public  Usuario obtenerUsuario1(String email);
	
	public int obtenerUsuario(String email);
	
	public int validarUsuario (String email, String password);
	
	public Usuario obtenerUsuario (String email, String password);
	
	
	}
