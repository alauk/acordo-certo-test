package br.com.service.acordocerto.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.domain.acordocerto.repository.FormRepository;
import br.com.domain.acordocerto.entity.Form;

@Service
public class FormService {

	@Autowired
	private FormRepository formRepository;
	
	@PersistenceContext
	EntityManager entityManager;
	
    public void setFormRepository(FormRepository formRepository){
        this.formRepository=formRepository;
    }
	
	@Transactional
	public List<Form> getForms() {
		List<Form> forms = new ArrayList<>();
		try {
			forms = (List<Form>) formRepository.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
			forms = new ArrayList<>();
		}
		return forms;
	}
}
