package jc.com.br.PruebaSpring.web;


import jc.com.br.PruebaSpring.domain.Persona;
import jc.com.br.PruebaSpring.servicio.IPersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*Anotación para que reconozca esta clase como controlador de Spring*/
@Controller
/*Para el manejo del Login*/
@Slf4j
public class ControladorInicio{



    @Autowired
    private IPersonaService personaService;

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo con Thymeleaf";
        var personas = personaService.listarPersona();

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("personas", personas);
        model.addAttribute("saludo", saludo);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
}
