package dev.gestao.obras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gestao.obras.model.Proprietario;


public interface ProprietarioDAO extends JpaRepository<Proprietario, Integer> {
	
}