package ar.edu.unju.fi.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	//@GetMapping({"/index", "/home", "/", "/inicio"}) 
	//es otra forma de llamrlo
	
	public String getIndex () {
		return "index";
	}

}
