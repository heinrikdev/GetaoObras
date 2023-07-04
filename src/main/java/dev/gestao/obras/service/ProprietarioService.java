package dev.gestao.obras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import dev.gestao.obras.dtos.ProprietarioDTO;
import dev.gestao.obras.model.Proprietario;
import dev.gestao.obras.repository.ProprietarioDAO;


@Service
public class ProprietarioService {

	@Autowired
	private ProprietarioDAO dao;
	
	@Transactional(readOnly=true)
	public List<Proprietario> mostrar() {
		return dao.findAll();
	}
	
	@Transactional
	public ProprietarioDTO salvar(@RequestBody ProprietarioDTO obj) {
		Proprietario modelObj = new Proprietario(obj.getCodigo(), obj.getNome(), obj.getCpf(), obj.getEmail());
		return new ProprietarioDTO(dao.save(modelObj));
	}
	
	
	
    
}
