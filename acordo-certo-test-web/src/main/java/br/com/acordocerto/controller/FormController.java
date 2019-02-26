package br.com.acordocerto.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.domain.acordocerto.entity.Form;
import br.com.service.acordocerto.service.FormService;

@Controller
@RequestMapping(value= {"/acordocerto"} )
public class FormController {

	@Autowired
	FormService formService;
	
	public FormController(FormService formService) {
		this.formService = formService;
	}
	
	@GetMapping("/form")
	public String carregaForm(){
		return "form";
	} 
	
	@PostMapping(
			value= {"/form"} , 
			headers = "Accept=application/json",
			produces = "application/json")
	public String enviaForm(@RequestBody Form form){
		
		return "form";
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Form>> get() {
		List<Form> forms;
		try {
			forms = formService.getForms();
		}
		catch (Exception e) {
			e.printStackTrace();
			forms = new ArrayList<>();
		}
	    return new ResponseEntity<List<Form>>(forms, HttpStatus.OK);
	}
}
