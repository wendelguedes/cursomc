package com.wendelguedes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendelguedes.cursomc.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria c1 = new Categoria(1, "Automóveis");
		Categoria c2 = new Categoria(2, "Eletrônicos");
		
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(c1);
		categorias.add(c2);

		return categorias;
	}

}
