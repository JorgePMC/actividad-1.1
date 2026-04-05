package actividad11.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaMundo1 {
//Prueba para cambiar el commit
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo, toy estudiendo pa la prueba un dia antes, AYUDA";
    }
    
}
