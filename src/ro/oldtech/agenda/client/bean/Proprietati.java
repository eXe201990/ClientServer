package ro.oldtech.agenda.client.bean;

import java.io.Serializable;

public class Proprietati implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7157186516761833604L;

	private Integer id;
	private Integer tip;
	private String nume;
	private Integer propInt;
	private String propStr;
	
	public Proprietati() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the tip
	 */
	public Integer getTip() {
		return tip;
	}

	/**
	 * @param tip the tip to set
	 */
	public void setTip(Integer tip) {
		this.tip = tip;
	}

	/**
	 * @return the nume
	 */
	public String getNume() {
		return nume;
	}

	/**
	 * @param nume the nume to set
	 */
	public void setNume(String nume) {
		this.nume = nume;
	}

	/**
	 * @return the propInt
	 */
	public Integer getPropInt() {
		return propInt;
	}

	/**
	 * @param propInt the propInt to set
	 */
	public void setPropInt(Integer propInt) {
		this.propInt = propInt;
	}

	/**
	 * @return the propStr
	 */
	public String getPropStr() {
		return propStr;
	}

	/**
	 * @param propStr the propStr to set
	 */
	public void setPropStr(String propStr) {
		this.propStr = propStr;
	}
	
	
}
