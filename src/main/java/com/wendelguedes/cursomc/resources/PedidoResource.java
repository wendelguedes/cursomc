package com.wendelguedes.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendelguedes.cursomc.domain.Pedido;
import com.wendelguedes.cursomc.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pedido cli = pedidoService.find(id);
		return ResponseEntity.ok(cli);
	}

}
