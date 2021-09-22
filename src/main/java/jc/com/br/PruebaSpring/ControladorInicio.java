package jc.com.br.PruebaSpring;

import jc.com.br.PruebaSpring.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

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
        var persona2 = new Persona();
        var persona3 = new Persona();

        persona.setNombre("Camilo");
        persona.setApellido("Betancur");
        persona.setEmail("jbetancurricogmail.com");
        persona.setTelefono("3105149288");

        persona2.setNombre("Juan");
        persona2.setApellido("Rico");
        persona2.setEmail("jbetancurrico@gmail.com");
        persona2.setTelefono("3022233");

        persona3.setNombre("JC");
        persona3.setApellido("BR");
        persona3.setEmail("jcamilob@outlook.com");
        persona3.setTelefono("3206905927");

        var personas = Arrays.asList(persona, persona2, persona3);

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    }

}
