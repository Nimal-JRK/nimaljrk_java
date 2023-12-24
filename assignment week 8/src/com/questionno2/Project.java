package com.questionno2;

import java.io.Serializable;
import java.util.ArrayList;

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	String projectCode ;
	String projectName;
	int projectStrength;
	public Project(String projectCode, String projectName, int projectStrength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
	

}




