package com.wendelguedes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendelguedes.cursomc.domain.Cliente;
import com.wendelguedes.cursomc.repositories.ClienteRepository;
import com.wendelguedes.cursomc.services.exceptions.ObjectNotFountException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository categoriaRepository;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFountException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
