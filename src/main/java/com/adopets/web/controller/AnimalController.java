package com.adopets.web.controller;

import com.adopets.web.model.Animal;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adopets.web.service.AnimalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller //Define a classe como um bean do Spring
public class AnimalController {

    @Autowired
    private AnimalService service; //	Injeta a classe de serviços

    //Vai para tela principal do CRUD aonde são listados todos os animals
    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("/animais");
        mv.addObject("animais", service.findAll());

        return mv;
    }

    /*@GetMapping("/suggest-event")
    public String suggestEvent() {
        return "/suggested-event/suggestEvent";
    }

    @PostMapping("/suggest-event")
    public String receiveSuggestedEvent(BindingResult result, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Failed");
        redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        if (result.hasErrors()) {
            return "redirect:/";
        }
        redirectAttributes.addFlashAttribute("message", "Success");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "redirect:/";
    }*/
    //Vai para tela de adição de animal
    @GetMapping("/add")
    public ModelAndView add(Animal animal) {

        ModelAndView mv = new ModelAndView("/animalAdd");
        mv.addObject("animal", animal);

        return mv;
    }

    //Vai para tela de edição de animals (mesma tela de adição, contudo é enviado para a view um objeto que já existe)
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        return add(service.findOne(id));
    }

    //Exclui um animal por seu ID e redireciona para a tela principal
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        service.delete(id);

        return findAll();
    }

    //Recebe um objeto preenchido do Thymeleaf e valida 
    //Se tudo estiver ok, salva e volta para tela principal
    //Se houver erro, retorna para tela atual exibindo as mensagens de erro
    @PostMapping("/save")
    public ModelAndView save(@Valid Animal animal, BindingResult result) {

        if (result.hasErrors()) {
            return add(animal);
        }

        service.save(animal);

        return findAll();
    }

   

}
