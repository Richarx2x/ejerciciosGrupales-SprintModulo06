package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Inicio {

    @GetMapping
    public String getHome(){
        //---metodo con acceso get, que retorna un string (direcciona a un html)
        return "index";
    }
}
