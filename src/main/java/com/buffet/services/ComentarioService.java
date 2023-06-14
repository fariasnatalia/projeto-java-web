package com.buffet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffet.models.ComentarioModel;
import com.buffet.repositories.ComentarioRepository;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;
    
    public void salvar(String nome, String texto, String email){
        ComentarioModel comentario = new ComentarioModel(nome, texto, email);

        comentarioRepository.save(comentario);
    }

    public Iterable<ComentarioModel> listar(){
       return comentarioRepository.findAll();
    }

    public void remover(Long id){
         comentarioRepository.deleteById(id);;
    }

    public void aprovar(Long id, String nome, String texto, String email, Boolean aprovado){
        ComentarioModel comentario = new ComentarioModel(id, nome, texto, email, aprovado);
       
        comentarioRepository.save(comentario);
    }
}
