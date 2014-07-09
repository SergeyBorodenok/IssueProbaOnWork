package org.training.siarhei_baradzionak.domain.beans.project;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.training.siarhei_baradzionak.domain.beans.users.User;

@Entity
@Table(name="PROJECT")
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id",nullable=false)
	@GeneratedValue
	private long idProject;

	@Column(name="PROJECTNAME",nullable=false)
	private String nameProject;
	
	@Column(name="DESCRIPTIONPROJECT",nullable=false)
	private String descriptionProject;
	
	@ManyToOne
	@JoinColumn(name="MANAGER",nullable=false)
	private User managerProject;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public long getIdProject() {
		return idProject;
	}

	public void setIdProject(long idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public String getDescriptionProject() {
		return descriptionProject;
	}

	public void setDescriptionProject(String descriptionProject) {
		this.descriptionProject = descriptionProject;
	}

	public User getManagerProject() {
		return managerProject;
	}

	public void setManagerProject(User managerProject) {
		this.managerProject = managerProject;
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", nameProject="
				+ nameProject + ", descriptionProject=" + descriptionProject
				+ ", managerProject=" + managerProject + "]";
	}
	
	
	
}
