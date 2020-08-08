package com.magicwand.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class User {
	@Id
    @GeneratedValue
    private int uid;
	
	@OneToOne(fetch = FetchType.LAZY, targetEntity = Registration.class)
    @JoinColumn(name="id", referencedColumnName = "id", nullable = false)
	private Registration register;
	
	@OneToOne(fetch = FetchType.LAZY, targetEntity = Usertype.class)
    @JoinColumn(name="usertype_id", referencedColumnName = "usertype_id", nullable = false)
	private Usertype usertype;
	
	@OneToOne(fetch = FetchType.LAZY, targetEntity = Role.class)
    @JoinColumn(name="roletype_id", referencedColumnName = "roletype_id", nullable = false)
	private Role role;
	
	@OneToOne(fetch = FetchType.LAZY, targetEntity = Plan.class)
    @JoinColumn(name="plan_id", referencedColumnName = "plan_id", nullable = false)
	private Plan plan;
    
	@Column(name = "payment_status")
    private String payment_status;
    
    @Column(name = "planof_expiry")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date planof_expiry;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "usertoken")
    private String usertoken;
    
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
		return "User [uid=" + uid + ",  payment_status="+ payment_status + ", planof_expiry=" + planof_expiry + ", status=" + status + ", usertoken=" + usertoken
				+ ", created_by=" + created_by + ", modified_by=" + modified_by + ", created_dttm=" + created_dttm + ", modified_dttm=" + modified_dttm + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	
	 public Registration getRegistration() {
		 return register;
		 }

		 public void setRegistration(Registration register) {
		 this.register = register;
		 }
	
		 public Usertype getUsertype() {
			 return usertype;
			 }

			 public void setUsertype(Usertype usertype) {
			 this.usertype = usertype;
			 }
			 
			 public Role getRole() {
				 return role;
				 }

				 public void setRole(Role role) {
				 this.role = role;
				 }
				 
				 public Plan getPlan() {
					 return plan;
					 }

					 public void setPlan(Plan plan) {
					 this.plan = plan;
					 }
		 
	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public Date getPlanof_expiry() {
		return planof_expiry;
	}

	public void setPlanof_expiry(Date planof_expiry) {
		this.planof_expiry = planof_expiry;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//usertoken
	public String getUsertoken() {
		return usertoken;
	}

	public void setUsertoken(String usertoken) {
		this.usertoken = usertoken;
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

