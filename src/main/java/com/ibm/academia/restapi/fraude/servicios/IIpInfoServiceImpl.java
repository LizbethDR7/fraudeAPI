package com.ibm.academia.restapi.fraude.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.fraude.modelo.entidades.IpInfo;
import com.ibm.academia.restapi.fraude.repositorios.IpInfoRepository;

@Service
public class IIpInfoServiceImpl  implements IIpInfoService
{
	@Autowired
	private IpInfoRepository ipinfoRepository;
	
	@Override
	public Optional<IpInfo> buscarPorIP(Long id) {
		return ipinfoRepository.findById(id);
	}

	@Override
	public IpInfo guardar(IpInfo ip) {
		return ipinfoRepository.save(ip);
	}

	@Override
	public Iterable<IpInfo> buscarTodos() {
		
		return ipinfoRepository.findAll();
	}

	@Override
	public void eliminarPorIp(Long id) {
	
		ipinfoRepository.deleteById(id);
	}
}
