package com.buffet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HorariosController {
    @GetMapping("/horarios")
    public String horarios(){
        return "horarios";
    }
}
