package com.arun.crudOperation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arun.crudOperation.DAO.DAO;
import com.arun.crudOperation.model.UserDTO;
@Controller
public class MyController {
	@Autowired
	private DAO dao;
	@RequestMapping("/link1")
	public String link1() {
		return "rsp1";
		
	}
	
	// READ
	@RequestMapping("/link2")
	public ModelAndView link2() {
		List<UserDTO> read = dao.read();
		System.out.println(read);
		return new ModelAndView("rsp2","user", read);
	}
	
	@RequestMapping("/registration")
	public String registration(@ModelAttribute UserDTO dto) { 
		dao.saveDTO(dto);
		return "rsp3";
	} 
	//Edit
	@RequestMapping(value="/Edit/{id}")
	public ModelAndView edit(@PathVariable int id) {
		UserDTO edit = dao.edit(id);
		System.out.println(edit);
		return new ModelAndView("rsp4","edit1", edit);
	}
	//update
	
	@RequestMapping(value="/sav")
	public String sav(@ModelAttribute UserDTO dto) {
		dao.update(dto);
		return"rsp5";
	}
	@RequestMapping(value="/delete/{id}")    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "rsp6";    
    }     
}
