package com.main.operation;
import javax.persistence.*;
import com.main.java.Teacher;
import com.main.java.Cla;


import java.util.HashSet;
import java.util.Set;
public class ManyToMany {

		public static void main(String[] args)
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		    EntityManager em=emf.createEntityManager();
		    // class object generate
		    Cla c1=new Cla();
		    Cla c2=new Cla();
		    Cla c3=new Cla();
		    c1.setCname("class1");
		    c2.setCname("class 2");
		    c3.setCname("class 3");
		    
		    //create set
		    Set<Cla> s1=new HashSet();
		    s1.add(c1);
		    s1.add(c2);
		    s1.add(c3);
		    
		    Set<Cla> s2=new HashSet();
		    s2.add(c3);
		    s2.add(c1);
		    s2.add(c2);
		    
		    Set<Cla> s3=new HashSet();
		    s3.add(c2);
		    s3.add(c3);
		    s3.add(c1);
		    
		    //add data for class
		    
		    Teacher t1=new Teacher();
		    Teacher t2=new Teacher();
		    Teacher t3=new Teacher();
		    
		    t1.setTname("raj");
		    t1.setC(s1);
		    
		    t2.setTname("ravi");
		    t2.setC(s2);
		    
		    t3.setTname("rajesh");
		    t3.setC(s3);
		    
		    //add commit 
		    em.getTransaction().begin();
		    em.persist(c1);
		    em.persist(c2);
		    em.persist(c3);
		    //add teacher detail
		    em.persist(t1);
		    em.persist(t2);
		    em.persist(t3);
		    em.getTransaction().commit();
		    em.close();
		    emf.close();
		    
		}
}
