package com.ibm.academia.restapi.fraude.servicios;

import java.util.Optional;

import com.ibm.academia.restapi.fraude.modelo.entidades.IpInfo;

public interface IIpInfoService 
	{
		public Optional<IpInfo> buscarPorIP(Long id);
		public IpInfo guardar(IpInfo ip);
		public Iterable<IpInfo> buscarTodos();
		public void eliminarPorIp(Long id);
	}

