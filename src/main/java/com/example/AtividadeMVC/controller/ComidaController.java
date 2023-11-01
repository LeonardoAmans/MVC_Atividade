package com.example.AtividadeMVC.controller;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;

import com.example.AtividadeMVC.models.Comida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Comida")
public class ComidaController {
    private static final List<Comida> comidas = new ArrayList<>();

    public ComidaController() {
        comidas.add(new Comida("Hamburguer", "MacDonalds", false));
        comidas.add(new Comida("Hamburguer vegetariano", "Burguer King", true));
        comidas.add(new Comida("Burrito", "Taco bell", false));
        comidas.add(new Comida("Costela ao molho barbacue", "Outback", false));
    }

    @GetMapping
    public String getComida(Model model) {
        model.addAttribute("comidas", comidas);
        return "comidas";
    }
}
