package usuarioingles.apirest.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioWS {

	@GetMapping("/")
		public String validar() {
		return "funciona";
	}
}
