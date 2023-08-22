package br.edu.ufape.screenpet.business.register.exception;

public class DoesNotExistPetException extends Exception {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public DoesNotExistPetException(String name) {
		super("Não existe no sistema um pet com o nome informado!");
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}
}