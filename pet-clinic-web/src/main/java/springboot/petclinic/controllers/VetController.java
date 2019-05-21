package springboot.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.petclinic.model.Vet;
import springboot.petclinic.services.VetService;

import java.util.Set;

/**
 * Created by max on 2019-03-26
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }

    @GetMapping("/api")
    public @ResponseBody Set<Vet> getVetsJson() {
        return vetService.findAll();

    }
}
