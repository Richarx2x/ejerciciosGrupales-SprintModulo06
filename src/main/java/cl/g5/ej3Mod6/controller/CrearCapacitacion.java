package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import cl.g5.ej3Mod6.model.service.CapacitacionServicio;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitacion")
public class CrearCapacitacion {
    Log logger = LogFactory.getLog(CrearCapacitacion.class);

    private final CapacitacionServicio capService;
    public CrearCapacitacion(CapacitacionServicio capService) {
        this.capService = capService;
    }

    @GetMapping()
    public String formCapacitacion(){
        return "crearCapacitacion";
    }
@PostMapping()
    public String nuevaCapacitacion(@ModelAttribute ("cap")CapacitacionDTO cap){
    logger.info(cap.toString());
    capService.create(cap);
    return "redirect:/capacitacion/lista";
    //return "crearCapacitacion";
    }

/**    metodo con acceso get, hace referencia al caso de uso Listar Capacitaciones**/
   @GetMapping("/lista")
    public String listaCapacitaciones(Model model){

        model.addAttribute("listaCaps",capService.listaCapacitaciones());
        return "capacitaciones";
    }



}
