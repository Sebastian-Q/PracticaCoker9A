package utez.edu.mx.pracicacoker9a.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user2")
@CrossOrigin("*")
public class User2Controller {
    @GetMapping("")
    public String getMessageUltimate(){
        return "Mensaje editado por tercera vez";
    }
}