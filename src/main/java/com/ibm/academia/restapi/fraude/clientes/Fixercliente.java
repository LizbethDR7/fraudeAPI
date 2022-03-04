package com.ibm.academia.restapi.fraude.clientes;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "fixer", url = "http://countrylayer.com/")
public interface Fixercliente 
{
	
}
