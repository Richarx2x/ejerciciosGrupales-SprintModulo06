package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class ListarUsuario {
    private final UsuarioService usuarioService;
    public ListarUsuario(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public String listarUsuarios(Model model){
        model.addAttribute("listaUsuarios",usuarioService.findAll());
        return "usuarios";
    }
}
