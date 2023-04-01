package com.algaworks.algalog.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.domain.exception.DomainException;
import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CatalogoClienteService {
	
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
				.stream().anyMatch(c -> !c.equals(cliente));
		
		if(emailEmUso) {
			throw new DomainException("Ja existe um cliente cadastrado com esse email!");
		}
		
		return clienteRepository.save(cliente);
	}

	
	@Transactional
	public void excluir(Long clineteId) {
		clienteRepository.deleteById(clineteId);
	}
	
}
