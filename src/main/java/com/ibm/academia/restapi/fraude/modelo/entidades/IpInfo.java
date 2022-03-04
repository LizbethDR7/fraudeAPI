package com.ibm.academia.restapi.fraude.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ip", schema = "fraude")
public class IpInfo implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ip_pais", nullable = false, length = 20)
	private Integer ipPais;
	
	@Column(name = "pais_nombre", nullable = false, unique = true, length = 50)
	private String paisNombre;
	
	@Column(name = "iso_pais", nullable = false, unique = true, length = 6)
	private String isoPais;
	
	@Column(name = "nombre_moneda", nullable = false, length = 20)
	private String nombreMoneda;
	
	@Column(name = "valor_moneda", nullable = false, length = 20)
	private String valorMoneda;
	
	@Column(name = "euro_moneda", nullable = false, length = 20)
	private String euroMoneda;
	
	@Column(name = "dolar_moneda", nullable = false, length = 20)
	private String dolarMoneda;
	
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	
	@OneToMany(mappedBy = "ip", fetch = FetchType.LAZY)
	private Set<PaisInfo> ips;
	

	public IpInfo(Integer ipPais, String paisNombre, String isoPais, String nombreMoneda, String valorMoneda,
			String euroMoneda, String dolarMoneda, String usuarioCreacion) {
		super();
		this.ipPais = ipPais;
		this.paisNombre = paisNombre;
		this.isoPais = isoPais;
		this.nombreMoneda = nombreMoneda;
		this.valorMoneda = valorMoneda;
		this.euroMoneda = euroMoneda;
		this.dolarMoneda = dolarMoneda;
		this.usuarioCreacion = usuarioCreacion;
	}

	
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IpInfo [ipPais=");
		builder.append(ipPais);
		builder.append(", paisNombre=");
		builder.append(paisNombre);
		builder.append(", isoPais=");
		builder.append(isoPais);
		builder.append(", nombreMoneda=");
		builder.append(nombreMoneda);
		builder.append(", valorMoneda=");
		builder.append(valorMoneda);
		builder.append(", euroMoneda=");
		builder.append(euroMoneda);
		builder.append(", dolarMoneda=");
		builder.append(dolarMoneda);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id, ipPais, isoPais);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof IpInfo))
			return false;
		IpInfo other = (IpInfo) obj;
		return Objects.equals(id, other.id) && Objects.equals(ipPais, other.ipPais)
				&& Objects.equals(isoPais, other.isoPais);
	}

	
	
	
	@PrePersist
	private void antesPersistir()
	{
		this.fechaCreacion = new Date();
	}
	
	@PreUpdate
	private void antesActualizar()
	{
		this.fechaModificacion = new Date();
	}


	private static final long serialVersionUID = -6977792158677247276L;

}
