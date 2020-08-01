package usuarioingles.apirest.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RolWS")
public class RolWS {
	
	@GetMapping("/")
	public String prueba() {
		return "funciona";
		
	}
	
	@PostMapping("/actulizar")
	public String actulizar() {
		return "actulizo";
		
	}
	

}
