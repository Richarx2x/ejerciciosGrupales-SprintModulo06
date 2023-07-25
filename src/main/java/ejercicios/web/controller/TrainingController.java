package ejercicios.web.controller;

import cl.modulo6.ejercicios.web.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/training")
public class TrainingController {
    //inyección de dependencia- servicioInterface
    private final TrainingService service;

    public TrainingController(TrainingService service) {
        this.service = service;
    }

    //Caso de uso Listar capacitaciones
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("listTrainings",service.findAll());
        return "trainings";
    }

}
