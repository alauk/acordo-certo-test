package br.com.domain.acordocerto.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.domain.acordocerto.entity.Form;

@Component
public class DbLineRunner implements CommandLineRunner {

	/*
	 * private FormRepository formRepository;
	 * 
	 * public DbLineRunner(FormRepository formRepository) { this.formRepository =
	 * formRepository; }
	 */
		
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Form form1 = new Form("Teste 1", 'F', "SP"); Form form2 = new Form("Teste 2",
		 * 'M', "RJ"); Form form3 = new Form("Teste 3", 'F', "MG");
		 * 
		 * List<Form> forms = new ArrayList<>(); forms.add(form1); forms.add(form2);
		 * forms.add(form3);
		 * 
		 * this.formRepository.save(forms);
		 */
	}
	
}
