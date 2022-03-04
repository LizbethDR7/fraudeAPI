package com.ibm.academia.restapi.fraude.modelo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name ="pais", schema = "fraude")
public class PaisInfo extends IpInfo
{
	
	public PaisInfo(Integer ipPais, String paisNombre, String isoPais, String nombreMoneda, String valorMoneda,String euroMoneda, String dolarMoneda, String usuarioCreacion) {
		super(ipPais, paisNombre, isoPais, nombreMoneda, valorMoneda, euroMoneda, dolarMoneda, usuarioCreacion);
	}
	
	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "ip_id", foreignKey = @ForeignKey(name = "FK_IP_ID"))
	@JsonIgnoreProperties({"hibernateLazyInitializer", "paises"})
	private IpInfo ip;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaisInfo []");
		return builder.toString();
	}


	private static final long serialVersionUID = 3320593658282157778L;

}
