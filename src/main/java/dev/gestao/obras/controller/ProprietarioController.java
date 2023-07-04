package dev.gestao.obras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gestao.obras.dtos.ProprietarioDTO;
import dev.gestao.obras.model.Proprietario;
import dev.gestao.obras.repository.ProprietarioDAO;
import dev.gestao.obras.service.ProprietarioService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/v1/gto/proprietario")
public class ProprietarioController {

    @Autowired
    private ProprietarioDAO dao;
    @Autowired
   private ProprietarioService service;
    
    
    @GetMapping ("/mostrar")
    public List<Proprietario> mostrar() {
        return service.mostrar();
    }
    
    @PostMapping ("/salvar")
    public ResponseEntity<ProprietarioDTO> salvar(@Valid @RequestBody ProprietarioDTO obj){
    	return ResponseEntity.ok(service.salvar(obj));
    }
	
}
