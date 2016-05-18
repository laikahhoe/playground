package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_CIFADDID database table.
 * 
 */
@Entity
@Table(name="TB_CIFADDID", schema="COMMON")
@NamedQuery(name="TbCifaddid.findAll", query="SELECT t FROM TbCifaddid t")
public class TbCifaddid implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbCifaddidPK id;

	public TbCifaddid() {
	}

	public TbCifaddidPK getId() {
		return this.id;
	}

	public void setId(TbCifaddidPK id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CFAI_CIFNO", insertable= false, updatable = false)
	private TbCif tbcif;

	public TbCif getTbcif() {
		return tbcif;
	}

	public void setTbcif(TbCif tbcif) {
		this.tbcif = tbcif;
	}
	

}