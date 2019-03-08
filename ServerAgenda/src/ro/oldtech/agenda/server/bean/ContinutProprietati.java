package ro.oldtech.agenda.server.bean;

import java.io.Serializable;

public class ContinutProprietati implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3909448582833836377L;

	private Integer id;
	private Integer idContinut;
	private Integer tip;
	private String nume;
	private Integer propInt;
	private String propStr;

	public ContinutProprietati() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the idContinut
	 */
	public Integer getIdContinut() {
		return idContinut;
	}

	/**
	 * @param idContinut
	 *            the idContinut to set
	 */
	public void setIdContinut(Integer idContinut) {
		this.idContinut = idContinut;
	}

	/**
	 * @return the tip
	 */
	public Integer getTip() {
		return tip;
	}

	/**
	 * @param tip
	 *            the tip to set
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
	 * @param nume
	 *            the nume to set
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
	 * @param propInt
	 *            the propInt to set
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
	 * @param propStr
	 *            the propStr to set
	 */
	public void setPropStr(String propStr) {
		this.propStr = propStr;
	}

}
