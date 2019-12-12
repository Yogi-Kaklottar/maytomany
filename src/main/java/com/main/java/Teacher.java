package com.main.java;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Teacher {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int tid;
		
		@Column
		private String tname;
		
		@ManyToMany(cascade = CascadeType.ALL,targetEntity = Cla.class)
		private Set c;
		
		
		public Teacher()
		{
			super();
		}


		public Teacher(int tid, String tname, Set c) {
			super();
			this.tid = tid;
			this.tname = tname;
			this.c = c;
		}


		public int getTid() {
			return tid;
		}


		public void setTid(int tid) {
			this.tid = tid;
		}


		public String getTname() {
			return tname;
		}


		public void setTname(String tname) {
			this.tname = tname;
		}


		public Set getC() {
			return c;
		}


		public void setC(Set c) {
			this.c = c;
		}


		@Override
		public String toString() {
			return "Teacher [getTid()=" + getTid() + ", getTname()=" + getTname() + ", getC()=" + getC() + "]";
		}
		
		
}
