package com.main.java;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Cla {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column
	private String cname;
	
	@ManyToMany(targetEntity = Teacher.class,cascade = CascadeType.ALL)
	 private Set t;
	
	public Cla()
	{
		super();
	}

	public Cla(int cid, String cname, Set t) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.t = t;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getT() {
		return t;
	}

	public void setT(Set t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Cla [getCid()=" + getCid() + ", getCname()=" + getCname() + ", getT()=" + getT() + "]";
	}
	
	
	
	
}
