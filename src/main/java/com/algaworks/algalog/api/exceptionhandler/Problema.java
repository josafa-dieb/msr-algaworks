package com.algaworks.algalog.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Data
@JsonInclude(Include.NON_NULL)
public class Problema {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campo;
	
	@Getter
	@AllArgsConstructor
	public static class Campo {
		private String nome;
		private String mensagem;
	}
	
	
}
