package com.magicwand.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Teamprojectmapping {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamprojectmapping_generator")
	@SequenceGenerator(name="teamprojectmapping_generator", sequenceName = "teamprojectmapping_seq")    
	private int teamprojectmap_id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId", referencedColumnName = "team_id", insertable = false, updatable = false)
    private Team team;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectId", referencedColumnName = "project_id", insertable = false, updatable = false)
    private Project project;
	
	@Column(name = "teamId")
	private int teamId;
	
    public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	@Column(name = "projectId")
	private int projectId;
	
    public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Column(name = "supervisorId")
	private int supervisorId;
	
	@Column(name = "team_memberId")
	private int team_memberId;
	
	@Column(name = "created_by")
    private String created_by;
    
    @Column(name = "modified_by")
    private String modified_by;

    @Column(name = "created_dttm")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy hh:MM:ss")
    @Temporal(TemporalType.TIME)
    private Date created_dttm;
    
    @Column(name = "modified_dttm")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy hh:MM:ss")
    @Temporal(TemporalType.TIME)
    private Date modified_dttm;
    
	@Override
	public String toString() {
		return "Teamprojectmapping [teamprojectmap_id=" + teamprojectmap_id + ",  supervisorId="+ supervisorId + ",  team_memberId=" + team_memberId + ", created_by=" + created_by + ", modified_by=" + modified_by + ", created_dttm=" + created_dttm + ", modified_dttm=" + modified_dttm + "]";
	}
	public int getTeamprojectmap_id() {
		return teamprojectmap_id;
	}

	public void setTeamprojectmap(int teamprojectmap_id) {
		this.teamprojectmap_id = teamprojectmap_id;
	}
	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public int getTeam_memberId() {
		return team_memberId;
	}

	public void setTeam_memberId(int team_memberId) {
		this.team_memberId = team_memberId;
	}
	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public Date getCreated_dttm() {
		return created_dttm;
	}

	public void setCreated_dttm(Date created_dttm) {
		this.created_dttm = created_dttm;
	}
	
	public Date getModified_dttm() {
		return modified_dttm;
	}

	public void setModified_dttm(Date modified_dttm) {
		this.modified_dttm = modified_dttm;
	}			 
}
