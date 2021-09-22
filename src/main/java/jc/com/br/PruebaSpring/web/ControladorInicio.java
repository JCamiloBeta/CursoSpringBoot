package jc.com.br.PruebaSpring.web;

import jc.com.br.PruebaSpring.dao.IPersonaDao;
import jc.com.br.PruebaSpring.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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



    @Autowired
    private IPersonaDao personaDao;

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo con Thymeleaf";
        var personas = personaDao.findAll();

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("personas", personas);
        model.addAttribute("saludo", saludo);
        return "index";
    }

}
