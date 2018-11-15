package com.kloudone.jobfilter.model;

public class JobModel {
	
	private int jobId;
	private String skill;
	private String jobName;
	private String location;
	private String experience;
	private String jobDesc;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public JobModel() {
	}
	
	@Override
	public String toString() {
		return "JobModel [jobId=" + jobId + ", skill=" + skill + ", jobName=" + jobName + ", location=" + location
				+ ", experience=" + experience + ", jobDesc=" + jobDesc + "]";
	}

}
