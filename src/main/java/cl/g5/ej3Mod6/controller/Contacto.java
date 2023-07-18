package cl.g5.ej3Mod6.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.AttributedString;

@Controller
@RequestMapping("/contacto")
public class Contacto {
    Log logger = LogFactory.getLog(Contacto.class);
    @GetMapping
    public String mostrarContact(){
        //metodo con acceso get, que retorna un string (direcciona a un html)
        return "contacto";
    }
    //código con Post que reciba los datos del formulario
@PostMapping
    public String recibirContacto(Model model){

        return "index";

}


}
