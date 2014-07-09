package org.training.siarhei_baradzionak.domain.beans.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RESOLUTION")
public class Resolution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="RESOLUTION")
	private String resolution;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "Resolution [id=" + id + ", resolution=" + resolution + "]";
	}
	
	

}
