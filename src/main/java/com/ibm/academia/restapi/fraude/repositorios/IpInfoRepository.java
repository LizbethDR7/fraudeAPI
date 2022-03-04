package com.ibm.academia.restapi.fraude.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.fraude.modelo.entidades.IpInfo;

@Repository
	public interface IpInfoRepository extends CrudRepository<IpInfo, Long>
{
	
}
