package Thekiranacademy.TKAalpha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	@Id
	private int Staffid;
	private String name;
	private String profile;
	private String salary;
	private String experience;
	public int getStaffid() {
		return Staffid;
	}
	public void setStaffid(int staffid) {
		Staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Staff [Staffid=" + Staffid + ", name=" + name + ", profile=" + profile + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	
	
	
	

}
