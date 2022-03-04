package com.ibm.academia.restapi.fraude.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibm.academia.restapi.fraude.enumeradores.TipoMoneda;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "monedas", schema = "fraude")
public class MonedaInfo extends IpInfo
{
	
	@Id
	@Column(name = "tipo_moneda")
	@Enumerated(EnumType.STRING)
	private TipoMoneda tipoMoneda;
	
	public MonedaInfo(Integer ipPais, String paisNombre, String isoPais, String nombreMoneda, String valorMoneda,String euroMoneda, String dolarMoneda, String usuarioCreacion) 
	{
		super(ipPais, paisNombre, isoPais, nombreMoneda, valorMoneda, euroMoneda, dolarMoneda, usuarioCreacion);
	}




	private static final long serialVersionUID = 279407915499494290L;

}
