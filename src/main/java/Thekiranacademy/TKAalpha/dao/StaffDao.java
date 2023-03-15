package Thekiranacademy.TKAalpha.dao;

//import java.text.CollationElementIterator;  
//import java.util.Collections;
import java.util.List;
//import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Projection;
//import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.SessionCreationOptions;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Repository;



import Thekiranacademy.TKAalpha.entity.Staff;

@Repository
public class StaffDao{
	
	@Autowired
	SessionFactory sf;

	
	
	//-------------------insert Satff----------------
	public String insertStaff(List<Staff> st) {
		//System.out.println("IN Dao...."+st);
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		for (Staff staff : st) {
			session.save(staff);
		}
	    tr.commit();
		
		return "Staff is Saved..... ";
		
	}
	//---------------------------------------------------------
	
	//........Updataing Staff......................
	public String updateStaff(Staff s){
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(s);
		tr.commit();
		session.close();
		return "Staff Updated..............";
		
	}
	//...................................................................
	//............Getting all Staff.............
	
	public List<Staff> getstaff() {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Staff.class);
		return cr.list() ;
		
		
	}
	//..................................................................
		//......geting staff by id.........................
	
	public List<Staff> getbyid(int id){
		
		Session session = sf.openSession();
		Criteria cr=session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("Staffid", id));
		List<Staff> list =cr.list();
		return list;
		
	
	}
	//........adding....single....staff....................
	public  String addSingleStaff(Staff s) { 
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	session.save(s);
   tr.commit();
	
	return "Staff is Saved..... ";
	
}
	//...................getbystaffbyid.................................
    public List<Staff> getGtid(){
		
		Session session = sf.openSession();
		Criteria cr=session.createCriteria(Staff.class);
		cr.add(Restrictions.gt("salary","20000"));
		
		List<Staff> list =cr.list();
		
		return list;	
	}
    
    //...............getbyexperince............................................
public List<Staff> getExperice() {
	Session session = sf.openSession();
	Criteria cr=session.createCriteria(Staff.class);
	cr.add(Restrictions.between("experience","10","20"));
	
	List<Staff> list =cr.list();
	
	return list;

}
//.................Getmaxsalry...........................................................
public List<Staff> getMaxsalary(){
Session session = sf.openSession();
Criteria cr=session.createCriteria(Staff.class);
cr.setProjection(Projections.max("salary"));
List<Staff> list =cr.list();

session.close();
return list;

}

//....................................................................................

//................getingprofiletrainer......................................
    public List<Staff> getprofileTrainer() {
    	 
    	  Session session = sf.openSession();
  		Criteria cr=session.createCriteria(Staff.class);
  		cr.add(Restrictions.eq("profile","Trainer"));
  		List<Staff> list =cr.list();
  		return list;
  		
}
//......................getprofilenothavingtrainer...........................
    public List<Staff> getProfileNotTrainer() {
   	 
  	  Session session = sf.openSession();
		Criteria cr=session.createCriteria(Staff.class);
		cr.add(Restrictions.ne("profile","Trainer"));
		List<Staff> list =cr.list();
		return list;
		
}
//.....................................................................................  
    
}
