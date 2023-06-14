package com.buffet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.buffet.dtos.AtualizarComentarioDTO;
import com.buffet.dtos.SalvarComentarioDTO;
import com.buffet.dtos.RemoverComentarioDTO;
import com.buffet.models.ComentarioModel;
import com.buffet.services.ComentarioService;

@Controller
public class ComentariosController {
    @Autowired
    private ComentarioService comentarioService;


    public ComentariosController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }


    @GetMapping("/comentarios")
    public String comentarios(Model model, Authentication authentication){
        Iterable<ComentarioModel> comentarios = comentarioService.listar();

        Boolean autenticado = authentication == null ? false: authentication.isAuthenticated(); 

        model.addAttribute("comentarios", comentarios);
        model.addAttribute("autenticado", autenticado);

        return "comentarios";
    }

    @PostMapping("/comentarios/salvar")
    public String salvarComentario(@ModelAttribute SalvarComentarioDTO comentario, Model model){
        comentarioService.salvar(comentario.getNome(), comentario.getTexto(), comentario.getEmail());

        return "redirect:/comentarios";
    }

    @PostMapping("/comentarios/aprovar")
    public String aprovarComentario(@ModelAttribute AtualizarComentarioDTO comentario){
        comentarioService.aprovar(comentario.getId(), comentario.getNome(), comentario.getTexto(), comentario.getEmail(), comentario.getAprovado());

        return "redirect:/comentarios";
    }

    @PostMapping("/comentarios/remover")
    public String removerComentario(@ModelAttribute RemoverComentarioDTO comentario){
        comentarioService.remover(comentario.getId());

        return "redirect:/comentarios";
    }
}
