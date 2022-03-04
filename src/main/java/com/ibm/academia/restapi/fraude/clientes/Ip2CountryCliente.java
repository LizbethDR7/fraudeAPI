package com.ibm.academia.restapi.fraude.clientes;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ip2-country", url = "https://ip2country.info/")
public interface Ip2CountryCliente 
{
}
