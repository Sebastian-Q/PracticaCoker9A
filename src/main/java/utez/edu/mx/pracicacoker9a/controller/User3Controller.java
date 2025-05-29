package utez.edu.mx.pracicacoker9a.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user3")
@CrossOrigin("*")
public class User3Controller {
    @GetMapping("")
    public String getMessage(){
        return "Hola desde el controlador user3";
    }
}
