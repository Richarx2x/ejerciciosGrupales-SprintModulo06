package cl.grupo05.ej3Mod6.web.controller;

import cl.grupo05.ej3Mod6.web.service.CapacitationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/capacitation")
public class CapacitationController {

    private final CapacitationService service;
    public CapacitationController (CapacitationService service){
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){

        model.addAttribute("capacitation", service.findAll());
        return "listadocapacitaciones";

    }

}
