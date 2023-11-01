package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Comida;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Comida")
public class ApiController {
    private List<Comida> comidas = new ArrayList<>();

    public ApiController() {
        comidas.add(new Comida("Hamburguer","MacDonalds",false));
        comidas.add(new Comida("Hamburguer vegetariano","Burguer King",true));
        comidas.add(new Comida("Burrito","Taco bell",false));
        comidas.add(new Comida("Costela ao molho barbacue","Outback",false));
    }
    @GetMapping
    public List<Comida> apiComida(){
        return comidas;
    }
}
