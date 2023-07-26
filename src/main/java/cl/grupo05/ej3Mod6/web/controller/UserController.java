package cl.grupo05.ej3Mod6.web.controller;

import cl.grupo05.ej3Mod6.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){

        model.addAttribute("users", service.findAll());
        return "listadousuarios";

    }
}
