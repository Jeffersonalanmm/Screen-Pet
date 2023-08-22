package br.edu.ufape.screenpet.business.register.exception;

public class DoesNotExistTutorException extends Exception {
	private static final long serialVersionUID = 1L;
	private String cpf;
	
	public DoesNotExistTutorException(String cpf) {
		super("Não existe no sistema um tutor com o CPF informado!");
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}