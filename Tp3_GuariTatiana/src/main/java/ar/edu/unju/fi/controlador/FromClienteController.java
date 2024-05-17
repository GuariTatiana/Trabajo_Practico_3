package ar.edu.unju.fi.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FromClienteController {
	@GetMapping({"/formulario"})
	
	public String getFromCliente() {
		return "formCliente";
	}
}
