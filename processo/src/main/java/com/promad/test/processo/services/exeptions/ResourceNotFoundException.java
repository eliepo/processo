package com.promad.test.processo.services.exeptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Código não Encontrado. Id"+id);
	}

}
