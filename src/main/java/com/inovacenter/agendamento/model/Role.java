package com.inovacenter.agendamento.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	private static final long serialVersionUID = -148005063358692637L;
	@Id
	private String roleName;
	
	public Role() {}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
