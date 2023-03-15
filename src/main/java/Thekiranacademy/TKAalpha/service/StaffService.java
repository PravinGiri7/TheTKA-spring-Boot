package Thekiranacademy.TKAalpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Thekiranacademy.TKAalpha.dao.StaffDao;
import Thekiranacademy.TKAalpha.entity.Staff;

@Service
public class StaffService {
	@Autowired
	StaffDao dao;
	
	//...........insert.....................................
	public String insertStaff(List<Staff> st) {
		return dao.insertStaff(st);
	}
	//.........................................................
	
	//.............updated................................
	public String updateStaff(Staff s){
		return dao.updateStaff(s);
		
	}
	//.....................................................
	//.........getingSatff.....................
	public List<Staff> getstaff(){
		return dao.getstaff();
	}
	//................................................................
	//......getingbyid....................................
	public List<Staff> getbyid(int id){
		return dao.getbyid(id);
		
}
	//.......................................................................
	//......insertoneStaff.........................
	public String addSingleStaff(Staff s) {
		return dao.addSingleStaff(s);
		
	}
	//...........getbyid..............................
	public List<Staff> getGtid(){
		return dao.getGtid();
	}
	//...................getexperince.10-20....................
	 public List<Staff> getExperice(){
		 return dao.getExperice();
		
	}
	 //..................getprofiletrainer.........................
	public List<Staff> getprofileTrainer(){
		return dao.getprofileTrainer();
		 }
	//..............getbynottainer
	public List<Staff> getProfileNotTrainer(){
		return dao.getProfileNotTrainer();
		
	}

//....................getMaxsalary........................
	public List<Staff> getMaxsalary(){
		return dao.getMaxsalary();
		
		
	}
}
