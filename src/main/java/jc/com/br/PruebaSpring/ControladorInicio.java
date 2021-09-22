package jc.com.br.PruebaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Anotación para que reconozca esta clase como controlador de Spring*/
@RestController
/*Para el manejo del Login*/
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador Rest 45");
        return "Hola Mundo!";
    }

}
