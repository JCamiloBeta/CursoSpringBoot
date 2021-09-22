package jc.com.br.PruebaSpring;

import jc.com.br.PruebaSpring.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*Anotación para que reconozca esta clase como controlador de Spring*/
@Controller
/*Para el manejo del Login*/
@Slf4j
public class ControladorInicio{

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo con Thymeleaf";
        var persona = new Persona();

        persona.setNombre("Camilo");
        persona.setApellido("Betancur");
        persona.setEmail("jbetancurricogmail.com");
        persona.setTelefono("3105149288");

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }

}
