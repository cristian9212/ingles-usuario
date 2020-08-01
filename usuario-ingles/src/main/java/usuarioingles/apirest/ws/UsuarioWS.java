package usuarioingles.apirest.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarioWS")
public class UsuarioWS {

	@GetMapping("/")
	public String validar() {
		return "ok";
		
	}
}
