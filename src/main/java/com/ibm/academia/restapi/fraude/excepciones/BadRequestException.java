package com.ibm.academia.restapi.fraude.excepciones;

public class BadRequestException extends RuntimeException
{
	private static final long serialVersionUID = 6780914833291872279L;

	public BadRequestException(String mensaje)
	{
		super(mensaje);
	}
}
