package org.training.siarhei_baradzionak.domain.beans.issue;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.training.siarhei_baradzionak.domain.beans.users.User;


@Entity
@Table(name="ISSUE")
public class Issue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="ID", unique = true, nullable = false)
	private long id;
	
	
}
