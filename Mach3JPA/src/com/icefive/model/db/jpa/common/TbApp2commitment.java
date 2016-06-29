package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_APP2COMMITMENT database table.
 * 
 */
@Entity
@Table(schema="COMMON", name="TB_APP2COMMITMENT")
@NamedQuery(name="TbApp2commitment.findAll", query="SELECT t FROM TbApp2commitment t")
public class TbApp2commitment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbApp2commitmentPK id;

	@Column(name="APC_AMOUNT")
	private double apcAmount;

	public TbApp2commitment() {
	}

	public TbApp2commitmentPK getId() {
		return this.id;
	}

	public void setId(TbApp2commitmentPK id) {
		this.id = id;
	}

	public double getApcAmount() {
		return this.apcAmount;
	}

	public void setApcAmount(double apcAmount) {
		this.apcAmount = apcAmount;
	}

}