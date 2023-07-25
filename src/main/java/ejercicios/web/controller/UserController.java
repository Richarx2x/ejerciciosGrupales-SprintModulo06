package ejercicios.web.controller;

//import cl.modulo6.ejercicios.web.service.UserService;
import ejercicios.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    //controlador caso uso listar usuarios
@GetMapping
    public String listaUsuarios(Model model){
        model.addAttribute("listUsers",service.findAll());
        return "users";
    }
}
