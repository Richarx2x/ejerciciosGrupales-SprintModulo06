package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.dao.CapacitacionDAO;
import cl.g5.ej3Mod6.model.service.CapacitacionServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitacion")
public class CrearCapacitacion {
 private final CapacitacionServicio capService;

    public CrearCapacitacion(CapacitacionServicio capService) {
        this.capService = capService;
    }

    @GetMapping()
    public String formCapacitacion(){
        return "crearCapacitacion";
    }

/**    metodo con acceso get, ace referencia al caso de uso Listar Capacitaciones**/
   @GetMapping("/lista")
    public String listaCapacitaciones(Model model){

        model.addAttribute("listaCaps",capService.listaCapacitaciones());
        return "capacitaciones";
    }


    // Instrucción ejercicio4. relacione el dao con controller
   /*  private CapacitacionDAO capDao = new CapacitacionDAO();
    @GetMapping("/lista")
    public String listaCapacitaciones(Model model){

        model.addAttribute("listaCaps",capDao.obtenerCapacitaciones());
        return "capacitaciones";
    }*/
}
