package ro.oldtech.agenda.server.bean;

import java.io.Serializable;
import java.util.Date;

public class Continut implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7258137308234957584L;

	private Integer id;
	private Date dataCreat;
	private String continut;
	private Integer status;

	public Continut() {
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
	 * @return the dataCreat
	 */
	public Date getDataCreat() {
		return dataCreat;
	}

	/**
	 * @param dataCreat the dataCreat to set
	 */
	public void setDataCreat(Date dataCreat) {
		this.dataCreat = dataCreat;
	}

	/**
	 * @return the continut
	 */
	public String getContinut() {
		return continut;
	}

	/**
	 * @param continut the continut to set
	 */
	public void setContinut(String continut) {
		this.continut = continut;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
