package Thekiranacademy.TKAalpha.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Thekiranacademy.TKAalpha.entity.Staff;
import Thekiranacademy.TKAalpha.service.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	StaffService service;
	//1-.......Inserting Staff
	@PostMapping("addstaff")
	public String insertStaff(@RequestBody List<Staff> st) {
		return service.insertStaff(st);
		
	}
	//.........................................................
	
	//2...........updating.....Satff
	@PutMapping("/updatedstaff")
	public String updateStaff(@RequestBody Staff s) {
		return service.updateStaff(s);
	}
	//.........................................................
	//3.........getallstaff...................................
	@GetMapping("/getstaff")
	List<Staff> getstaff(){
		return service.getstaff();

}
	//4......getstaffbyids......................................................
	@GetMapping("/getid/{id}")
	  public List<Staff>getbyid(@PathVariable int id){
		return service.getbyid(id);
		}
	//5.........addsingle............................
	@PostMapping("/addbysingle")
	public String addSingleStaff(@RequestBody Staff s){
		return service.addSingleStaff(s);
		
	}
	//6...........getgt20000................................
	@GetMapping("/giveid")
	 public List<Staff> getGtid(){
		 return service.getGtid();	 
	 }
	//7..........getgetExperice()...............
	@GetMapping("/exper")
	public List<Staff> getExperice(){
		return service.getExperice();
		
	}
	
	//8................profileTrainer..........................
	@GetMapping("/gettrai")
	public List<Staff> getprofileTrainer(){
		return service.getprofileTrainer();
		
	}
	
	//9.....................
	@GetMapping("/getnottrain")
	public List<Staff> getProfileNotTrainer(){
		return service.getProfileNotTrainer();
	}
	//10..............................
	@GetMapping("/getmax")
	public List<Staff> getMaxsalary() {
		return service.getMaxsalary();
	}
}
