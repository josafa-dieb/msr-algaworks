package com.algaworks.algalog.domain.exception;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 2174486670529683214L;

	public DomainException(String mensagem) {
		super(mensagem);
	}
	
}
