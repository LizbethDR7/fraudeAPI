package com.ibm.academia.restapi.fraude.clientes;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "rest-countries", url = "http://restcountries.eu/")
public interface RestContriesCliente 
{
	

}
