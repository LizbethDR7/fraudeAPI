package com.ibm.academia.restapi.fraude.excepciones;

public class NotFoundException extends RuntimeException
{
	public NotFoundException(String mensaje)
	{
		super(mensaje);
	}
	private static final long serialVersionUID = -6435829779158613587L;
}
