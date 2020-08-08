package com.magicwand.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Child {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int childId;
    private String account;


	public String getAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "Child [childId=" + childId + ", account=" + account + ", parent=" + parent + "]";
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Parent.class)
    @JoinColumn(name="parentId", referencedColumnName = "parentId", nullable = false)
    private Parent parent;
}
