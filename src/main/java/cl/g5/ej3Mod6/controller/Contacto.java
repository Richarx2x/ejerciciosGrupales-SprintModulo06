package cl.g5.ej3Mod6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.AttributedString;

@Controller
@RequestMapping("/contacto")
public class Contacto {
    @GetMapping
    public String showContact(){
        //metodo con acceso get, que retorna un string (direcciona a un html)
        return "contacto";
    }

     //cpodigo con getPost que reciba los datos del formulario

}
