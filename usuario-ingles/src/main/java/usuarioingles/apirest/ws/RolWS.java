package usuarioingles.apirest.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingles")
public class RolWS {

	@GetMapping("/")
	public String prueba() {
		return "ok";
	}
}
