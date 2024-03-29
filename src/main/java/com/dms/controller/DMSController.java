package com.dms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class DMSController {
	@Autowired
	DoctorDAO dao;
@PostMapping("/PerformInsert")
public void performInsert(@RequestBody Doctor mov) {
	dao.save(mov);

}

@PutMapping("/PerformUpdate")
public void performUpdate(@RequestBody Doctor mov) {
dao.save(mov);

}
@DeleteMapping("/PeformDelete/{id}")
public void performDelete(@PathVariable("id")int id ) {
	dao.deleteById(id);
}

@GetMapping("/ViewAll")
public List<Doctor> getAllMovie(){
	Iterator<Doctor> it = dao.findAll().iterator();
	List<Doctor> list = new ArrayList<Doctor>();
	while(it.hasNext()) {
		list.add(it.next());
	}
	return list;
	
}
}
