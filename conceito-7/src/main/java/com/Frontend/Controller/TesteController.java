package com.Frontend.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	public String retornandoStringfrontEnd () {
		return "Podemos classificar como a parte visual de um site, aquilo que conseguimos interagir."
				+ " é responsável por desenvolver por meio do código uma interface gráfica e, normalmente, "
				+ " com as tecnologias base da Web: HTML, CSS e JavaScript.";
	}
	@GetMapping("/1")
	public String retornandoString () {
		return " React, Javascript, CSS, HTML, Angular,";
	}
	
	@PostMapping
	/*Criar um recurso*/
	public String post (@RequestBody String texto) {	
	System.out.println(texto);	
	return texto;

	}
	
	@PutMapping
	/*Atualizar recurso*/
	public String put (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@PatchMapping
	/*Fazer a alteração de valores específicos de um recurso*/
	public String patch (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@DeleteMapping
	/*Remoção recurso*/
	public String deletado () {
		return "deleta alguma coisa pelo amor!!!";
	}

}
