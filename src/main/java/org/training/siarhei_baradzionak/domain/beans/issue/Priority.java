package org.training.siarhei_baradzionak.domain.beans.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRIORITY")
public class Priority implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID", unique = true, nullable = false)
	private int id;
	
	@Column(name="PRIORITY", unique = false, nullable = false)
	private String priority;
	
	public Priority() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Priority [id=" + id + ", priority=" + priority + "]";
	}
	
}
